1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        int c=0;
4        int f=1;
5        for(int i:flowerbed)
6        {
7            if(i==0)
8            {
9                f++;
10            }
11            else
12            {
13                c+=(f-1)/2;
14                f=0;
15        }
16        }
17        c+=f/2;
18        if(c>=n)
19        {
20            return true;
21        }
22        return false;
23    }
24}