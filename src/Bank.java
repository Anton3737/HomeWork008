import java.util.Scanner;

public class Bank {

    static int Sum(int monVar, int credVar){
        return credVar - monVar;
    }
    static int Pereplata(int pereplVar, int monVar ){
        pereplVar = 0;
        return monVar + pereplVar ;
    }
    public static void main(String[] args) {
        System.out.println("Введіть суму для погашення богу в розмірі 700 од.: ");
        Scanner in = new Scanner(System.in);
        int monVar = in.nextInt();
        int Sum;
        if (args.length <= 700){
            Sum = Sum( monVar, 700 );
            System.out.println("Введено суму коштів: " + in.nextInt()+ " залишок до виплати " + Sum);
        }
        else {

        }

    }

}
// System.out.println("Сума платежу складає: " + creditVar + " сума залишку кредиту до сплати складає: " + ostatokVar);