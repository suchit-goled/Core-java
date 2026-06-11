package com.suchit.principles.abs;



public interface BankAccount {

    void deposit();

    String accountHolder();

    int branchCode();

    boolean isActive();

    char accountGrade();

    long accountNumber();

    float interestRate();

    double balance();

    byte accountLevel();

    short minimumBalance();

    AccountType getAccountType();

    Bank bank();

    Customer customer();

    Notifications notifications();
}