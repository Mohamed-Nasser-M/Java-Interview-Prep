class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int[] time = new int[10000];
        for (int i = 0; i < startTime.length; i++) {
            for (int j = startTime[i]; j <= endTime[i]; j++) {
                time[j]++;
            }
        }
        return time[queryTime];
    }
}
