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
        
        switch(best) {
            case 6:
                answer[0] = 1;
                break;
            case 5:
                answer[0] = 2;
                break;
            case 4:
                answer[0] = 3;
                break;
            case 3:
                answer[0] = 4;
                break;
            case 2:
                answer[0] = 5;
                break;
            default:
                answer[0] = 6;
        }
        
        switch(worst) {
            case 6:
                answer[1] = 1;
                break;
            case 5:
                answer[1] = 2;
                break;
            case 4:
                answer[1] = 3;
                break;
            case 3:
                answer[1] = 4;
                break;
            case 2:
                answer[1] = 5;
                break;
            default:
                answer[1] = 6;
        }
        
        return answer;
    }
}