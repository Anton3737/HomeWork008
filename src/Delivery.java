import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("Введіть кількість клєнтів: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Факторіал з числа "+ in.nextInt() + " становить " + factorial(in.nextInt()));
        System.out.println("Факторіал з числа + Recurtion " + in.nextInt() + " становить " + factorialRecurtion(in.nextInt()));
    }
    public static int factorial(int N){
        int factor  = 1;
        int i = 1;
        do {
           factor = factor * i;  // через цикл do - while
           i++;
        }
        while (i <= N);
            return factor;

    }

    public static int factorialRecurtion(int n) {
        if (n <= 1)
            return 1;        // через Рекурсию
        else
            return n * factorialRecurtion(n-1);
    }
}
