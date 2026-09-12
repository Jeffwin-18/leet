class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> cm=new HashMap<>();
        for(int i:nums)
        {
            cm.put(i,cm.getOrDefault(i,0)+1);
        }
        Integer [] box=new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            box[i]=nums[i];
        }
        Arrays.sort(box, (a,b)->{
            int f1=cm.get(a);
            int f2=cm.get(b);
            return f1!=f2 ? Integer.compare(f1,f2) : Integer.compare(b,a);
        });
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=box[i];
        }
        return nums;
    }
}