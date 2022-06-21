import java.util.Scanner;

public class Bank1 {
    public static void operation(double moneyVar){
//        System.out.println("Ведіть суиу для погашення заборгованісті: ");
        double creditVar = 700;
        double borgVar = 0;
        double overpayVar = 0;
        double money = moneyVar;
        if (money > creditVar) {
            overpayVar = moneyVar - creditVar;
            System.out.println("Кредит сплачено");
            System.out.println("Сумма переплати становить: " +overpayVar+ " грн.");
        }
        if (money == creditVar){
            System.out.println("Кредит сплачено");
        }
        if (money < borgVar){
            borgVar = moneyVar - creditVar;
            System.out.println("Сума боргу складає: " + borgVar + " грн.");
        }
    }
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
            double money = in.nextDouble();
            operation(money);

        // знаю що помилка тут , але я незнаю як в метод  operation() вставить саме ввведене число через Сканер.
                        // і основне згідно умови я маю зробити цикл з 7 операцій і зробити оплату боргу  за 7 раз або менше
    }
}


//      +  1)Нам треба створити метод , котрий буде як аргумент приймає суму платежу (наприклад money) в результаті ми маємо ось , що отримати (public static void payment(double money))
//      +  2)Далі робимо зміні для: 1)Кредит. 2)Борг. 3)Переплата.
//      +  3)Наступним кроком нам варто зробити умову , котра буде робити таку дію: Якщо ваші гроші більші за кредит, то виводить повідомлення (наприклад переплата склала... грн )
//      + 4)Далі слід зробити так: Якщо гроші, які ви вносите, дорівнюватимуть кредиту, то виводимо повід+омлення (наприклад кредит погашено)
//      +  5)Далі слід зробити так: Якщо суму грошей було внесено менше, ніж борг, то виводимо повідомлення (наприклад заборгованість складає ... грн)
//      ?  6)Тоді переходимо до методу Main і викликаємо метод та передаємо йому значення.
