class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length - 1];

        for(int i = start ; i < end; i++){
            al.add(i);
        }

        for(int j = 0 ; j < nums.length; j++){
           al.remove(Integer.valueOf(nums[j]));
        }
        return al;
    }
}