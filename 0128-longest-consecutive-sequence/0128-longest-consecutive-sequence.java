class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int maxCount = 0;
        Arrays.sort(nums);

        if(nums.length==0)
            return 0;

        if(nums.length==1)
            return 1;

        for(int i=1;i<nums.length;i++){

            if(nums[i]==nums[i-1])
                continue;

            if(nums[i]==nums[i-1]+1)
                count++;

            else{
                if(maxCount<count)
                    maxCount=count;
                count=0;
            }
            
        }

        if(maxCount<count)
            maxCount=count;
        
        return maxCount+1;
    }
}