import generator.HoldingGenerator;
import model.*;
import model.Currency;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Exercises {

    private static final List<Holding> holdings = new HoldingGenerator().generate();

    public static void main(String[] args) {
        System.out.println(getHoldingsWhereAreCompanies());
        System.out.println(getHoldingNames());
        System.out.println(getHoldingNamesAsString());
        System.out.println(getCompaniesAmount());
        System.out.println(getAllUserAmount());
        System.out.println(getAllCompaniesNamesAsLinkedList());
        System.out.println(getCurenciesSet());
        System.out.println(getUserNames());
        Set<String> firstNCompany = getFirstNCompany(4);
        System.out.println(firstNCompany);
        System.out.println(getUser(user -> user.getFirstName().equals("Adam")));
        User user = getUser("Kowalski");
        BigDecimal userAmountInPLN = getUserAmountInPLN(user);
        System.out.println(userAmountInPLN);
        Optional<User> richestWoman = getRichestWoman();
        System.out.println(richestWoman);
        System.out.println(user);
        System.out.println(getUserAmountInPLN(user));
        System.out.println(getUsersForPredicate(u -> u.getFirstName().equals("Adam")));
        Account account = getAccoutStream().filter(a -> a.getNumber().equals("2346")).findFirst().orElseThrow();
        System.out.println(getAccountAmountInPLN(account));
        Map<String, List<User>> userPerCompany = getUserPerCompany();
        List<User> fanta = userPerCompany.get("Fanta");
        System.out.println(fanta);
        Map<String, Account> accountsMap = createAccountsMap();
        System.out.println(accountsMap);
        showAllUser();
        executeForEachCompany(c -> System.out.println(c.getName()));
    }

    private static User getUser(String lastName) {
        return getUserStream().filter(u -> u.getLastName().equals(lastName)).findFirst().orElseThrow();
    }

    /**
     * Napisz metodę, która zwróci liczbę holdingów, w których jest przynajmniej jedna firma.
     */
    public static long getHoldingsWhereAreCompanies() {
        return holdings.stream().filter(h -> !h.getCompanies().isEmpty()).count();
    }

    /**
     * Napisz metodę, która zwróci nazwy wszystkich holdingów pisane z wielkiej litery w formie listy.
     */
    public static List<String> getHoldingNames() {
        return holdings.stream().map(h -> h.getName().toUpperCase()).toList();
    }

    /**
     * Zwraca nazwy wszystkich holdingów sklejone w jeden string i posortowane.
     * String ma postać: (Coca-Cola, Nestle, Pepsico)
     */
    public static String getHoldingNamesAsString() {
        return holdings.stream().map(h -> h.getName()).sorted().collect(Collectors.joining(", ", "(", ")"));
    }

    /**
     * Zwraca liczbę firm we wszystkich holdingach.
     */
    public static long getCompaniesAmount() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).count();
    }

    /**
     * Zwraca liczbę wszystkich pracowników we wszystkich firmach.
     */
    public static long getAllUserAmount() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream().flatMap(c -> c.getUsers().stream())).count();
    }

    /**
     * Zwraca listę wszystkich firm jako listę, której implementacja to LinkedList. Obiektów nie przepisujemy
     * po zakończeniu działania strumienia.
     */
    public static LinkedList<String> getAllCompaniesNamesAsLinkedList() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).map(c -> c.getName()).collect(Collectors.toCollection(() -> new LinkedList<>()));
    }

    /**
     * Przelicza kwotę na rachunku na złotówki za pomocą kursu określonego w enum Currency.
     */
    public static BigDecimal getAccountAmountInPLN(Account account) {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream())
                .flatMap(u -> u.getAccounts().stream()).filter(a -> a.equals(account)).findFirst()
                .map(a -> a.getAmount().multiply(BigDecimal.valueOf(a.getCurrency().rate)))
                .orElse(BigDecimal.ZERO);
    }

    /**
     * Zwraca imiona użytkowników w formie zbioru, którzy spełniają podany warunek.
     */
    public static Set<String> getUsersForPredicate(final Predicate<User> userPredicate) {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream()).filter(userPredicate)
                .map(u -> u.getFirstName()).collect(Collectors.toSet());
    }

    /**
     * Dla każdej firmy uruchamia przekazaną metodę.
     */
    public static void executeForEachCompany(Consumer<Company> consumer) {
        holdings.stream().flatMap(h -> h.getCompanies().stream()).forEach(consumer);
    }

    /**
     * Wyszukuje najbogatsza kobietę i zwraca ją. Metoda musi uzwględniać to że rachunki są w różnych walutach.
     */
    //pomoc w rozwiązaniu problemu w zadaniu: https://stackoverflow.com/a/55052733/9360524
    public static Optional<User> getRichestWoman() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream()).collect(Collectors.toSet())
                .stream().filter(u -> u.getSex() == Sex.WOMAN).max(Comparator.comparing(u -> getUserAmountInPLN(u)));
    }

    private static BigDecimal getUserAmountInPLN(final User user) {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream()
                .filter(u -> u.equals(user))).flatMap(a -> a.getAccounts().stream()).findFirst().map(a -> a.getAmount()
                .multiply(BigDecimal.valueOf(a.getCurrency().rate))).orElse(BigDecimal.ZERO);
    }

    /**
     * Zwraca nazwy pierwszych N firm. Kolejność nie ma znaczenia.
     */
    private static Set<String> getFirstNCompany(final int n) {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).map(c -> c.getName())
                .limit(n).collect(Collectors.toSet());
    }

    /**
     * Zwraca mapę firm, gdzie kluczem jest jej nazwa a wartością lista pracowników.
     */
    public static Map<String, List<User>> getUserPerCompany() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).collect(Collectors
                .toMap(c -> c.getName(), c -> c.getUsers()));
    }

    /**
     * Zwraca pierwszego z brzegu użytkownika dla podanego warunku. W przypadku kiedy nie znajdzie użytkownika, wyrzuca
     * wyjątek IllegalArgumentException.
     */
    public static User getUser(final Predicate<User> predicate) {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream())
                .filter(predicate).findFirst().orElseThrow(() -> new IllegalArgumentException("Can't find user"));
    }

    /**
     * Zwraca mapę rachunków, gdzie kluczem jest numer rachunku, a wartością ten rachunek.
     */
    public static Map<String, Account> createAccountsMap() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream())
                .flatMap(u -> u.getAccounts().stream()).collect(Collectors.toMap(a -> a.getNumber(), a -> a));
    }

    /**
     * Zwraca listę wszystkich imion w postaci Stringa, gdzie imiona oddzielone są spacją i nie zawierają powtórzeń.
     */
    public static String getUserNames() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream())
                .map(u -> u.getFirstName()).distinct().sorted().collect(Collectors.joining(" "));
    }

    /**
     * Metoda wypisuje na ekranie wszystkich użytkowników (imię, nazwisko) posortowanych od z do a.
     * Zosia Psikuta, Zenon Kucowski, Zenek Jawowy ... Alfred Pasibrzuch, Adam Wojcik
     */
    public static void showAllUser() {
        holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream())
                .sorted((u1, u2) -> {
                    String fullName1 = u1.getFirstName() + u1.getLastName();
                    String fullName2 = u2.getFirstName() + u2.getLastName();
                    return fullName2.compareTo(fullName1);
                }).forEach(u -> System.out.println(u.getFirstName() + " " + u.getLastName()));
    }

    /**
     * Zwraca zbiór walut w jakich są rachunki.
     */
    public static Set<Currency> getCurenciesSet() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream())
                .flatMap(u -> u.getAccounts().stream()).map(a -> a.getCurrency()).collect(Collectors.toSet());
    }

    /**
     * Zwraca strumień wszystkich firm.
     */
    private static Stream<Company> getCompanyStream() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream());
    }

    /**
     * Tworzy strumień użytkowników.
     */
    private static Stream<User> getUserStream() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream());
    }

    /**
     * Tworzy strumień rachunków.
     */
    private static Stream<Account> getAccoutStream() {
        return holdings.stream().flatMap(h -> h.getCompanies().stream()).flatMap(c -> c.getUsers().stream())
                .flatMap(u -> u.getAccounts().stream());
    }
}
