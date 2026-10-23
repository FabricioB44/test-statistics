package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {90,20,40,50,75,95,45,30,65,70};

        int sum = 0;

        for (int score : scores){
             sum += score;
        }

        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);

        int highest = scores[0];

        for (int score : scores){
            if (score>highest) {
                highest = score;
            }
        }

        System.out.println("Highest score: " + highest);
    }
}
