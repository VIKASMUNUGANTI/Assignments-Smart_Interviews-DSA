// Brute Force (tc-O(n^2))

class Solution1 {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1; 
    }
}


//Optimized (tc-O(n))

class Solution2 {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum +=nums[i];
        }
        int sum1=0;
        for(int i=0;i<n+1;i++)
        {
            sum1 +=i;
        }
        return (sum1 - sum);
    }
}



