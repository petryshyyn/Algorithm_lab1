package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class LaptopManager {
    private Main main = new Main();

    public void bubbleSort(int[] array) {
        LocalDateTime firstTimeForBubbleSort = LocalDateTime.now();
        int temp;
        int comparison = 0;
        int exchange =0;
        int n = array.length;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                comparison++;
                if(array[j-1] < array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    exchange++;
                }
            }
        }
        LocalDateTime lastTimeForBubbleSort = LocalDateTime.now();
        Duration period = Duration.between(lastTimeForBubbleSort, firstTimeForBubbleSort);
        System.out.println("Bubble sort");
        System.out.println("time: " + period);
        System.out.println("comparison: " + comparison);
        System.out.println("exchange: "+ exchange);
        for (int i : array){
            System.out.println(i);
        }
    }

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    private LocalDateTime firstTimeForMargeSort = LocalDateTime.now();

    public void mergeSort(double[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        double[] lefSide = new double[mid];
        double[] rightSide = new double[length - mid];
        for (int i = 0; i < mid; i++) {
            lefSide[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            rightSide[i - mid] = array[i];
        }
        mergeSort(lefSide, mid);
        mergeSort(rightSide, length - mid);
        merge(array, lefSide, rightSide, mid, length - mid);
    }

    public void merge(double[] array, double[] lefSide, double[] rightSide, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            list1.add(1);
            if (lefSide[i] <= rightSide[j]) {
                array[k++] = lefSide[i++];
                list2.add(1);
            }
            else {
                array[k++] = rightSide[j++];
            }
        }
        while (i < left) {
            array[k++] = lefSide[i++];
        }
        while (j < right) {
            array[k++] = rightSide[j++];
        }
        if(array.length == main.getArrayProcessorLength()){
            LocalDateTime lastTimeForMargeSort = LocalDateTime.now();
            Duration period = Duration.between(lastTimeForMargeSort, firstTimeForMargeSort);
            System.out.println("\nMarge sort");
            System.out.println("Time work: " + period);
            System.out.println("comparison: " + list1.size());
            System.out.println("exchange: " + list2.size());
            for(double index : array){
                System.out.println(index);
            }
        }
    }
}
