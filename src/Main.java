import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(generatePersons());

        persons.removeIf(person -> person.getAge() < 18);

        System.out.println(persons);
    }
    public static List<Person> generatePersons() {
        return List.of(new Person("Vova", "Ivanov", 80),
                new Person("Anna", "Sviridiva", 45),
                new Person("Zura", "Akopyn", 67),
                new Person("Gof", "Akopyn", 13),
                new Person("Miuf", "Koode", 15));
    }
}