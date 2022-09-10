import java.util.*;
public class AL3 {
    //swap 2 nos.
    public static void swap(ArrayList <Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList <>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(7);
        int idx1 =1 , idx2=3;
        
        System.out.print(list);
        swap(list, idx1, idx2);
        System.out.print(list);
    }
    
}
