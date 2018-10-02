package sortList;
import java.util.*;

public class sList {
    public static List<Integer> sortList(List<Integer> sl) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i : sl) {
            if (tm.containsKey(i)) {
                tm.put(i, (tm.get(i)) + 1);
            } else {
                tm.put(i, 1);
            }
        }
        Integer count = 1;

        while (!tm.isEmpty()) {
            for ( Map.Entry e : tm.entrySet() ) {
                if (count == e.getValue()) {
                    for (int j = 0; j < count ; j++)
                        alist.add((Integer) e.getKey());
                        tm.remove(e.getKey());
                }
            }
            count++;
        }
        return alist;
    }

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            list.add(rand.nextInt(5));
        }
        List<Integer> res = sortList(list);
        for (int i :res)
            System.out.println(i);
    }
}
