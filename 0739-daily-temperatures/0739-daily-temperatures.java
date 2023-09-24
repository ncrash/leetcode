class Solution {
    // time complexity : for loop -> O(n)
    // space complexity : stack to push number of 'int[] temperatures' -> O(n)
    public int[] dailyTemperatures(int[] temperatures) {
        // return DataStructure (initialized with 0s)
        int[] result = new int[temperatures.length];

        // stack of non-match temperatures (for reverse-comparisons)
        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++){
            while(!tempStack.empty() && temperatures[tempStack.peek()] < temperatures[i]){
                int idx = tempStack.pop();
                result[idx] = i - idx;
            }
            tempStack.push(i);
        }

        return result;
    }
}