import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Integer> baseArrray = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    private static List<Integer> fileredArray = new ArrayList<>();
    public static void main(String[] args) {
        for (Integer x : baseArrray) {
            if (x > 0 && x % 2 == 0){
                fileredArray.add(x);
            }
        }
        fileredArray.sort(Integer::compareTo);
        System.out.println(fileredArray);
    }
}
