class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] arr = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr, (a,b)-> a[0]-b[0]);
        Stack<int[]> st = new Stack<>();
        for(int i= position.length-1; i>=0;i--){
            if(!st.isEmpty()){
                int[] x = st.peek();
                double xt = (double)(target-x[0]) / x[1];
                double at = (double)(target-arr[i][0]) / arr[i][1];
                if(at <= xt){
                    continue;
                }

            }
            st.push(arr[i]);
        }
        return st.size();
    }
}

