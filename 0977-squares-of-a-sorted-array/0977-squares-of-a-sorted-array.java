class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        
        int i = 0;
        int j = 1;
        while(i < nums.length - 1){
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
            if(j == nums.length){
                i++;
                j = i+1;
            }
        }
        return nums;
    }
}