package com.kforkojo.exceptionhandling.exercise4;

import java.math.BigDecimal;

public class Exercise4 {

    public static void main(String[] args) {
        try {
            Account account = new Account("Yoda", BigDecimal.valueOf(42));

            System.out.println("Deposit: 8 units");
            account.deposit(BigDecimal.valueOf(8));
            System.out.println(account);

            try {
                System.out.println("Withdraw: 51 units");
                account.withdraw(BigDecimal.valueOf(51));
                System.out.println(account);
            } catch (InsufficientBalanceException ex) {
                System.out.println("Transaction Error: " + ex.getMessage());
            }
        } catch (NegativeBalanceException ex) {
            System.out.println("Transaction Error: " + ex.getMessage());
        }
    }
}
