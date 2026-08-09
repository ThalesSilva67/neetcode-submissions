class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] chars = String.join("", strs[i]).toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            map.putIfAbsent(str, new ArrayList<>());

            map.get(str).add(strs[i]);
        }

        List<List<String>> list = new ArrayList<>(map.values());

        return list;
    }
}
