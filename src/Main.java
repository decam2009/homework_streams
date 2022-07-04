import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
    public static List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
    private static Collection<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10_000_000; i++) {
            persons.add(
                    new Person(
                            names.get(new Random().nextInt(names.size())),
                            families.get(new Random().nextInt(families.size())),
                            new Random().nextInt(100),
                            Sex.values()[new Random().nextInt(Sex.values().length)],
                            Education.values()[new Random().nextInt(Education.values().length)]));
        }

        Long ageLess18 = persons.stream()
                .filter(person -> person.getAge()  < 18 )
                .count();

        List <String> inTheArmy= persons.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 27)
                .map(Person::getFamily)
                .collect(Collectors.toList());

        List<Person> higherEducation = persons.stream()
                .filter(person -> person.getEducation().equals(Education.HIGHER))
                .sorted(Comparator.comparing(Person::getFamily)).toList();
    }
}
