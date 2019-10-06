import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Algorithm {
    int search(int[] array, int n){
        List<Integer> list = new ArrayList<>();
        List<Integer> atherList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        int step = (list.size()+1)/n;
        for(int i : array){
            list.add(i);
        }
        list.sort(Integer::compareTo);
        if(n == 2){
            return list.get(list.size()-1)- list.get(0);
        }
        for(int i =0; i <= list.size()-1;i+=step){
            atherList.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(atherList);
        for(int i = 0; i < atherList.size()-1; i++){
            resultList.add(atherList.get(i+1)- atherList.get(i));
        }
        System.out.println(resultList);
        return Collections.min(resultList);
    }
}
