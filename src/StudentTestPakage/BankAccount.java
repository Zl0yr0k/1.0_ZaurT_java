package StudentTestPakage;

import java.util.Scanner;

public class BankAccount {


    float startAccount() {
        float money = 0;
        System.out.println("ВВеди сумму на которую нужно пополнить аккаунт");
        return money = new Scanner(System.in).nextInt();

    }

    float replenishmentAccount(float money) {
        System.out.println("ВВеди сумму на которую нужно увеличить аккаунт");
        float moneyadd = new Scanner(System.in).nextInt();
        return money += moneyadd;
    }

    float removeAccount(float money) {
        System.out.println("ВВеди сумму на которую нужно уменьшить аккаунт");
        float moneydel = new Scanner(System.in).nextInt();
        return money -= moneydel;

    }

    void showInfo(float money) {
        System.out.println(money);
    }
}

