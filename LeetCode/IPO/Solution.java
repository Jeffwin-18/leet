1import java.util.Arrays;
2import java.util.PriorityQueue;
3
4class Solution {
5    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
6        int n = profits.length;
7        
8        int[][] projects = new int[n][2];
9        for (int i = 0; i < n; i++) {
10            projects[i][0] = capital[i];
11            projects[i][1] = profits[i];
12        }
13        Arrays.sort(projects, (a, b) -> Integer.compare(a[0], b[0]));
14        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
15        
16        int i = 0;
17        for (int j = 0; j < k; j++) {
18            while (i < n && projects[i][0] <= w) {
19                maxHeap.add(projects[i][1]);
20                i++;
21            }
22            if (maxHeap.isEmpty()) {
23                break;
24            }
25            w += maxHeap.poll();
26        }
27        
28        return w;
29    }
30}