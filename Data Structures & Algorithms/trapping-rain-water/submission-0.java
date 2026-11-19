class Solution {
    public int trap(int[] height) {
        int[] pre = new int[height.length];
        int[] suf = new int[height.length];
        for(int i=0;i<height.length;i++){
            if(i>0) pre[i] = Math.max(pre[i-1],height[i-1]);
            else pre[i] =0;
        }
        for(int i=height.length-1;i>=0;i--){
            if(i<height.length-1) suf[i] = Math.max(suf[i+1],height[i+1]);
            else suf[i] =0;
        }
        int res =0;
        for(int i=0;i<height.length;i++){
            int trapped = Math.min(pre[i], suf[i]) - height[i];
            if(trapped > 0) res += trapped;
        }
        return res;
    }
}
