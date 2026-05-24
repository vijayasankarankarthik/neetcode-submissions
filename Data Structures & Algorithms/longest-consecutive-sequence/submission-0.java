class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);        //adding the numbers in the hashset
        }
        int longest = 0;
        for(int num : numSet){
            if(!numSet.contains(num-1)){//checking if it isnt the start of seq
                int length = 1;
                while(numSet.contains(num+length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
}
