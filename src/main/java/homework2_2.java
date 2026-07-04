// 2. Преобразование String в Double, Integer, Long
public class homework2_2 {
    public static void main(String[] args) {
        String str = "276";

        // Преобразование в Double
        Double doubleValue = Double.parseDouble(str);
        System.out.println("Double: " + doubleValue);

        // Преобразование в Integer
        Integer integerValue = Integer.parseInt(str);
        System.out.println("Integer: " + integerValue);

        // Преобразование в Long
        Long longValue = Long.parseLong(str);
        System.out.println("Long: " + longValue);
    }
}
