package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(10000);
        System.out.println(account.balance);

        account.withdraw(9000);
        System.out.println(account.balance);

        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);

    }
}
