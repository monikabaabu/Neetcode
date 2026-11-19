class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            list.add(new ArrayList<>());
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.get(entry.getValue()).add(entry.getKey());
        }
        int[] res = new int[k];
        int idx=0;
        for(int i = list.size()-1; i >= 0 && idx < k;i--){
           List<Integer> l = list.get(i);
           for(int j=0;j<l.size();j++){
            res[idx++] = l.get(j);
           }
        }
        return res;
    }
}
