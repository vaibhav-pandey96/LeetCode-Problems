class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(nums);
        int start = nums[0];
        int biggest = 0;

        for(int i = 0 ; i < nums.length; i++){
            al.add(nums[i]);
            biggest = Math.max(biggest, nums[i]);
        }

        for(int j = start ; j <= biggest; j++){
            if(al.contains(j)){
                al.remove(Integer.valueOf(j));
            }
            else{
                al.add(j);
            }
        }
        return al;
    }
}