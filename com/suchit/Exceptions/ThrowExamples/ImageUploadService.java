package com.suchit.Exceptions.ThrowExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ImageUploadService {

    //throws is the keyword which will tell us that this might raise an exception so we need to handle it using try catch block in the calling methods
    //otherwise it should be declared as throws in further usage
    public void upload(String fileName)
            throws FileNotFoundException {

        FileReader reader = new FileReader(fileName);

        System.out.println(fileName + " uploaded successfully.");
    }
}