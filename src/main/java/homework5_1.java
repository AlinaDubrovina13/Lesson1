//Оператор Switch
//Написать программу, которая выводит, к какому времени года относится месяц
import java.util.Scanner;

public class homework5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Некорректный номер месяца";
                break;
        }

        System.out.println("Месяц " + month + " относится к сезону: " + season);

        scanner.close();
    }
}
//switch (month) проверяет значение переменной month и сравнивает его с каждым case.
//Несколько case подряд без break между ними (например, case 12: и case 1: и case 2:)
// означают, что все они ведут к одному и тому же результату — это называется "проваливание" (fall-through)
// и специально используется здесь, чтобы не дублировать код.
//break после присвоения значения переменной season останавливает выполнение switch, чтобы не проверять остальные case.
//default срабатывает, если введённое число не попадает ни в один из диапазонов (например, 0 или 13)
// — это защита от некорректного ввода.