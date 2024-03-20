class Solution {
    public int solution(int[][] sizes) {
                
        for(int i = 0 ; i < sizes.length ; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                int num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
        }
        
        int w = sizes[0][0];
        int h = sizes[0][1];
        
        for(int i = 1 ; i < sizes.length ; i++) {
            if(w < sizes[i][0]) {
                w = sizes[i][0];
            }
            if(h < sizes[i][1]) {
                h = sizes[i][1];
            }
        }
        
        
        return w * h;
    }
}