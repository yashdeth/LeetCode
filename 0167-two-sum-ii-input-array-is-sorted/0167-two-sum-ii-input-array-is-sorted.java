class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int[] sol={0,0};
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                sol[0]=l+1;
                sol[1]=r+1;
                break;
            }
            if(numbers[l]+numbers[r]>target){
                r--;
            }
            if(numbers[l]+numbers[r]<target){
                l++;
            }
        }
        return sol;
    }
}