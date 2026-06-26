package com.suchit.Exceptions;

public class CheckedUnchecked {

    public static void main(String[] args){
        try{
            Factory.production();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
