class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            str[i] = String.valueOf(nums[i]);
        for (int i = 0; i < nums.length; i++)
            if (str[i].length() % 2 == 0)
                sum++;
        return sum;
    }
}
