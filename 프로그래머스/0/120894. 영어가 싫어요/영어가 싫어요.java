class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String newNumbers = numbers.replace("zero", "0");
        newNumbers = newNumbers.replace("one", "1");
        newNumbers = newNumbers.replace("two", "2");
        newNumbers = newNumbers.replace("three", "3");
        newNumbers = newNumbers.replace("four", "4");
        newNumbers = newNumbers.replace("five", "5");
        newNumbers = newNumbers.replace("six", "6");
        newNumbers = newNumbers.replace("seven", "7");
        newNumbers = newNumbers.replace("eight", "8");
        newNumbers = newNumbers.replace("nine", "9");
                
        return Long.parseLong(newNumbers);
    }
}