import java.util.ArrayList;

public class AL5 {
    //Storewater
    //2 pointer approach
    public static int storeWater(ArrayList<Integer> height) {
            int maxWater =0;
            int lp = 0;      //left pointer
            int rp= height.size()-1;   //right pointer
        while(lp<rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(currWater, maxWater);
            //update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>  height = new ArrayList<>();
        height.add(6);
        height.add(7);
        height.add(9);
        height.add(11);
        height.add(8);
        height.add(2);
        height.add(5);
        height.add(5);
        height.add(12);
        System.out.println(storeWater(height));
    }
}
