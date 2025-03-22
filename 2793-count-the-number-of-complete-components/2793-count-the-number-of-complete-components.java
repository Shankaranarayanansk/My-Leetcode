class Solution {
    public void bfs(int node, List<List<Integer>> adj, List<Integer> comp, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        vis[node] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            comp.add(cur);
            for (int nbr : adj.get(cur)) {
                if (!vis[nbr]) {
                    q.add(nbr);
                    vis[nbr] = true;
                }
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        int cnt = 0;
        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                List<Integer> comp = new ArrayList<>();
                bfs(i, adj, comp, vis);

                boolean isComp = true;
                for (int x : comp) {
                    if (adj.get(x).size() != comp.size() - 1) {
                        isComp = false;
                        break;
                    }
                }
                if (isComp)
                    cnt++;
            }
        }
        return cnt;
    }
}
