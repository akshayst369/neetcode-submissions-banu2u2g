public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (smap.containsKey(ch)) {
                smap.put(ch,smap.get(ch)+1);
            }
            else {
                smap.put(ch,1);
            }
        }
        for (char ch : t.toCharArray()) {
            if (tmap.containsKey(ch)) {
                tmap.put(ch,tmap.get(ch)+1);
            }
            else {
                tmap.put(ch,1);
            }
        }
        return smap.equals(tmap);
    }
}