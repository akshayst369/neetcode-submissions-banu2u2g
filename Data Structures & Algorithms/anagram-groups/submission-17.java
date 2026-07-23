class Solution {
   public String frequencyString (String str) {
      int[] freq = new int[26];
      char []charr = str.toCharArray();
      for(char ch : charr) {
         freq[ch - 'a']++;
      }
   
      StringBuilder sb = new StringBuilder();
      char c = 'a';
      for(int i : freq) {
         sb.append(c);
         sb.append(i);
         c++;
      }
      return sb.toString();
   }
   public List<List<String>> groupAnagrams(String[] strs) {

   if(strs.length == 0 || strs == null) return new ArrayList<>();
   
   HashMap <String,List<String>> frequencyMap = new HashMap<>();
   
   for(String str : strs) {
   String frequencyString = frequencyString(str);

   if(frequencyMap.containsKey(frequencyString)) { 
      frequencyMap.get(frequencyString).add(str);
   }


   else {
      List<String> list = new ArrayList<>();
      list.add(str);
      frequencyMap.put(frequencyString,list);
   }
   }
   return new ArrayList<>(frequencyMap.values());
   }
}
