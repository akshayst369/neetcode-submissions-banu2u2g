class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Create frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        // Step 2: Convert map into a list of entries
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());


        // Step 3: Sort list based on frequency (value)
        list.sort((a, b) -> b.getValue() - a.getValue());


        // Step 4: Store top k keys in answer array
        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i).getKey();
        }


        return answer;
    }
}