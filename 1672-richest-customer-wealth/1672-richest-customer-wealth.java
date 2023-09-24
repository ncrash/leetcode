class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] customers : accounts) {
            int currentCustomerWealth = 0;
            for (int bank : customers) {
                currentCustomerWealth += bank;
            }
            
            result = Math.max(currentCustomerWealth, result);
        }
        
        return result;
    }
}