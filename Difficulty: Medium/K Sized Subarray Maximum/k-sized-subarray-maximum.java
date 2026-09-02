class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {

        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove elements that are outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current element's index
            dq.offerLast(i);

            // Window is ready
            if (i >= k - 1) {
                al.add(arr[dq.peekFirst()]);
            }
        }

        return al;
    }
}