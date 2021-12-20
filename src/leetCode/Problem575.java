package leetCode;

import java.util.HashMap;

public class Problem575 {
    public int distributeCandies(int[] candyType) {
      int n = candyType.length;
      HashMap<Integer, Integer> map = new HashMap<>();
      int count = 0;
      for (int x : candyType){
          if (!map.containsKey(x)){
              map.put(x,1);
              ++count;
          }
      }
      return Math.min(count, n / 2);
    }
}
