//   https://leetcode.com/problems/fill-a-special-grid/

class Solution {
    public int[][] specialGrid(int N) {
        int n = 1 << N;
        int[][] grid = new int[n][n];
        int start = 0;

        fillGrid(grid, 0, 0, n, start);
        return grid;
    }

    private void fillGrid(int[][] grid, int i, int j, int n, int start) {
        if (n == 1) {
            grid[i][j] = start;
            return;
        }

        int halfSize = n / 2;

        fillGrid(grid, i, j + halfSize, halfSize, start);
        fillGrid(grid, i + halfSize, j + halfSize, halfSize, start + halfSize * halfSize);
        fillGrid(grid, i + halfSize, j, halfSize, start + 2 * halfSize * halfSize);
        fillGrid(grid, i, j, halfSize, start + 3 * halfSize * halfSize);
    }
}