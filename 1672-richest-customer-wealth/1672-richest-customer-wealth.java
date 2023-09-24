class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] customers : accounts) {
            int wealth = 0;
            for (int bank : customers) {
                wealth += bank;
            }
            if (wealth > result) {
                result = wealth;
            }
        }
        
        return result;
    }
}