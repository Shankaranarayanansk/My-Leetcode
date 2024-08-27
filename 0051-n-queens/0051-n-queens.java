import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        if (n == 2 || n == 3) return results;

        int[] solution = new int[n];
        solveNQueensRec(n, solution, 0, results);
        return results;
    }

    private void solveNQueensRec(int n, int[] solution, int row, List<List<String>> results) {
        if (row == n) {
            results.add(constructSolutionString(solution));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValidMove(row, col, solution)) {
                solution[row] = col;
                solveNQueensRec(n, solution, row + 1, results);
                solution[row] = -1;
            }
        }
    }

    private boolean isValidMove(int row, int col, int[] solution) {
        for (int i = 0; i < row; i++) {
            int c = solution[i];
            if (c == col || c - i == col - row || c + i == col + row) return false;
        }
        return true;
    }

    private List<String> constructSolutionString(int[] solution) {
        List<String> board = new ArrayList<>();
        for (int col : solution) {
            char[] row = new char[solution.length];
            java.util.Arrays.fill(row, '.');
            row[col] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
