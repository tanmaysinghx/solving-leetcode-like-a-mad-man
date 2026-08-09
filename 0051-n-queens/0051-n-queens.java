class Solution {

    private List<List<String>> result = new ArrayList<>();

    private boolean[] cols;
    private boolean[] diag1; // row - col + n - 1
    private boolean[] diag2; // row + col

    public List<List<String>> solveNQueens(int n) {

        cols = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        backtrack(0, board, n);

        return result;
    }

    private void backtrack(int row, char[][] board, int n) {

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            int d1 = row - col + n - 1;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }

            // Place queen
            board[row][col] = 'Q';
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            backtrack(row + 1, board, n);

            // Backtrack
            board[row][col] = '.';
            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }

    private List<String> construct(char[][] board) {

        List<String> solution = new ArrayList<>();

        for (char[] row : board) {
            solution.add(new String(row));
        }

        return solution;
    }
}