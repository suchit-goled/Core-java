package com.suchit.Exceptions.Unchecked;

public class LowAmountException extends Exception{

    @Override
    public String toString() {
        return "the account is low or shortage of amount";
    }
}
