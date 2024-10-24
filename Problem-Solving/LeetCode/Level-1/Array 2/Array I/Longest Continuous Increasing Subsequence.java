class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0, cur=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                cur++;
            }else{
                max = Math.max(max, cur);
                cur = 1;
            }
        }
        max = Math.max(max, cur);
        return max;
    }
}
