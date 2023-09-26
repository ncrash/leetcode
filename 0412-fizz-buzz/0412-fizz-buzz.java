class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        String temp;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                temp = "FizzBuzz";
            } else if (i % 3 == 0) {
                temp = "Fizz";
            } else if (i % 5 == 0) {
                temp = "Buzz";
            } else {
                temp = "" + i;
            }
            
            result.add(temp);
        }
        
        return result;
    }
}