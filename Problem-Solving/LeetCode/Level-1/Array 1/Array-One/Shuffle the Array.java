class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2 = new int[n*2];
        int cnt = 0;
        for (int i = 0; i < n*2; i+=2,cnt++) {
            nums2[i] = nums[cnt];
        }
        cnt = n;
        for (int i = 1; i < n*2; i+=2,cnt++) {
            nums2[i] = nums[cnt];
        }
        return nums2;
    }
}
