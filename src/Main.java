import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/resources/banner.txt");
        if (file.exists()) {
            System.out.println("file exist");
        }

//        catalogCreator("new_system");
//        catalogCreator("new_system/reports");
//        catalogCreator("new_system/backup");

//        Files.copy(Path.of("old_data/config.ini"), Path.of("new_system/backup")
//                , StandardCopyOption.REPLACE_EXISTING);

        newUsersReportSaving();
        systemErrorsSaving();
        hidingPrivateData();
    }

    private static void newUsersReportSaving() {
        String banner;
        try {
            banner = Files.readString(Path.of("src/resources/banner.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Błąd podczas wczytywania banner.txt", e);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("old_data/users.csv", StandardCharsets.UTF_8));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("new_system/reports/active_users.txt", StandardCharsets.UTF_8))
        ) {
            bufferedWriter.write(banner);
            bufferedWriter.newLine();
            String line;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().isEmpty() && !line.trim().startsWith("#") && !line.trim().startsWith("//") && !line.trim().startsWith("--")) {
                    String[] csv = line.split(",");
                    if (csv[3].equalsIgnoreCase("active")) {
                        System.out.println(lineNumber + ": " + csv[1] + " , " + csv[2]);
                        bufferedWriter.write(csv[1].trim());
                        bufferedWriter.newLine();
                    }
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void systemErrorsSaving() {
        Path input = Paths.get("old_data/system.log");
        Path output = Paths.get("new_system/reports/errors_system.log");
        try (Stream<String> lines = Files.lines(input, StandardCharsets.UTF_8)) {
            List<String> error = lines.filter(l -> l.contains("ERROR")).toList();
            Files.write(output, error);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void catalogCreator(String name) {
        try {
            Files.createDirectories(Path.of(name));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void hidingPrivateData() {
        Path input = Paths.get("old_data/system.log");
        Path output = Paths.get("new_system/reports/system_sanitized.log");
        Pattern emailPattern = Pattern.compile("([a-zA-Z0-9._%+-])([a-zA-Z0-9._%+-]*)(@[^ ]+)"); //AI
        Pattern idPattern = Pattern.compile("id=\\d+");
        try (Stream<String> lines = Files.lines(input, StandardCharsets.UTF_8)) {
            List<String> hide = lines.map(l -> {
                Matcher matcher = emailPattern.matcher(l);
                String hided = matcher.replaceAll(match ->
                        match.group(1) + "***" + match.group(3)
                );
                hided = idPattern.matcher(hided).replaceAll("id=***");
                return hided;
            }).toList();
            Files.write(output, hide, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

