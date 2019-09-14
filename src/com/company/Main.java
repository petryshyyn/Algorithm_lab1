package com.company;

import java.time.LocalDateTime;
import java.time.Duration;

public class Main {
    private static int arrayProcessorLength;
    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();
        Laptop myLaptop = new Laptop(20.5, 256, "Del", "Electronic");
        Laptop Laptop1 = new Laptop(26, 512, "Del", "Electronic");
        Laptop Laptop2 = new Laptop(22.5, 1024, "Del", "Electronic");
        Laptop Laptop3 = new Laptop(18.6, 128, "Del", "Electronic");
        Laptop Laptop4 = new Laptop(30.5, 2048, "Del", "Electronic");
        double[] arrayProcessor = {myLaptop.getProcessorPerformance(), Laptop1.getProcessorPerformance(),
                Laptop2.getProcessorPerformance(), Laptop3.getProcessorPerformance(), Laptop4.getProcessorPerformance()};
        int[] arrayRAM = {myLaptop.getAmountOfRAM(), Laptop1.getAmountOfRAM(), Laptop2.getAmountOfRAM(),
                Laptop3.getAmountOfRAM(), Laptop4.getAmountOfRAM()};
        Main.arrayProcessorLength = arrayProcessor.length;

        laptopManager.bubbleSort(arrayRAM);
        laptopManager.mergeSort(arrayProcessor, arrayProcessor.length);
    }

    public int getArrayProcessorLength() {
        return arrayProcessorLength;
    }
}
