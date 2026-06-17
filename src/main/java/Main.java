// Lesson_1
// Работа с примитивными типами данных в Java:
//1. Объявить переменные всех 8 примитивных типов и присвоить им любые значения.
//
//2. Вывести их в консоль с пояснением типа данных.
//
//Приведение типов данных в Java
//1. Объяви переменные:
//byte b = 10;
//int i;
//double d;
//Присвой b переменной i, затем i переменной d
//Выведи все три переменные.
public class Main {
    public static void main(String[] args) {
        byte b= 10; // диапазон: -128 до 127
        int i=b;
        double d=i;
        System.out.println(b);
        System.out.println(i);
        System.out.println(d);

//Объяви переменные:
//double doubleValue = 9.78;
//int intValue = (int) doubleValue;
//
//Выведи обе переменные и поясни, что произошло.

        double doubleValue = 9.78;
        int intValue = (int) doubleValue;

        System.out.println("doubleValue = " + doubleValue);
        System.out.println("intValue = " + intValue);
    }
}
// при приведении double к int дробная часть просто отбрасывается (не округляется!).
// То есть 9.78 превращается в 9, а не в 10.
// Если бы число было отрицательным, например -9.78,
// результат был бы -9 (отбрасывание в сторону нуля).