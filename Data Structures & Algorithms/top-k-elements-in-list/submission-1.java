class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> maps : map.entrySet()) {
            list.add(maps);
        }

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        for(int j = 0; j < Math.min(k, list.size()); j++){
            list2.add(list.get(j).getKey());
        }

        return list2.stream().mapToInt(Integer::intValue).toArray();
    }
}

