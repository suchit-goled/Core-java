package com.suchit.Exceptions;

public class Payment {
    static String Done= null;
    
    public static void paymentDone() throws PaymentException {

        if(Done!=null){
            System.out.println("payment done");

        }
    }
}
