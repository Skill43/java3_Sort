import java.util.ArrayList;
import java.util.List;

public class RemEvenNum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println("Список: "+ numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Нечетные числа из списка: "+ numbers);
    }
}
