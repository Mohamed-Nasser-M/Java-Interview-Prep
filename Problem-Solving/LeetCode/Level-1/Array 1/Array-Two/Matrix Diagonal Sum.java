class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, count = 0;
        for (int i = 0; i < mat.length; i++)
            sum += mat[i][i];
        for (int j = mat.length - 1; j >= 0; j--,count++)
            sum += mat[j][count];
        if (mat.length == 1)
            return mat[0][0];
        else if (mat.length%2!=0)
            sum -= mat[mat.length/2][mat.length/2];
        return sum;
    }
}
