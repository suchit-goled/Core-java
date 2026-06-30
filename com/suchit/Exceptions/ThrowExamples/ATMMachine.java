package com.suchit.Exceptions.ThrowExamples;

import com.suchit.Exceptions.Unchecked.LowAmountException;

import java.security.acl.LastOwnerException;

public class ATMMachine {

    public static void main(String[] args){
        ATM atmAmount=new ATM();
       try{
           atmAmount.withDraw(5000,10000);
       }
       catch(LowAmountException e){
           System.out.println(e.getMessage());
        }
    }
}
