package com.suchit.Exceptions.Checked;
import java.io.*;
public class PencilFactory {

    public static void pencilProduction(){
        try{
            System.out.println("production of pencil");
        }
        catch(Exception e){
            System.out.println(e.getMessage());


            //checked exception where it is compulsory to write an exception which need to be handle by try catch or by the throwable
        try{
            FileInputStream file=new FileInputStream("my.text");
        }
        catch(Exception f){

        }


        }
    }
}
