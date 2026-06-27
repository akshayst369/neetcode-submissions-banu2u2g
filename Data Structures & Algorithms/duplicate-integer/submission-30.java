public class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> numsset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(numsset.contains(nums[i]))
            {
                return true;
            }
            numsset.add(nums[i]);
        }
        return false;
    }
}