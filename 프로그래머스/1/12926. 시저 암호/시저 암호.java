class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] charArray = s.toCharArray();
        
        for(int i = 0 ; i < charArray.length ; i++) {
            if(charArray[i] >= 65 && charArray[i] <= 90) {
                if(charArray[i]+n <= 90) {
                    charArray[i] += n;
                    answer += Character.toString(charArray[i]);
                } else {
                    charArray[i] += (n-26);
                    answer += Character.toString(charArray[i]);
                }
            } else if(charArray[i] >= 97 && charArray[i] <= 122) {
                if(charArray[i]+n <= 122) {
                    charArray[i] += n;
                    answer += Character.toString(charArray[i]);
                } else {
                    charArray[i] += (n-26);
                    answer += Character.toString(charArray[i]);
                }
            } else {
                answer += Character.toString(charArray[i]);
            }
        }
        
        return answer;
    }
}