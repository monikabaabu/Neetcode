class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pre =0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            pre += nums[i];
            int com = pre - k;
            if(map.containsKey(com)) c+=map.get(com);
            map.put(pre, map.getOrDefault(pre,0)+1);
        }
        return c;
    }
}