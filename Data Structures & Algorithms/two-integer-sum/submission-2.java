class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a,b)-> a[0]-b[0]);
        int j=0;
        int k = nums.length-1;
        while(j<k){
            if(arr[j][0] + arr[k][0] > target) k--;
            else if( arr[j][0] +arr[k][0] <target) j++;
            else return new int[] {Math.min(arr[j][1], arr[k][1]),Math.max(arr[j][1], arr[k][1])};
        }
        return new int[] {-1,-1};
    }
}
