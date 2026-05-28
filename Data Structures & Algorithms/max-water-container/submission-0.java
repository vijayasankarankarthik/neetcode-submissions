
class Solution {
    public int maxArea(int[] heights) {
        ArrayList<Integer> amount = new ArrayList<>();
        int max=0;
        for(int i =0 ;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int volume = Math.min(heights[i],heights[j])*(j-i);
                amount.add(volume);
                max=Math.max(max,volume);
            }
        }
        return max;
    }
}
