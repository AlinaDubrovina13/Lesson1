//Задача 2: Set<Student>
//Для корректной работы Set со студентами важно переопределить методы equals()
// и hashCode() — именно по ним Set определяет, являются ли объекты дубликатами.
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class homework3_2 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Иван", 20));
        students.add(new Student("Мария", 21));
        students.add(new Student("Петр", 22));
        students.add(new Student("Анна", 23));
        students.add(new Student("Иван", 20)); // повторное добавление того же студента

        System.out.println("Set студентов:");
        System.out.println(students);
        System.out.println("Количество элементов в Set: " + students.size());
    }
}
//Добавлено в Set 5 студентов,
// но один из них ("Иван", 20 лет) был добавлен дважды.
// В итоге в коллекции оказалось всего 4 элемента, а не 5.
//Это произошло потому, что Set — это коллекция уникальных элементов, которая не допускает дубликатов.
// Когда я пыталась добавить второго "Ивана", HashSet вызвал методы hashCode() и equals(),
// чтобы проверить, есть ли уже такой объект в коллекции:
// Сначала сравниваются хэш-коды объектов (hashCode()) — если они совпадают,
// значит объекты могут быть равны.Затем вызывается equals(), чтобы точно убедиться,
// что объекты действительно одинаковые (по имени и возрасту).