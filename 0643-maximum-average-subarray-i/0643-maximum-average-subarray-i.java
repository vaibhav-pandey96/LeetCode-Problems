class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k ; i++){
            sum += nums[i];
        }

        double maxAvg = (double)sum/k;

        for(int i = k ; i < nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            double avg2 = (double) sum/k;
            maxAvg = Math.max(maxAvg, avg2);
        }
        return maxAvg;
    }
}