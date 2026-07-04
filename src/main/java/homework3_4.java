//Задача 4* (со звёздочкой): массив случайных чисел и сумма
import java.util.Random;

public class homework3_4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Заполняем массив случайными числами от 0 до 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Выводим массив
        System.out.print("Массив чисел: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Считаем сумму классическим способом
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов: " + sum);

        // Альтернативный способ через Stream API (более "продвинутый")
        int sumViaStream = java.util.Arrays.stream(numbers).sum();
        System.out.println("Сумма через Stream API: " + sumViaStream);
    }
}
// Используется класс Random для генерации случайных чисел.
// Метод nextInt(100) генерирует число от 0 (включительно) до 100 (не включая).
// Сумму можно посчитать либо обычным циклом, либо через Stream API