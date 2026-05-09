class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(uniq.contains(nums[i])) return true;
            else uniq.add(nums[i]);
        }
        return false;
    }
}