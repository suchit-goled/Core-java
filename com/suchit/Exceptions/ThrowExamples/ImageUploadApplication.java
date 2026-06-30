package com.suchit.Exceptions.ThrowExamples;

import java.io.FileNotFoundException;

public class ImageUploadApplication {

    public static void main(String[] args) {

        ImageUploadService service =
                new ImageUploadService();

        try {

            service.upload("profile.png");

        }

        catch (FileNotFoundException e) {

            System.out.println("Image not found.");

        }

    }

}