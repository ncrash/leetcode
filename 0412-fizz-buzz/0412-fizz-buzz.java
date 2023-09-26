class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        String temp;
        for (int i = 1; i <= n; i++) {
            boolean divideBy3 = i % 3 == 0;
            boolean divideBy5 = i % 5 == 0;
            
            if (divideBy3 && divideBy5) {
                temp = "FizzBuzz";
            } else if (divideBy3) {
                temp = "Fizz";
            } else if (divideBy5) {
                temp = "Buzz";
            } else {
                temp = "" + i;
            }
            
            result.add(temp);
        }
        
        return result;
    }
}