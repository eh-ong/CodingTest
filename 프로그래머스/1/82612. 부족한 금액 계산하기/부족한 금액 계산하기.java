class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long cost = 0;
        
        for(int i = 1 ; i <= count ; i++) {
            cost += price * i;
        }
        
        if(money >= cost) {
            answer = 0;
        } else {
            answer = cost - money;
        }

        return answer;
    }
}