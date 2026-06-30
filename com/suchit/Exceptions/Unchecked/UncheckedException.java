package com.suchit.Exceptions.Unchecked;



public class UncheckedException{

    public static void main(String[] args){
        int A[]={30,20,10,40,0};
        try {
            int c = A[0] / A[1];

            System.out.println("division is " + c);
            //nested try and catch block
            try {
                System.out.println(A[5]);
            }
            //if there is any elements or the loop try to access the extra index of the array assinged it will give ArrayIndexOutOfBound exception which is the next block
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index access is high");
            }
        }
        // if there is any arithmetic exception like if denominator is zero it prints the next statement
        catch(ArithmeticException e){
            System.out.println("denominator should not be zero");

        }
        //if there is any elements or the loop try to access the extra index of the array assinged it will give ArrayIndexOutOfBound exception which is the next block

        System.out.println("bye");
    }
}
