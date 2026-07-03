class Solution {

    private String getfrequencyString(String s) {
        int freq[] = new int[26];

        char charr[] = s.toCharArray();

        for(char c : charr) {
           freq [c-'a']++;
        }
        StringBuilder frequencyString = new StringBuilder("");
        char ch = 'a';
        for(int i : freq)
        {
            frequencyString.append(ch);
            frequencyString.append(i);
            ch++;
        }
        return frequencyString.toString();
        
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0 )
        {
            return new ArrayList<>();
        }
        HashMap <String,List<String>> frequencyStringMap = new HashMap<>();
        
        for(String str : strs) {

        String frequencyString = getfrequencyString(str);

        if(frequencyStringMap.containsKey(frequencyString)) {
            frequencyStringMap.get(frequencyString).add(str);
        }
        else {
            List<String> lstr = new ArrayList<>();
            lstr.add(str);
            frequencyStringMap.put(frequencyString,lstr);     
            
        }
        }
        return new ArrayList<>(frequencyStringMap.values());
    }
}
