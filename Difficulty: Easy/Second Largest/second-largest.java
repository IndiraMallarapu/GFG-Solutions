class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2&&arr[i]<max) max2=arr[i];
        }
        return (max2==Integer.MIN_VALUE)?-1:max2;
    }
}