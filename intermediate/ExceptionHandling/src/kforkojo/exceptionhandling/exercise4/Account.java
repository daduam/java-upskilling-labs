package kforkojo.exceptionhandling.exercise4;

import java.math.BigDecimal;

public class Account {

    private String name;
    private BigDecimal balance;

    public Account(String name) throws NegativeBalanceException {
        this(name, BigDecimal.ZERO);
    }

    public Account(String name, BigDecimal balance) throws NegativeBalanceException {
        if (balance.compareTo(BigDecimal.ZERO) == -1) {
            throw new NegativeBalanceException("Cannot open an account with negative balance.");
        }

        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) throws NegativeBalanceException {
        if (amount.compareTo(BigDecimal.ZERO) == -1) {
            throw new NegativeBalanceException("Cannot deposit negative amount to account.");
        }

        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) throws InsufficientBalanceException {
        if (amount.compareTo(balance) == 1) {
            throw new InsufficientBalanceException("Account balance not enough to complete this transaction.");
        }

        balance = balance.subtract(amount);
    }

    @Override
    public String toString() {
        return this.getName() + " balance is " + this.getBalance() + " units.";
    }
}
