class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> res = new HashMap<>(); //initialise the map
        for (String s : strs){                          //iterate through each words in str array
            int[]count = new int[26];                   //initialise count of each alphabets with size of 26
            for(char i : s.toCharArray()){              //iterate through each char in the str
                count[i-'a']++;                   //count the occurence of alphabets in each string
            }
            String key = Arrays.toString(count);        //initialise key and the count is converted to string instead of integer array 
            res.putIfAbsent(key, new ArrayList<>());    //initialise the key first in the res HashMap
            res.get(key).add(s);                        //add the value i.e the string to the key i.e the count, in the next iteration the next string is added as value to the same key if the count array is the same
        }
        return new ArrayList<>(res.values());           //return only the values i.e the List of strings with anagrams grouped together 
    }
}
