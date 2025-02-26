import java.util.PriorityQueue;

//Time Complexity- O(nLog(k))
//Space COmplexity- O(k)

class Solution {
 public int findKthLargest(int[] nums, int k) {
     
     if(nums==null || nums.length==0) return -1;
     
     PriorityQueue<Integer> pq= new PriorityQueue();
 
      for(int num : nums){    
         pq.add(num);
          if(pq.size() > k){
              pq.poll();
          }  
     }
     return pq.poll();
 }
}