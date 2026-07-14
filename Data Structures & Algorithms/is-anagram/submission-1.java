class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freqs = new HashMap<>();
        HashMap<Character,Integer> freqt = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char a : s.toCharArray()){
            freqs.put(a,freqs.getOrDefault(a,0)+1);
        }
        for(char a : t.toCharArray()){
            freqt.put(a,freqt.getOrDefault(a,0)+1);
        }
        return freqs.equals(freqt);


    }
}
