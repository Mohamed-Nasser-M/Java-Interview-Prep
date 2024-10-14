class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int oddCells = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < indices.length; i++) {
            int x = indices[i][0];
            int y = indices[i][1];
            for (int k = 0; k < n; k++) {
                arr[x][k]++;
            }
            for (int k = 0; k < m; k++) {
                arr[k][y]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    oddCells++;
                }
            }
        }
        return oddCells;
    }
}
