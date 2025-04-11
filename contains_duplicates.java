/*217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */


 //Brute Force

class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        int  n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
    
}

// Optimized 

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        int  n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
           hs.add(nums[i]);
        }
        if (hs.size() != nums.length) return true;
        return false;
    }
    
}