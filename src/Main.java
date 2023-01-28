public class Main {
    public static void main(String[] args) {
        int phoneBill = 500;
        int deposit = 1500;
        int bonusMin = 1;
        int bonusFactor = 100;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / bonusFactor * bonusMin;
        } else {
            bonus = 0;
        }
        int FinalBill = phoneBill + deposit + bonus;

        System.out.println("Итоговая сумма на счету: " + FinalBill + " руб.");
        System.out.println("В том числе бонусов: " + bonus + " руб.");
    }
}