class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0 ; i < t.length(); i++){
            char c = t.charAt(i);
            if(!map.containsKey(c)){
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        for(int nums : map.values()){
            if(nums!= 0){
                return false;
            }
        }
        return true;

    }
}