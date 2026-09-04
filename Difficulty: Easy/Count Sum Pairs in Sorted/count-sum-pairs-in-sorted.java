class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        int count=0;
        int n=arr.length;
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<=j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                if (arr[i] == arr[j]) {
                    int x = j - i + 1;
                    count += x * (x - 1) / 2;
                    break;

                }
                else{
                    int left=arr[i];
                    int right=arr[j];
                    int lc=0;
                    int rc=0;
                    while(arr[i]==left){
                        lc++;
                        i++;
                    }
                    while(arr[j]==right){
                        rc++;
                        j--;
                    }
                    count+=rc*lc;
                }
            }
            else if(sum<target) i++;
            else j--;
        }
        return count;
    }
}
