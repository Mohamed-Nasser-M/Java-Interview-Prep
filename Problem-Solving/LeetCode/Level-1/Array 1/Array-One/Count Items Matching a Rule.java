class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0,idx;
        if(Objects.equals(ruleKey, "type")){
            idx = 0;
        }else if(Objects.equals(ruleKey, "color")){
            idx = 1;
        }else{
            idx = 2;
        }
        for (List<String> item : items) {
            if(Objects.equals(item.get(idx), ruleValue)){
                count++;
            }
        }
        return count;
    }
}
