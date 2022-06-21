import java.util.Scanner;
public class Bank {
    public static void operation(double money) {
        double creditVar = 700;

        if (money > creditVar) {
            double overpayVar = creditVar - money;
            System.out.println("Кредит сплачено");
            System.out.println("Сума переплати становить: " + overpayVar + " грн.");
        }
        if (money == creditVar) {
            System.out.println("Кредит сплачено");
        }
        if (money < creditVar) {
            double borgVar = creditVar - money;
            System.out.println("Сума заборгованості складає: " + borgVar + " грн.");
            }
        }
    public static void main(String[] args) {
           System.out.println("Ведіть суму для погашення заборгованісті: ");
           Scanner in = new Scanner(System.in);
           double money = in.nextDouble();
        operation(money);
    }
}
