class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int sum,max=0;
        String s;
        int[] arr = new int[46];
        for (int i = lowLimit; i <= highLimit; i++) {
            sum = 0;
            s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            arr[sum]++;
        }
        for (int i = 0; i < 46; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
