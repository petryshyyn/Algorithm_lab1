package com.company;

class Laptop {
    private double processorPerformance;
    private int amountOfRAM;
    private String name;
    private String nameOfTheManufacturer;
    public Laptop(double processorPerformance, int amountOfRAM, String name, String nameOfTheManufacturer){
        this.processorPerformance = processorPerformance;
        this.amountOfRAM = amountOfRAM;
        this.name = name;
        this.nameOfTheManufacturer = nameOfTheManufacturer;
    }

    public double getProcessorPerformance() {
        return processorPerformance;
    }

    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public String getName() {
        return name;
    }

    public String getNameOfTheManufacturer() {
        return nameOfTheManufacturer;
    }
}
