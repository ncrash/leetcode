class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int base = 0;
            if (i > 0) {
                base = result[i-1];
            }
            result[i] = base + nums[i];
        }
        
        return result;
    }
}