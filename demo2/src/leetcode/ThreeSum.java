package leetcode;

import java.util.*;

/**
 * Created by DELL on 2017/3/17.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int [] num){
        Arrays.sort(num);
        List<List<Integer>>  k= new LinkedList<List<Integer>>();
      if ( num.length>3) {
          for (int i = 0; i < num.length - 2; i++) {
              if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                  int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];
                  while (lo < hi) {
                      if (num[lo] + num[hi] == sum) {
                          k.add(Arrays.asList(num[i], num[lo], num[hi]));
                          while (lo < hi && num[lo] == num[lo + 1]) lo++;
                          while (lo < hi && num[hi] == num[hi - 1]) hi--;
                          lo++;
                          hi--;
                      } else if (num[lo] + num[hi] < sum) lo++;
                      else hi--;
                  }

              }
          }
          return k;
      }
      List<List<Integer>>  z= new LinkedList<List<Integer>>();
      List<Integer> m = new LinkedList<Integer>();
      m.add(-1);
      m.add(-1);
      m.add(-1);
      z.add(m);
      return z;

    }
    public static void main(String args[]){
        int [] numbers= {-1,1};
         threeSum(numbers);
    }
}

