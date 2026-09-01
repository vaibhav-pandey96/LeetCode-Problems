class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr2 = new int[arr.length];
        int i = 0;
        int j = 0;

        while(i < arr.length && j < arr.length){
            if(arr[i] == 0){
               j += 2;
               i++;
            }
            else{
                arr2[j] = arr[i]; 
                i++;
                j++;
            }
        }

        for(int x = 0; x < arr2.length; x++){
            arr[x] = arr2[x];
        }
    }
}