
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        // Key: the number from the array
        // Value: the index of that number
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the map already contains the complement
            if (map.containsKey(complement)) {
                // If found, return the index of the complement and the current index
                return new int[] { map.get(complement), i };
            }

            // If not found, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return a default value if no pair is found
        return new int[] {-1, -1};
    }
}