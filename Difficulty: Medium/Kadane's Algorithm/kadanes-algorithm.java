class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int res=arr[0];
        int maxEnd=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnd=Math.max(maxEnd+arr[i],arr[i]);
            res=Math.max(res,maxEnd);
        }
        return res;
    }
}
