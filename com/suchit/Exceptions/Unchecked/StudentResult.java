package com.suchit.Exceptions.Unchecked;

public class StudentResult {
    public static void main(String[] args) {

        PercentageCalculation percentageCalculation =
                new PercentageCalculation();

        try {

            percentageCalculation.calculatePercentage(100, 25);

        }

        catch (MinMarkException e) {

            System.out.println(e.getMessage());

        }

        finally {

            System.out.println("Result processing completed.");

        }

    }
}
