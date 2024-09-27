import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Algorithm {
    void search(int[] array, int cows) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        System.out.println(list + "- free places");
        list.sort(Integer::compareTo);
        int maxStep = list.get(list.size() - 1) - list.get(0);
        System.out.println(list + "- sort list of places");
        if (cows == 2) {
            System.out.println("result: " + maxStep);
        } else if (cows == list.size()) {
            List<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                resultList.add(list.get(i + 1) - list.get(i));
            }
            System.out.println("Result: " + Collections.min(resultList));
        } else {
            distribution(list, maxStep, cows);
        }
    }

    private void distribution(List<Integer> list, int step, int cows) {
        List<Integer> myList = new ArrayList<>();
        myList.add(list.get(0));
        for (int i = 1; i <= list.size() - 1; i++) {
            if ((myList.get(myList.size() - 1) + step) < list.get(i)) {
                myList.add(list.get(i));
            }
        }
        if (myList.size() == cows) {
            System.out.println(myList + "- the outermost places");
            List<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < myList.size() - 1; i++) {
                resultList.add(myList.get(i + 1) - myList.get(i));
            }
            System.out.println(resultList + "- the distance between the outermost places");
            System.out.println("Result: " + Collections.min(resultList));
        } else {
            distribution(list, step - 1, cows);
        }
    }
}
