package bai_2.OOP;

import bai_2.*;

public class Account {

    public String id;
    public String name;
    public int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.print("Nap thanh cong " + amount + " Vao tai khoan " + name +".");
        } else {
            System.out.print("Tien la so nguyen duong.");
        }
    }

    public void debit(int amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("\n Thanh toan thanh cong " + amount + " Tu tai khoan cua " + name + ".");
            } else {
                System.out.println("Thanh toan that bai, so du khong du.");
            }
        } else {
            System.out.println("Tien la so nguyen duong.");
        }
    }

    public void transferTo(Account account, int amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                account.credit(amount);
                System.out.println("\n Chuyen thanh cong " + amount + " tai khoan cua " + name + " den tai khoan " + account.getName() + ".");
            } else {
                System.out.println("Chuyen tien khong thanh cong, so du khong du.");
            }
        } else {
            System.out.println("So tien la so nguyen duong.");
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public void display()  {
        System.out.println("Tai khoan ID: " + id + ",Ten : " + name + ", So du: " + balance);
    }
}
