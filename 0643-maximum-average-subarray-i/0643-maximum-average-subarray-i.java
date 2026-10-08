class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        int n = nums.length;

        for(int i = 0; i <= n-k; i++){
            int sum = 0;
            for(int j = i; j <= k-1+i; j++){
               sum = sum + nums[j];
            }
            double average = (double)sum/k;
            maxAverage = Math.max(maxAverage, average);
        }
        return maxAverage;
    }
}