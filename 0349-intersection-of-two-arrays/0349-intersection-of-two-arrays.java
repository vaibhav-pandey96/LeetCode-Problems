class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

       HashSet<Integer> set = new HashSet<>();

        while(i < nums1.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j = 0;
            }
            else{
                j++;
            }
            if(j == nums2.length){
                j = 0;
                i++;
            }
        }

        int[] arr = new int[set.size()];
        int k = 0;

        for(int val : set){
            arr[k] = val;
            k++;
        }
        return arr;
    }
}