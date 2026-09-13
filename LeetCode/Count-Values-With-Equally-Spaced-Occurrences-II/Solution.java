1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        int velq=nums.length;
4        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
5        for(int i=0;i<velq;i++)
6        {
7            ArrayList<Integer> list=map.get(nums[i]);
8            if(list==null)
9            {
10                list=new ArrayList<>();
11                map.put(nums[i], list);
12            }
13            list.add(i);
14        }
15        int c=0;
16        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) 
17        {
18            ArrayList<Integer> ind = entry.getValue();
19            if(ind.size()>=3)
20            {
21                boolean iss=true;
22                int diff=ind.get(1)-ind.get(0);
23                for (int i = 2; i < ind.size(); i++) {
24                    if (ind.get(i) - ind.get(i - 1) != diff) {
25                        iss = false;
26                        break;
27                    }
28                }
29                if(iss)
30                {
31                    c++;
32                }
33            }
34    }
35        return c;
36}
37}