import java.util.HashMap;
import java.util.Map;

public class homework3_3 {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Яблоко", 90);
        fruitPrices.put("Банан", 60);
        fruitPrices.put("Апельсин", 120);
        fruitPrices.put("Виноград", 250);
        fruitPrices.put("Груша", 110);
        fruitPrices.put("Манго", 300);

        // Вывод всего словаря через entrySet()
        System.out.println("Цены на фрукты:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " руб.");
        }

        // Получение цены конкретного фрукта по ключу
        System.out.println("\nЦена яблока: " + fruitPrices.get("Яблоко") + " руб.");

        // Проверка наличия ключа
        System.out.println("Есть ли в магазине киви? " + fruitPrices.containsKey("Киви"));

        // Общее количество фруктов в словаре
        System.out.println("Всего видов фруктов: " + fruitPrices.size());
    }
}
//Map<String, Integer> — это структура данных, которая хранит пары "ключ-значение". В нашем случае:
//Ключ (String) — название фрукта
//Значение (Integer) — его цена в рублях