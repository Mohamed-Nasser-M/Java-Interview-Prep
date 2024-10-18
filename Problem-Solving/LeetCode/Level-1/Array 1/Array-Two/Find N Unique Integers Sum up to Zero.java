class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int count = 0;
        if (n%2==0){
            for (int i = -n/2; i <= n/2; i++){
                if(i==0) continue;
                arr[count] = i;count++;
            }
        }else{
            for (int i = -n/2; i <= n/2; i++){
                arr[count] = i;count++;
            }
        }
        return arr;
    }
}
