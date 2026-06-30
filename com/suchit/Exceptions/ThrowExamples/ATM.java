package com.suchit.Exceptions.ThrowExamples;

import com.suchit.Exceptions.Unchecked.LowAmountException;

public class ATM {
    public void withDraw(double amount,double balance) throws LowAmountException {

        //throwing an exception of low account balance if the withdraw amount is more than balance
        // this exception is custom exception. where i am throwing an exception
        //Used to manually create and send an exception when a problem occurs.
        if(amount>balance){
            throw new LowAmountException();
        }
        else{
            System.out.println("withdrawing amount");
        }
    }
}
