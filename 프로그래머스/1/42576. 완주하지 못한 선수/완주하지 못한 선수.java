import java.util.Arrays;

class Solution {
    
    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int num = 0;
        
        for(int i = 0 ; i < participant.length ; i++) {
            if(i < completion.length) {
                if(!participant[i].equals(completion[i])) {
                    num = i;
                    break;
                }
            } else {
                num = i;
            }
                             
        }
        
        String answer = participant[num];
        return answer;
    }
}