class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] count  = new int[26];
        for(int i =0;i < s.length(); i++)
        {
            count[s.charAt(i)-'a']++;
        }
        for (char c:t.toCharArray())
        {
            count[c - 'a']--;
        }

        for(int v:count)
            if( v != 0)
            {
                return false;
            }
            return true;
        
    }
}
