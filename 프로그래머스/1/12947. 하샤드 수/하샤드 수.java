class Solution {
    public boolean solution(int x) {
        
        boolean answer = true;
        
        String str = x + "";
        
        int sum = 0;
        
        String[] sArray = new String[str.length()];
        
        for(int i = 0 ; i < str.length() ; i++) {
            sArray[i] = str.substring(i,i+1);
            sum += Integer.parseInt(sArray[i]);
        }
        
        if(x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        
        return answer;
    }
}