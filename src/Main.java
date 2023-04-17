
public class Main {
    public static void main(String[] args) {
        int clientAccount = 1000;
        int depositAmount = 2000;

        int amount = (clientAccount + depositAmount);

        int bonus = (amount - 1000) / 100;

        if (amount > 1000) {
            bonus = amount / 100;
            if (amount < 1000) {
                bonus = 0;
            }
        }
        System.out.println("Итого на счету: " + amount);
        System.out.println("Бонус: " + bonus);

    }

}