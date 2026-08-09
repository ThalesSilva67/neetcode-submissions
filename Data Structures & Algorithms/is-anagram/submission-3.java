class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        boolean anagram = false;

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        
        for(int j = 0; j < t.length(); j++) {
            map2.put(t.charAt(j), map2.getOrDefault(t.charAt(j), 0) + 1);
        }

        for(Character key : map.keySet()) {
            if(map2.containsKey(key) && map.get(key).equals(map2.get(key))) {
                anagram = true;
            } else {
                return false;
            }
        }

        if(anagram) return true;

        return false;
    }
}
