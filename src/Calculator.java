import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Введіть перше ціле число: ");
        int a = numbers.nextInt();
        System.out.println("Введіть друге ціле число: ");           // Введення 3х інтових чисел
        int b = numbers.nextInt();
        System.out.println("Введіть третє ціле число: ");
        int c = numbers.nextInt();

        int one = a/5;
        int two = b/5;                                // Введенні інтові числа діляться на 5
        int three = c/5;

        int[] mass = {one, two, three};             // формування масиву на основі розрахунків
        for (int i = 0; i < mass.length; i++) {    // перебор масиву
            System.out.println(mass[i]);          // вивід масиву в консоль розрахунку із рядів 14-16
        }
    }
}

