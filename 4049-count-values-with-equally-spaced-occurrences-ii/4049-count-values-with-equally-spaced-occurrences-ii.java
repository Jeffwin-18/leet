class Solution {
    public int countSpecialIntegers(int[] nums) {
        int velq=nums.length;
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<velq;i++)
        {
            ArrayList<Integer> list=map.get(nums[i]);
            if(list==null)
            {
                list=new ArrayList<>();
                map.put(nums[i], list);
            }
            list.add(i);
        }
        int c=0;
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) 
        {
            ArrayList<Integer> ind = entry.getValue();
            if(ind.size()>=3)
            {
                boolean iss=true;
                int diff=ind.get(1)-ind.get(0);
                for (int i = 2; i < ind.size(); i++) {
                    if (ind.get(i) - ind.get(i - 1) != diff) {
                        iss = false;
                        break;
                    }
                }
                if(iss)
                {
                    c++;
                }
            }
    }
        return c;
}
}