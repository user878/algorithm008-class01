package week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
       //先用HashMap统计每个元素出现的次数
        HashMap<Integer,Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num,map.get(num) + 1 );
            }else{
                map.put(num,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (Integer key : map.keySet()) {
              if (pq.size() < k) {
                  pq.add(key);
              }else if (map.get(key) > map.get(pq.peek())) {
                  pq.remove();
                  pq.add(key);
              }
        }
        List<Integer> list = new ArrayList<>();
        while (!pq.isEmpty()) {
               list.add(pq.remove());
        }
        return  list.int;
    }
}

