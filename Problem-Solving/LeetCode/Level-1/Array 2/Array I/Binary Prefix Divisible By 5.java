class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer = new ArrayList<>();
        int prefix = 0;

        for (int num : nums) {
            prefix = (prefix * 2 + num) % 5;
            answer.add(prefix == 0); 
            }

        return answer;
    }
}
