package com.suchit.Exceptions.Unchecked;

public class PercentageCalculation {
    public void calculatePercentage(int totalMarks, int obtainedMarks)
            throws MinMarkException {

        if (obtainedMarks < 35) {
            throw new MinMarkException(
                    "Student failed. Minimum passing marks are 35.");
        }

        double percentage = (obtainedMarks * 100.0) / totalMarks;

        System.out.println("Percentage = " + percentage + "%");
    }
}
