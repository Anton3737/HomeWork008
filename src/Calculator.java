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
        System.out.println(del1(a));
        System.out.println(del2(b));
        System.out.println(del3(c));

    }
        static double del1(double a) {
        double one = a / 5;
        return one;
        }
        static double del2(double b) {
        double two = b / 5;
        return two;
        }
         static double del3(double c) {
        double three = c / 5;
        return three;
    }

    // також можна рішить через масив
//        int one = a / 5;                                // Введенні інтові числа діляться на 5
//        int two = b / 5;                                // Введенні інтові числа діляться на 5
//        int three = c / 5;
//
//        int[] mass = {one, two, three};             // формування масиву на основі розрахунків
//        for (int i = 0; i < mass.length; i++) {    // перебор масиву
//            System.out.println(mass[i]);          // вивід масиву в консоль розрахунку
//        }
//    }
}