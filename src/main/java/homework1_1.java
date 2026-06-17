//Примитивные типы данных

public class homework1_1 {
    public static void main(String[] args) {
        byte a = 100;
        short b = 1000;
        int c = 100000;
        long d = 10000000000L;
        float e = 3.14f;
        double f = 3.14159265358979;
        char g = 'A';
        boolean h = true;

        System.out.println("byte: " + a + " (целое число, 1 байт, диапазон -128..127)");
        System.out.println("short: " + b + " (целое число, 2 байта, диапазон -32768..32767)");
        System.out.println("int: " + c + " (целое число, 4 байта)");
        System.out.println("long: " + d + " (целое число, 8 байт, требует суффикс L)");
        System.out.println("float: " + e + " (вещественное число, 4 байта, требует суффикс f)");
        System.out.println("double: " + f + " (вещественное число, 8 байт, точность выше)");
        System.out.println("char: " + g + " (один символ Unicode, 2 байта)");
        System.out.println("boolean: " + h + " (логическое значение true/false)");
    }
}

