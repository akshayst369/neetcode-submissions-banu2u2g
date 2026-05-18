
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // A Set stores unique elements only
        Set<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // .add() returns false if the element is already present
            if (!seen.add(num)) {
                return true; 
            }
        }
        
        
        return false;
    }
}