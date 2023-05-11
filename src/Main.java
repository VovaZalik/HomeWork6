import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(generatePersons());

        Collections.sort(persons, (o1, o2) -> {
            if (o1.getSurname().length() > 6 && o2.getSurname().length() > 6) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            else return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
        });

        System.out.println(persons);
    }
    public static List<Person> generatePersons() {
        return List.of(new Person("Vova", "Ivanov", 80),
                new Person("Anna", "Sviridiva", 45),
                new Person("Zura", "Akopyn", 67));
    }
}