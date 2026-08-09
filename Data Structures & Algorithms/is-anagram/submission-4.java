class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<String, String> map = new HashMap<>();
        String[] arr = {s, t};
        boolean anagram = false;

        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            map.put(sortedString, arr[i]);
        }

        for (String key : map.keySet()) {
            if (map.get(key).equals(t)) {
                anagram = true;
            } else {
                return false;
            }
        }

        if (anagram)
            return true;

        return false;
    }
}
