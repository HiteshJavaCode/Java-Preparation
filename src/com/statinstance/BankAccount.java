package com.statinstance;

public class BankAccount {
    public String accountNumber;
    public int balance;

    public BankAccount(String accountNumber, int balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void addMoney(int money)
    {
        balance = balance+money;
        System.out.println("Updated Account Balance for Account Number --->" + accountNumber + "  is --->" + balance);
    }
    public void withdrawMoney(int money)
    {
        if(money>balance) {
            System.out.println("Insufficient Account Balance for Account Number --->" + accountNumber + "  is --->" + balance);
        }
        else {
            balance = balance - money;
            System.out.println("Updated Account Balance for Account Number --->" + accountNumber + "  is --->" + balance);
        }
    }

    public static void main(String[] Args)
    {
BankAccount obj1 = new BankAccount("Account-8296",10000);
BankAccount obj2 = new BankAccount("Account-8074",-10000);
obj1.addMoney(2000);
obj2.addMoney(23000);
        obj1.withdrawMoney(2000);
        obj2.withdrawMoney(3000);
        obj2.withdrawMoney(33000);
    }

}
