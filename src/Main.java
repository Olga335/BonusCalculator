public class Main {
    public static void main(String[] args) {

        // Входные данные
        int currentBalance = 100;   // текущая сумма на счету клиента
        int topUpAmount = 1100;     // сумма пополнения

        // Параметры бонусной программы
        int bonusThreshold = 1000;  // порог пополнения, свыше которого начисляется бонус
        int rublesPerBonus = 100;   // рублей пополнения за 1 бонусный рубль

        int bonus;
        if (topUpAmount > bonusThreshold) {
            // Бонус: 1 рубль за каждые полные 100 рублей пополнения
            bonus = topUpAmount / rublesPerBonus;
        } else {
            // Пополнение не превысило порог — бонуса нет
            bonus = 0;
        }

        int finalBalance = currentBalance + topUpAmount + bonus;

        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговая сумма на счету: " + finalBalance);
    }
}