class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int ln=letters.length;
        //if(target=='a') return letters[0];

        
        int l=0;
        int r=ln-1;
        if(target>=letters[r]) return letters[0];
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(letters[mid]<=target)
            {
                
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }

        }
        return letters[l];
    }
}