/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0;
        int r=mountainArr.length()-1;
        int mid=0;
        int p=0;
        while(l<r)
        {
            mid=l+(r-l)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }

        }
        p=l;

        l=0;
        r=p;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            int v=mountainArr.get(mid);
            if(v==target)
            {
                return mid;
            }
            else if(v<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        l=p+1;
        r=mountainArr.length()-1;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            int v=mountainArr.get(mid);
            if(v==target)
            {
                return mid;
            }
            else if(v<target)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }

        }
        return -1;
        }
}