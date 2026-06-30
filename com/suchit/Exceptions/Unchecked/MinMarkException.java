package com.suchit.Exceptions.Unchecked;

//custom Exception where we create our own exception which should extends the class exception always
public class MinMarkException extends Exception{

    public MinMarkException (String message){
        super(message);
    }

}
