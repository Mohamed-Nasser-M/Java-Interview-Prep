class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for (int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int[] res = new int[size];
        int j=0;
        for (int i=1;i<nums.length;i+=2){
            for (int k=0;k<nums[i-1];k++){
                res[j++]=nums[i];
            }
        }
        return res;
    }
}
