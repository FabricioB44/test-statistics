package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {90,20,40,50,75,95,45,30,65,70};

        System.out.println("Average score: " + calcAverage(scores));

        System.out.println("Highest score: " + calcHighest(scores));

        System.out.println("Lowest score: " + calcLowset(scores));

        System.out.println("Median score: " + calcMedian(scores));
    }

    public static double calcAverage(int[] array) {
        int sum = 0;

        for (int number : array){
            sum += number;
        }

        return (double) sum / array.length;
    }

    public static double calcHighest(int[] array) {
        double highest = array[0];

        for (int number : array){
            if (number > highest) {
                highest = number;
            }
        }

        return  highest;
    }

    public static double calcLowset(int[] array) {
        double lowest = array[0];

        for (int number : array){
            if (number < lowest) {
                lowest = number;
            }
        }

        return  lowest;
    }

    public static double calcMedian(int[] array) {
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        double median = 0;


        if (sortedArray.length % 2 != 0) {
            median = sortedArray[sortedArray.length/2];
        } else {
            int middleNumber1 = sortedArray[(sortedArray.length/2)-1];
            int middleNumber2 = sortedArray[sortedArray.length/2];
            median = (middleNumber1 + middleNumber2) / 2.0;
        }
        return median;
    }
}

