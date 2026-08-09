class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length());
            sb.append("#");
            sb.append(strs.get(i));
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        String s;
        while (i < str.length()) { 
            int idx = str.indexOf("#", i);
            int tam = Integer.parseInt(str.substring(i, idx)); 
            s = str.substring(idx + 1, tam + idx + 1);
            strs.add(s);
            i = idx + tam + 1;
        }

        return strs;
    }
}
