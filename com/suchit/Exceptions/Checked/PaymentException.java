package com.suchit.Exceptions.Checked;

// writing our own exception by defining an exception class and using it when required
public class PaymentException extends Exception {

    @Override
    public String toString() {
        return "Payment of pencil production is not done";
    }
}
