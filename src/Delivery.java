import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("Введіть кількість клєнтів: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Факторіал з числа "+ in.nextInt() + " становить " + factorial(in.nextInt()));
    }
    public static int factorial(int N){
        int factor  = 1;
        int i = 1;
        do {
           factor = factor * i;
           ++i;
        }
        while (i <= N);
            return factor;
    }
}
