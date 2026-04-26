class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> uniqset = new HashSet<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(uniqset.contains(nums[i]))
            {
            return true;
            }
            uniqset.add(nums[i]);
        }
        return false;
    }
}