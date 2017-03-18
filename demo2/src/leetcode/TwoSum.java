package leetcode;

/**
 * Created by DELL on 2017/3/17.
 */
import java.util.HashMap;


/* HashMap的常用方法，isEmpty，put,get,containsKey*/
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {

        if(numbers.length>=2)
        {
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            for(int i=0; i<numbers.length; i++){
                if(!h.isEmpty() && h.containsKey(target-numbers[i]))
                {
                    int[] k = {h.get(target-numbers[i]),i};
                    return k;
                }

                h.put(numbers[i],i);
            }
        }

        int[] k = {-1,-1};
        return k;

    }
    public static void main(String args[]){
         int [] numbers={3,2,4,6};
         int target = 10;
         int [] a;
         a = twoSum(numbers, target );
         for ( int dice : a )
              System.out.println( dice);

    }
}
