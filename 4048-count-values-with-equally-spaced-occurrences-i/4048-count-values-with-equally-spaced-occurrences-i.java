class Solution {
    public int countSpecialIntegers(int[] nums) {
        java.util.Map<Integer, java.util.List<Integer>> map=new java.util.HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.computeIfAbsent(nums[i], k-> new java.util.ArrayList<>()).add(i);
        }
            int c=0;
            for(java.util.List<Integer> ind:map.values())
                {
                    if(ind.size()==3)
                    {
                        int i1=ind.get(0);
                        int i2=ind.get(1);
                        int i3=ind.get(2);
                        if(i2-i1==i3-i2)
                        {
                            c++;
                        }
                    }
                }
            return c;
        }
    }
