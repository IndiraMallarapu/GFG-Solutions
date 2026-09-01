class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n=arr.length;
        int i=0,j=n-1;
        int max=0;
        while(i<j){
            int h=Math.min(arr[i],arr[j]);
            int w=j-i;
            max=Math.max(max,h*w);
            if(arr[i]<arr[j]) i++;
            else j--;
        }
        return max;
    }
}