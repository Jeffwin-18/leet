1class Solution {
2    public int maximum69Number (int num) {
3        int c=0;
4        int n1=num;
5        while(n1>0)
6        {
7            n1=n1/10;
8            c++;
9        }
10        int arr[]=new int [c];
11        for(int i=c-1;i>=0;i--)
12        {
13            arr[i]=num%10;
14            num=num/10;
15        }
16        for(int i=0;i<c;i++)
17        {
18            if(arr[i]==6)
19            {
20            arr[i]=9;
21            break;
22        }
23        }
24        int re=0;
25        for(int i=0;i<arr.length;i++)
26        {
27            re=(re*10)+arr[i];
28        }
29        return re;
30    }
31}