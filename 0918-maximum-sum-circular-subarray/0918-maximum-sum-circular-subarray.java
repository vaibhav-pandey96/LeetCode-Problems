class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0;
        int max = Integer.MIN_VALUE;
        int currMin = 0;
        int min = Integer.MAX_VALUE;

        int totalSum = 0;

        for(int num : nums){
            totalSum += num;

            currMax = Math.max(num, currMax + num);
            max = Math.max(max, currMax);

            currMin = Math.min(num, currMin+num);
            min = Math.min(currMin, min);
        }
        if(max < 0){
                return max;
            }
        return Math.max(max, totalSum - min);
    }
}