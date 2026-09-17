class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ss=new ArrayList<>();
        ss.add(new ArrayList<>());
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++)
        {
            s=0;
            if(i>0 && nums[i]==nums[i-1])
            {
            s=e;
        }
        e=ss.size();
        
            for(int j=s;j<e;j++)
            {
                List<Integer> sub=new ArrayList<>(ss.get(j));
                sub.add(nums[i]);
                ss.add(sub);
            }
        }
        return ss;
    }
}