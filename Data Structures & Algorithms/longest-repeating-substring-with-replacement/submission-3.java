class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l=0;
        int r=0;
        int max =0;
        int maxl=0;
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            max = Math.max(max,freq[s.charAt(r)-'A']);
            while(r-l+1-max > k){
                freq[s.charAt(l)-'A']--;
                // max = 0;
                // for(int i=0;i<26;i++){
                // max = Math.max(max,freq[i]);
                // }
                l++;
            }
            if(r-l+1-max <= k){
                maxl = Math.max(maxl,r-l+1);
                r++;
            }
        }
        return maxl;
    }
}
