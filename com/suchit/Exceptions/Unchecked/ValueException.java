package com.suchit.Exceptions.Unchecked;

public class ValueException {

    public static void main(String[] args){
        int a=10;
        int b=0;
        int c;

        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){

            System.out.println("demoniator is 0, try another number"+e);

        }
        System.out.println("Bye");
    }
}
