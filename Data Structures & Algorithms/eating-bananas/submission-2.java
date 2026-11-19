class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int r=0;
        int res=0;
        for(int i=0;i<piles.length;i++){
            r = Math.max(r,piles[i]);
        }
        while(l<=r){
            int m = (l+r)/2;
            int tot=0;
            for(int i=0;i<piles.length;i++){
                tot += (int) Math.ceil((double) piles[i]/m);
            }
            if(tot<=h){
                res =m;
                r=m-1;
            }
           
            else {
            
                
                l = m+1;
            }
        }
        return res;
    }
}
