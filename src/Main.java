import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(generatePersons());

        Collections.sort(persons, new PersonsComparator(6));
        System.out.println(persons);
    }
    public static List<Person> generatePersons() {
        return List.of(new Person("Vova", "Ivanov", 80),
                new Person("Anna", "Sviridiva", 45),
                new Person("Zura", "Akopyn", 67));
    }
}