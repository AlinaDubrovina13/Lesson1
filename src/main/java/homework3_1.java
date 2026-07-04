//Задача 1: List<String> с любимыми фильмами
import java.util.ArrayList;
import java.util.List;
    public class homework3_1 {
        public static void main(String[] args) {
            List<String> favoriteMovies = new ArrayList<>();
            favoriteMovies.add("Бешеные псы");
            favoriteMovies.add("Побег из Шоушенка");
            favoriteMovies.add("Таксист");
            favoriteMovies.add("Крестный отец");
            favoriteMovies.add("Интерстеллар");
            favoriteMovies.add("Форрест Гамп");
            favoriteMovies.add("Криминальное чтиво");
            favoriteMovies.add("Кто стучится в мою дверь");

            System.out.println("Список любимых фильмов:");
            System.out.println(favoriteMovies);

            // Или красивый вывод построчно
            System.out.println("\nПострочный вывод:");
            for (String movie : favoriteMovies) {
                System.out.println("- " + movie);
            }
        }
    }

