class Solution {
    public int heightChecker(int[] heights) {
        int sum = 0;
        int[] expectedHeights = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expectedHeights[i] = heights[i];
        }
        Arrays.sort(expectedHeights);
        for (int i = 0; i < heights.length; i++) {
            if (expectedHeights[i] != heights[i]) {
                sum ++;
            }
        }
        return sum;
    }
}
