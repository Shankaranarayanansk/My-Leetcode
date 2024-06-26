public class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] grid = new int[n][n];
        for (int[] row : grid) Arrays.fill(row, Integer.MAX_VALUE);

        for (int[] edge : edges) {
            grid[edge[0]][edge[1]] = edge[2];
            grid[edge[1]][edge[0]] = edge[2];
        }

        for (int i = 0; i < n; i++) grid[i][i] = 0;

        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][via] == Integer.MAX_VALUE || grid[via][j] == Integer.MAX_VALUE) continue;
                    grid[i][j] = Math.min(grid[i][j], grid[i][via] + grid[via][j]);
                }
            }
        }

        int cityCount = n;
        int cityNo = -1;

        for (int city = 0; city < n; city++) {
            int count = 0;
            for (int adjCity = 0; adjCity < n; adjCity++) {
                if (grid[city][adjCity] <= distanceThreshold) count++;
            }
            if (count <= cityCount) {
                cityCount = count;
                cityNo = Math.max(cityNo, city);
            }
        }

        return cityNo;
    }
}
