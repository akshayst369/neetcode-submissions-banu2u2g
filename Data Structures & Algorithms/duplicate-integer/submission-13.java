class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean flag = false;
        Map <Integer,Integer> map = new HashMap<>();
        for(int d: nums) {
            map.put(d,map.getOrDefault(d,0)+1);
        }
        for(int check : nums) {
            if(map.get(check) != 1) return flag = true;
            else flag = false;
        }
        return flag;
    }
}