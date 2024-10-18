class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[2051];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j]++;
            }
        }
        int max = 0,idx=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; idx=i;
            }
        }
        return idx;
    }
}
