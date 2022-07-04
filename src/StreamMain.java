import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    private static List<Integer> listOfNumbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    public static void main(String[] args) {
        listOfNumbers.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
