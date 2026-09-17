class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ss=new ArrayList<>();
        
        ss.add(new ArrayList<>());
        for(int i:nums)
        {
            int size=ss.size();
            for(int j=0;j<size;j++)
            {
                List<Integer> sub=new ArrayList<>(ss.get(j));
                sub.add(i);
                ss.add(sub);
            }
        }
        return ss;
    }
}