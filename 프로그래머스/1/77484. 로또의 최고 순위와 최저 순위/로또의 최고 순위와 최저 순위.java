class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int[] answer = {0,0};
        
        int best = 0;
        int worst = 0;
        
        for(int i = 0 ; i < lottos.length ; i++ ) {
            if(lottos[i] == 0) {
                best += 1;
            } else {
                for(int k = 0 ; k < win_nums.length ; k++) {
                    if(lottos[i] == win_nums[k]) {
                        best += 1;
                        worst += 1;
                    }
                } 
            }           
        }
        
        answer[0] = getGrade(best);
        answer[1] = getGrade(worst);
        
        return answer;
    }
    
    public int getGrade(int num) {
        switch(num) {
           case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;  
        }
    }
}