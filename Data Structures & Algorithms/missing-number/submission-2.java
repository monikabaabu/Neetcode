class Solution {
    public int missingNumber(int[] nums) {
        int tot = nums.length ;
      
        for(int i=0;i<nums.length ;i++) tot^= i^nums[i]; 
        return tot;
    }
    
}
