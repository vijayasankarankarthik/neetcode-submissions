class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output = new int[n];
        int[] prefix = new int[n];

        prefix[0]=1;
        output[n-1]=1;

        for(int i=1; i<n ; i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        for(int i=n-2 ; i>=0 ;i--){
            output[i]=output[i+1]*nums[i+1];
        }

        for(int i=0 ; i<n ; i++){
            output[i]=prefix[i]*output[i];
        }

        return output;
        
    }
}  
