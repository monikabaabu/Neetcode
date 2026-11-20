class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> dist(b)-dist(a));
        for(int i=0;i<points.length;i++){
            pq.offer(points[i]);
            if(pq.size() > k) pq.poll();
        }
        int[][] res = new int[k][2];
        for(int i=0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;

    }
    private static int dist(int[] p){
        return p[0]*p[0] + p[1]*p[1];
    }
}

// less opt
// Time: (O(nlog n))
// class Solution {
//     public int[][] kClosest(int[][] points, int k) {
//         Arrays.sort(points, (a, b) -> (a[0] * a[0] + a[1] * a[1]) -
//                                       (b[0] * b[0] + b[1] * b[1]));
//         int[][] res = new int[k][2];
//         for(int i=0;i<k;i++){
//             res[i][0] = points[i][0];
//             res[i][1] = points[i][1];
//         }
//         return res;

//     }
// }