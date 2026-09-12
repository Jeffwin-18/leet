class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ar2=new ArrayList<>();

        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[j]==arr2[i])
                {
                    ar1.add(arr1[j]);
                }
            }
            
        }
        for(int i:arr1)
        {
            if(!ar1.contains(i))
            {
                ar2.add(i);
            }
        }
            Collections.sort(ar2);
            ar1.addAll(ar2);
        
        
        int [] ab=new int[ar1.size()];

        for(int i=0;i<ab.length;i++)
        {
            ab[i]=ar1.get(i);
        }
        return ab;
    }
}