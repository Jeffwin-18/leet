1class Solution {
2    public void reverseString(char[] s) {
3        int n=s.length;
4        int i=0;
5        int j=n-1;
6        while(i<j)
7        {
8            char t=s[i];
9            s[i]=s[j];
10            s[j]=t;
11            i++;
12            j--;
13        }
14        
15    }
16}