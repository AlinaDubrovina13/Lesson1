//Циклический оператор While
import java.util.ArrayList;
import java.util.List;

public class homework4_2 {
    public static void main(String[] args) {
        // Заполняем List числами от 1 до 10
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // 1. Выводим числа от 1 до 10 с помощью while
        System.out.println("Числа от 1 до 10:");
        int index = 0;
        while (index < numbers.size()) {
            System.out.print(numbers.get(index) + " ");
            index++;
        }
        System.out.println();

        // 2. Выводим числа от 10 до 1 с помощью while
        System.out.println("\nЧисла от 10 до 1:");
        int reverseIndex = numbers.size() - 1;
        while (reverseIndex >= 0) {
            System.out.print(numbers.get(reverseIndex) + " ");
            reverseIndex--;
        }
        System.out.println();

        // 3. Находим сумму всех значений списка с помощью while
        int sum = 0;
        int sumIndex = 0;
        while (sumIndex < numbers.size()) {
            sum += numbers.get(sumIndex);
            sumIndex++;
        }
        System.out.println("\nСумма всех чисел в списке: " + sum);
    }
}
//Для вывода от 1 до 10 используем индекс, который увеличивается (index++), пока не достигнет размера списка.
//Для вывода от 10 до 1 начинаем с последнего индекса (numbers.size() - 1) и уменьшаем его (reverseIndex--), пока не дойдём до 0.
//Для суммы проходим по всем элементам списка через индекс и на каждой итерации прибавляем текущий элемент (numbers.get(sumIndex))
// к переменной sum.