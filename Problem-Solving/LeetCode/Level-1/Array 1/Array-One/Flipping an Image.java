class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int s,e,temp;
        for (int i = 0; i < image.length; i++) {
            s = 0; e = image.length-1;
            for (; e>s; s++,e--) {
                temp = image[i][e];
                image[i][e] = image[i][s];
                image[i][s] = temp;
            }
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                }else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
