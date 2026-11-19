class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(new int[]{entry.getValue(),entry.getKey()});
            if(pq.size()>k) pq.poll();
        }
        int[] arr = new int[k];
        while(k!=0){
            arr[k-1] = pq.poll()[1];
            k--; 
        }
        return arr;
    }
}
