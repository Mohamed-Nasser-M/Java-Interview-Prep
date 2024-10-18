class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean b;
        for (int i = 0; i < nums.length; i++) {
            b=true;
            for (int j = 0; j < list.size(); j++) {
                if (nums[i]== list.get(j)) {
                    b=false;
                    break;
                }
            }
            if (b)
                list.add(nums[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        if (list.size()>=3)
            return list.get(2);
        return list.get(0);
     }
}
