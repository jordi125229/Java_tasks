package task123;

public class ReportTest {
    public static void main(String[] args) {
        Report reportTest = new Report();
        Integer reportTextTest = reportTest.textLength.apply("java start ");
        System.out.println(reportTextTest);

        Integer reportTextTest2 = reportTest.letters.apply("java start ");
        System.out.println(reportTextTest2);
    }
}
