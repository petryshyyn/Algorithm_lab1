import java.util.*;

class Graph {
    static int score = 0;

    void magic(List<Integer> listOfPeople) {
        listOfPeople.remove(0);
        int index = 0;
        int add = -1;
        while (index < listOfPeople.size() - 1) {
            if (distributionByTribes(index, listOfPeople.get(index), listOfPeople.get(index + 1))) {
                listOfPeople.add(index + 1, add--);
                index++;
            }
            index++;
        }

        for (int i = 0; i < listOfPeople.size(); i++) {
            if (listOfPeople.get(i) < 0 && listOfPeople.get(i) % 2 == 0) {
                listOfPeople.remove(i);
            }
        }

        Set<Integer> setListOfPeople = new LinkedHashSet<Integer>(listOfPeople);
        listOfPeople.removeAll(listOfPeople);
        listOfPeople.addAll(setListOfPeople);
        Map<Integer, Integer> home = new HashMap<Integer, Integer>();
        int tribeNumber = 0;

        for (Integer person : listOfPeople) {
            if (person < 0) {
                tribeNumber++;
            } else {
                home.put(person, tribeNumber);
            }
        }
        System.out.println(home);

        for (int in = 0; in < listOfPeople.size(); in++) {
            if (listOfPeople.get(in) < 0) {
                listOfPeople.remove(in);
            }
        }

        for (int i = 0; i < listOfPeople.size(); i++) {
            for (int j = i + 1; j < listOfPeople.size(); j++) {
                if (genderVerification(listOfPeople.get(i), listOfPeople.get(j), home.get(listOfPeople.get(i)), home.get(listOfPeople.get(j)))) {
                    System.out.println("(" + listOfPeople.get(i) + " / " + listOfPeople.get(j) + ")");
                    score++;
                }
            }
        }
    }

    private boolean genderVerification(int firstPeople, int secondPeople, int firstTribe, int secondTribe) {
        return ((firstPeople + secondPeople) % 2 != 0) && (firstTribe != secondTribe);
    }

    private boolean distributionByTribes(int index, int firstPeople, int secondPeople) {
        return (index % 2 != 0) && (firstPeople != secondPeople);
    }
}
