class Solution {
    public String foreignDictionary(String[] words) {
        Map<Character, Set<Character>> adj = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                adj.putIfAbsent(ch, new HashSet<>());
                indegree.putIfAbsent(ch, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            int len = Math.min(s1.length(), s2.length());
            int j = 0;
            while (j < len && s1.charAt(j) == s2.charAt(j)) {
                j++;
            }
            if (j == len) {
                if (s1.length() > s2.length()) {
                    return "";
                }
                continue;
            }
            char u = s1.charAt(j);
            char v = s2.charAt(j);
            if (adj.get(u).add(v)) {
                indegree.put(v, indegree.get(v) + 1);
            }
        }
        Queue<Character> q = new LinkedList<>();
        for (char ch : indegree.keySet()) {
            if (indegree.get(ch) == 0) {
                q.offer(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!q.isEmpty()) {
            char node = q.poll();
            ans.append(node);
            for (char neighbour : adj.get(node)) {
                indegree.put(
                    neighbour,
                    indegree.get(neighbour) - 1
                );
                if (indegree.get(neighbour) == 0) {
                    q.offer(neighbour);
                }
            }
        }
        if (ans.length() != indegree.size()) {
            return "";
        }
        return ans.toString();
    }
}
