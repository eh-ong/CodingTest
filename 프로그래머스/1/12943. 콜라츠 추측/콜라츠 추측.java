class Solution {
    public int solution(int num) {
        int answer = 0;
        long l = num;
        
        while(l != 1) {
            if(l % 2 == 0) {
                l = l/2;
                answer++;
            } else {
                l = l * 3 + 1;
                answer++;
            }                
        }
        
        if(answer >= 500) {
            answer = -1;
        }
        
        return answer;
    }
}