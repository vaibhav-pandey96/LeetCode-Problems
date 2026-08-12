class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int j = 0;

        for(int i = 0; i<nums.length - 1; i++){
            if(nums[i+1] == nums[i] + 1){
                sum += nums[i+1];
            }
            else{
                break;
            }
        }

        while(j < nums.length){
            if(nums[j] == sum){
                sum++;
                j = 0;
            }
            j++;
        }

        return sum;
    }
}