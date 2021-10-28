public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int added = 1100;


        boolean bonus = (added >= 1000);

        int rubles;
        if (added >= 1000) {
            rubles = 1;
        } else {
            rubles = 0;
        }
        int quantityPoints = added / 100 * rubles;
        int totalSum = balance + added;

        System.out.println("Итоговый баланс:" + totalSum);
        System.out.println("Бонусные рубли:" + quantityPoints);


    }
}
