1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int [] fr=new int[26];
4        for( char i:tasks)
5        {
6            fr[i-'A']++;
7        }
8        Arrays.sort(fr);
9        int mf=fr[25];
10        int mc=0;
11        for(int i=25;i>=0;i--)
12        {
13            if(fr[i]==mf)
14            {
15                mc++;
16            }
17            else
18            {
19                break;
20            }
21        }
22        int min=(mf-1)*(n+1)+mc;
23        return Math.max(tasks.length, min);
24    }
25}