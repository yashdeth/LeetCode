class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int i=0;
        int j=height.length-1;

        while(i<j){
            int area = area(height,i,j);
            if(area>a)
                a = area;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
    return a;  
    }
    public int area(int[] height , int i , int j){
        return Math.min(height[i],height[j])*(j-i);            
    }
}