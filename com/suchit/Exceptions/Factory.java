package com.suchit.Exceptions;

public class Factory {


    public static void production(){
       try{
           PencilFactory.pencilProduction();
       }
       catch(Exception e){
          e.printStackTrace();
       }

    }
}