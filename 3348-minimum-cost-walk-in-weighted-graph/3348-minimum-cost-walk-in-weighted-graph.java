class Solution {
    private int findRoot(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = findRoot(parent, parent[node]);
        }
        return parent[node];
    }

    public int[] minimumCost(int n, int[][] edges, int[][] queries) {
        int[] parent = new int[n];
        int[] minPathCost = new int[n];
        Arrays.fill(minPathCost, -1);

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int nodeA = edge[0], nodeB = edge[1], weight = edge[2];
            int rootA = findRoot(parent, nodeA);
            int rootB = findRoot(parent, nodeB);

            minPathCost[rootB] &= weight;

            if (rootA != rootB) {
                minPathCost[rootB] &= minPathCost[rootA];
                parent[rootA] = rootB;
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0], end = queries[i][1];

            if (start == end) {
                result[i] = 0;
            } else if (findRoot(parent, start) != findRoot(parent, end)) {
                result[i] = -1;
            } else {
                result[i] = minPathCost[findRoot(parent, start)];
            }
        }
        return result;
    }
}
