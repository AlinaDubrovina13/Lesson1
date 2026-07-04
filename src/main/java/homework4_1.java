//Условные операторы if-else: проверка возраста
import java.util.Scanner;

public class homework4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Доступ запрещен");
        } else if (age <= 60) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Вы в зоне риска");
        }

        scanner.close();
    }
}
//Первое условие age < 18 отсекает всех несовершеннолетних.
//Второе условие age <= 60 (проверяется только если первое было false, то есть возраст уже точно >= 18)
// — значит диапазон "от 18 до 60" получается автоматически.
//else срабатывает, когда оба условия выше не выполнились — значит возраст больше 60.