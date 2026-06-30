package com.suchit.Exceptions.Checked;

public class Checked {

    public static void main(String[] args){
        try{
            Factory.production();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
