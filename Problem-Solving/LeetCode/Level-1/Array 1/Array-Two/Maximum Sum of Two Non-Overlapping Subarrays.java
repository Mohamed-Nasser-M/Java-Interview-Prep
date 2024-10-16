class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(maxSum(nums, firstLen, secondLen), maxSum(nums, secondLen, firstLen));
    }
    private int maxSum(int[] nums, int L, int M) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        int maxL = 0, maxSum = 0;
        for (int i = L + M; i <= n; i++) {
            maxL = Math.max(maxL, prefixSum[i - M] - prefixSum[i - M - L]);
            maxSum = Math.max(maxSum, maxL + prefixSum[i] - prefixSum[i - M]);
        }
        
        return maxSum;
    }
}
