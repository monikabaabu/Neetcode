class Solution {
    public int missingNumber(int[] nums) {
        int tot = nums.length ;
        int sum = tot*(tot+1)/2;
        for(int i=0;i<nums.length ;i++) sum-=nums[i];
        return sum;
    }
    
}
