1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int[] arr = new int [nums1.length + nums2.length];
4        System.arraycopy(nums1, 0, arr, 0, nums1.length);
5        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
6
7        Arrays.sort(arr);
8        int n=arr.length;
9        double m;
10        if(n%2==1)
11        {
12            return arr[n/2];
13        }
14        else
15        {
16            return (arr[n/2-1]+ arr[n/2])/2.00;
17        }
18    }
19}