1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int ln=letters.length;
4        //if(target=='a') return letters[0];
5
6        
7        int l=0;
8        int r=ln-1;
9        if(target>=letters[r]) return letters[0];
10        while(l<=r)
11        {
12            int mid=l+(r-l)/2;
13            if(letters[mid]<=target)
14            {
15                
16                l=mid+1;
17            }
18            else
19            {
20                r=mid-1;
21            }
22
23        }
24        return letters[l];
25    }
26}