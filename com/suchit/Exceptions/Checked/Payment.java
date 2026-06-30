package com.suchit.Exceptions.Checked;

public class Payment {
    static String Done= null;
    
    public static void paymentDone() throws PaymentException {

        if(Done!=null){
            System.out.println("payment done");

        }
    }
}
