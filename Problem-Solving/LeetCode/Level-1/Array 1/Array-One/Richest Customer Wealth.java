class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0,currentWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            currentWealth=0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth+=accounts[i][j];
            }
            maxWealth = Math.max(maxWealth,currentWealth);
        }
        return maxWealth;
    }
}
