import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args)
    {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Getting a stream consisting of the
        // elements that are divisible by 5
        // Using Stream filter(Predicate predicate)
        list.stream()
            .filter(num -> num % 5 == 0)
            .forEach(System.out::println);
    }
}
