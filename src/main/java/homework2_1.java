// 1.Операторы сравнения и логические
public class homework2_1
    {public static void main(String[] args) {
        int age = 25;
        boolean hasTicket = true;
        boolean canEnter = age >= 18 && hasTicket;
        System.out.println("Can enter: " + canEnter);

        // Проверка с hasTicket = false
        boolean hasTicket2 = false;
        boolean canEnter2 = age >= 18 && hasTicket2;
        System.out.println("Can enter (hasTicket=false, &&): " + canEnter2);

        // Меняем && на ||
        boolean canEnterOr = age >= 18 || hasTicket2;
        System.out.println("Can enter (hasTicket=false, ||): " + canEnterOr);
}
}
// С && (логическое И): результат canEnter станет false, потому что && требует,
// чтобы оба условия были истинны.
// Даже если возраст подходит (25 >= 18 = true), но билета нет (false), итог — false.
//Если заменить на || (логическое ИЛИ): результат останется true,
// потому что || требует истинности хотя бы одного условия.
// Возраст подходит (true), значит весь результат — true, даже без билета.

