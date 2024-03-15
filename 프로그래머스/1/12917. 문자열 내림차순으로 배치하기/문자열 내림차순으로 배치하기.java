import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] charArray = s.toCharArray();
        
        String[] sArray = new String[s.length()];
        
        for(int i = 0 ; i < charArray.length ; i++) {
            sArray[i] = Character.toString(charArray[i]);
        }
        
        Arrays.sort(sArray, Collections.reverseOrder());
                
        for(int i = 0 ; i < sArray.length ; i++) {
            answer += sArray[i];
        }
        
        return answer;
    }
}