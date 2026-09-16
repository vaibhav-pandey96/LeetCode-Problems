class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int current = 0;
        for(int i = 0; i < k; i++){
            current += nums[i];
        }
        double max = (double) current/k;
        for(int i = 1; i <= nums.length - k; i++){
            current = current - nums[i - 1] + nums[i +k - 1];

            double average = (double) current /k;
            max = Math.max(max, average);
        }
        return max;
    }
}