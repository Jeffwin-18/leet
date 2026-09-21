1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> heap = new PriorityQueue<>();
4
5        for (int num : nums) {
6            heap.add(num);
7            if (heap.size() > k) {
8                heap.poll();
9            }
10        }
11
12        return heap.peek();
13    }
14}