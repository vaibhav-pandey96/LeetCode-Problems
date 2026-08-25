class Solution {
    public boolean isPalindrome(String s) {
        String g = s.toLowerCase();
        int i = 0;
        int j = g.length() - 1;
        
        while(i < j){
            if(!Character.isLetterOrDigit(g.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(g.charAt(j))){
                j--;
            }
            else{
                if(g.charAt(i) != g.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}