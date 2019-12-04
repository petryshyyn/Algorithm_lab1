package com.company;

import java.util.*;

class Algorithm {
    private int numberOfWaysToExit = 0;

    public int getNumberOfWaysToExit() {
        return numberOfWaysToExit;
    }

    void searchForAllPossibleExitsFromTheMaze(char[] arrayOfChars, int width, int height) {
        if (width == 1) {
            numberOfWaysToExit = 1;
            return;
        }
        List<Character> listOfChars = new ArrayList<>();
        for (char i : arrayOfChars) {
            listOfChars.add(i);
        }

        for (int i = 0; i < listOfChars.size(); i += height) {
            checkOfFirsFinish(listOfChars, i, height);
            checkOfLastFinish(listOfChars, i, height);
        }
    }

    private void checkOfFirsFinish(List<Character> listOfChars, int startPosition, int height) {
        for (int i = height - 1 + height; i <= listOfChars.size() - 1; i += height) {
            if (startPosition == i) {
                return;
            }
        }
        if (startPosition < height) {
            numberOfWaysToExit++;
        } else {
            if (listOfChars.get(startPosition) == listOfChars.get(startPosition - height + 1)) {
                checkOfFirsFinish(listOfChars, startPosition - height + 1, height);
            } else {
                checkOfFirsFinish(listOfChars, startPosition + 1, height);
            }
        }
    }

    private void checkOfLastFinish(List<Character> listOfChars, int startPosition, int height) {
        for (int i = height - 1; i <= listOfChars.size() - height - 1; i += height)
            if (startPosition == i) {
                return;
            }
        if (startPosition >= listOfChars.size() - height) {
            numberOfWaysToExit++;
        } else {
            if (listOfChars.get(startPosition) == listOfChars.get(startPosition + height + 1)) {
                checkOfLastFinish(listOfChars, startPosition + height + 1, height);
            } else {
                checkOfLastFinish(listOfChars, startPosition + 1, height);
            }
        }
    }
}
