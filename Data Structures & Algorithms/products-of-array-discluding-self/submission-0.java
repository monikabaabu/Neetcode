class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i>0){
                pre[i] = nums[i-1]*pre[i-1];
            }
            else{
                pre[i] = 1;
            }
            if(nums.length-1-i<nums.length-1){
                suf[nums.length-1-i] = nums[nums.length-1-i+1] * suf[nums.length-1-i+1];
            }
            else{
                suf[nums.length-1-i] = 1;
            }
        }
        for(int i=0;i<nums.length;i++){
            pre[i]*=suf[i];
        }
        return pre;
    }
}  
