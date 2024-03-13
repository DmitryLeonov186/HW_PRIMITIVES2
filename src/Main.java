public class Main {
    public static void main(String[] args) {
        int balance = 500;
        // Количество денег на счету клиента

        int amount = 1100;
        // Сумма пополнения счета в рублях

        int totalBalance = balance + amount;
        // Итоговый баланс

        int bonusRuble = amount / 100;
        // 1 бонусный рубль

        int bonusBalance = 0;
        // Бонусный баланс

        int totalBonusBalance = bonusBalance + bonusRuble;
        // Итоговый бонусный баланс

        if (amount > 1000 == true) {
            System.out.println("На счете " + totalBalance + " Рублей." + " Количество бонусный рублей " + totalBonusBalance);
        } else {
            System.out.println("На счете " + totalBalance + " Рублей." + " Количество бонусный рублей " + bonusBalance);
        }

    }
}
