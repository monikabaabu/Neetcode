class Solution {
    public int largestRectangleArea(int[] heights) {
        int max =0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int x = heights[st.pop()];
                int pse = st.isEmpty()? -1 : st.peek();
                max = Math.max(max,x*(i-pse-1));
            }
            st.push(i);

        }
        int nse = heights.length;
        while(!st.isEmpty()){
            int x = heights[st.pop()];
            int pse = st.isEmpty()? -1 : st.peek();
          max = Math.max(max,x*(nse-pse-1));   
        }
        return max;
    }
}
