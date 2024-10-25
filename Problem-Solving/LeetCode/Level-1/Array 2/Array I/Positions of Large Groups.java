class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int cum = 1, start = 0, end=0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)){
                cum++; end++;
            }
            else {
                if (cum>2) res.add(List.of(start, end));
                cum = 1; start = i; end = i;
            }
        }
        if (cum>2) res.add(List.of(start , end));
        return res;
    }
}
