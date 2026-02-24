package task3;

import java.util.List;

import static task3.EmailReduction.emailReduction;

class Test {
    public static void main(String[] args) {
        List<String> emails = List.of("jakub.nowak@gmail.com", "jakub.nowak@gmail.com", "adam.zawadzki@wp.pl", "michal.pawlak@wp.pl");
        int emailsCount = emailReduction(emails);
        System.out.println(emailsCount);
    }
}
