class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char sarr[]= new char[s.length()];
        char tarr[]= new char[t.length()];

        for(int i=0;i<s.length();i++) {
            sarr[i] = s.charAt(i);
            tarr[i] = t.charAt(i);
        }
        HashMap <Character,Integer> map = new HashMap<>();
        HashMap <Character,Integer> tmap = new HashMap<>();

        for(int i=0;i<sarr.length;i++) {
            if(map.containsKey(sarr[i])) {
                map.put(sarr[i],map.get(sarr[i]+1));
            }
            else {
                map.put(sarr[i],1);
            }
            if(tmap.containsKey(tarr[i])) {
                tmap.put(tarr[i],tmap.get(tarr[i]+1));
            }
            else {
                tmap.put(tarr[i],1);
            }
        }
        if(tmap.equals(map)) return true;
    return false;
    }
}
