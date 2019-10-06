import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Algorithm {
    int search(int[] array, int n){
        List<Integer> list = new ArrayList<>();
        List<Integer> otherList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for(int i : array){
            list.add(i);
        }
        System.out.println(list + "- free places");
        list.sort(Integer::compareTo);
        System.out.println(list + "- sort list of places");
        if(n == 2){
            return list.get(list.size()-1)- list.get(0);
        }
        int step = (list.size()+1)/n;
        for(int i =0; i <= list.size()-1;i+=step){
            otherList.add(list.get(i));
        }
        System.out.println(otherList + "- the outermost places");
        for(int i = 0; i < otherList.size()-1; i++){
            resultList.add(otherList.get(i+1)- otherList.get(i));
        }
        System.out.println(resultList + "- the distance between the outermost places");
        return Collections.min(resultList);
    }
}
