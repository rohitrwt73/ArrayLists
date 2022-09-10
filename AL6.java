import java.util.*;
public class AL6 {
    //pairSum
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp =0;
        int rp = list.size()-1;
        while(lp!= rp){
            //case 1
            if(list.get(lp)+ list.get(rp)== target){
                 return true;
            }
            //case2
            else if(list.get(lp)+ list.get(rp)< target){
                lp++;
            }
            //case 3
           else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        
        list.add(9);
       
        list.add(10);
        
       System.out.println( pairSum1(list, 16));
}
}