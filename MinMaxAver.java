import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxAver{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(17);
        numbers.add(6);
        numbers.add(19);
        numbers.add(2);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        double avg = numbers.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }
}
