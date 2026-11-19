class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            int idx=i;
            while(idx!=0){
                if((idx&1) == 1) c++;
                idx>>=1;
            }
            res[i] = c;
        }
        return res;
    }
}
