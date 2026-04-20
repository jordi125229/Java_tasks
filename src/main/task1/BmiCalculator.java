package main.task1;

public class BmiCalculator {

    public double calculateBmi(double weight, double height) {
        // BUG: brakuje potęgowania wzrostu!
        double bmi = weight / height;
        return Math.round(bmi * 100.0) / 100.0;
    }

    public String getCategory(double bmi) {
        if (bmi < 18.5) {
            return "Niedowaga";
        } else if (bmi < 25.0) {
            return "Norma";
        } else if (bmi < 30.0) {
            return "Nadwaga";
        } else {
            return "Otyłość";
        }
    }

    public String diagnose(String name, double weight, double height) {
        double bmi = calculateBmi(weight, height);
        String category = getCategory(bmi);
        return name + ": waga=" + weight + " kg, wzrost=" + height
                + " m, BMI=" + bmi + " → " + category;
    }

    public static void main(String[] args) {
        BmiCalculator calc = new BmiCalculator();

        // Osoba 1: oczekiwane BMI = 70 / (1.75 * 1.75) = 22.86 → Norma
        System.out.println(calc.diagnose("Anna", 70.0, 1.75));

        // Osoba 2: oczekiwane BMI = 90 / (1.80 * 1.80) = 27.78 → Nadwaga
        System.out.println(calc.diagnose("Bartek", 90.0, 1.80));

        // Osoba 3: oczekiwane BMI = 55 / (1.70 * 1.70) = 19.03 → Norma
        System.out.println(calc.diagnose("Celina", 55.0, 1.70));
    }
}
