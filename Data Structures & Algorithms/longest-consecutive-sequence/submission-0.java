class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int c=1;
                while(set.contains(nums[i]+c)) c++;
                max = Math.max(max,c);
            }
        }
        return max;
    }
}
