package com.company;
public class Main {

    public static void main(String[] args) {
        char[] arrayOfChars = {'a', 'a', 'a', 'c', 'a', 'b', 'd', 'e', 'f'};
        int width = 3;
        int height = 3;
        Algorithm algorithm = new Algorithm();
        algorithm.searchForAllPossibleExitsFromTheMaze(arrayOfChars, width, height);
        System.out.println(algorithm.getNumberOfWaysToExit());
    }
}
