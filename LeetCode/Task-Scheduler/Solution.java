1import java.util.Arrays;
2
3class Solution {
4    public int leastInterval(char[] tasks, int n) {
5        int[] freq = new int[26];
6        for (char task : tasks) {
7            freq[task - 'A']++;
8        }
9        
10        Arrays.sort(freq);
11        int maxFreq = freq[25];
12        
13        // Count how many tasks have the maximum frequency
14        int maxCount = 0;
15        for (int i = 25; i >= 0; i--) {
16            if (freq[i] == maxFreq) {
17                maxCount++;
18            } else {
19                break;
20            }
21        }
22        
23        // Calculate minimum time required by max frequency slots
24        int minIntervals = (maxFreq - 1) * (n + 1) + maxCount;
25        
26        // Return max between calculated frame size and total actual tasks
27        return Math.max(tasks.length, minIntervals);
28    }
29}