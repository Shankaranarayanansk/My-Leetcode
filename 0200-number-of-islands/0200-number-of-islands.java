class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numRows = grid.length;
        int numCols = grid[0].length;
        boolean[][] visited = new boolean[numRows][numCols];
        int islandCount = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    islandCount++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return islandCount;
    }
     public void dfs(char[][] grid, int row, int col, boolean[][] visited) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        if (row < 0 || row >= numRows || col < 0 || col >= numCols || grid[row][col] == '0' ||  visited[row][col]) {
            return;
        }
        visited[row][col] = true;
        dfs(grid, row + 1, col, visited);
        dfs(grid, row - 1, col, visited);
        dfs(grid, row, col + 1, visited);
        dfs(grid, row, col - 1, visited);
    }

}
