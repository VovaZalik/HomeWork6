import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    int maxSurname;
    public PersonsComparator(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() > maxSurname && o2.getSurname().length() > maxSurname) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        else return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
    }
}
