class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int i=0,j=arr.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum<target) i++;
            else if(sum>target) j--;
            else{
                list.add(i+1);
                list.add(j+1);
                return list;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }
}