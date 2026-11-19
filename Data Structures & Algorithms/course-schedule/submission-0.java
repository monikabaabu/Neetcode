class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            indegree[prerequisites[i][1]]++;
            list.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i] ==0 ) q.add(i);
        }
        int c =0;
        while(! q.isEmpty()){
            int n = q.poll();
            c++;
            for(int i=0;i< list.get(n).size();i++){
                indegree[list.get(n).get(i)]--;
                if( indegree[list.get(n).get(i)] == 0) q.add(list.get(n).get(i));
            }
        }
        return c == numCourses;
    }
}
