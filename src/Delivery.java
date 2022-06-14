import java.util.Scanner;

public class Delivery {
        public static int Factor(int N) {
            int factorial = 1;
            int i = 1;                      // Розрахунок факторіалу
            do {
                factorial = factorial * i;
                i++;
            }while (i <= N);
            return factorial;
        }                                           // Звязка методу Factor з інтовим значенням ( де N ) число факторіалу
        public static void main(String[] args) {
            System.out.println("введіть кількість клієнтів: ");
            Scanner custVar = new Scanner(System.in);
             // Введення та виведення даних
            System.out.println("Існує " + Factor(custVar.nextInt()) + " маршрутів" + "для: "  + custVar.nextInt() +" клієнтів");
        }

    public static class Test1 {
        public static void main(String[] args) {
        int [] arrays = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        for(int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]);
            }
        }

        }
}

