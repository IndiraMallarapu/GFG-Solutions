class Solution {
    static int countTriplets(int arr[], int L, int R) {
        Arrays.sort(arr);

        int n = arr.length;

        return countSum(arr, n, R) - countSum(arr, n, L - 1);
    }

    static int countSum(int[] arr, int n, int final_sum) {
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum > final_sum) {
                    right--;
                } else {
                    count += right - left;
                    left++;
                }
            }
        }

        return count;
    }
}