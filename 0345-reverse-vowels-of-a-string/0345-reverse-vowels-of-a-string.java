class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);

        int i = 0;
        int j = str.length() - 1;

        while(i < j){
            if(!isVowel(str.charAt(i))){
                i++;
            }
            else if(!isVowel(str.charAt(j))){
                j--;
            }
            else{
                char temp = str.charAt(i);
                str.setCharAt(i, str.charAt(j));
                str.setCharAt(j, temp);
                i++;
                j--;
            }
        }

        String g = str.toString();
        return g;
    }
    public boolean isVowel(char c){
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || 
        c == 'o' || c == 'O' || c == 'u' || c == 'U' ){
            return true;
        }
        else{
            return false;
        }
    }
}