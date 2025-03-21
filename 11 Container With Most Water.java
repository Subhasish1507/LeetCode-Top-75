class Solution {
    public int maxArea(int[] height) 
    {
        int left = 0 ;  //First initialize two pointer left and right
        int right = height.length-1;
        int mostWater = 0;  //This is the maximum area of water
        while(left < right)     //Check either two pointer may cross each other or not
        {
            int water = Math.min(height[left],height[right]) * (right-left);    //Find out current water
            mostWater = Math.max(water,mostWater);  //Comparing previous water with current
            if(height[left]<height[right])  //If left height is smaller then move left .
                left++;
            else
                right--;    //Otherwise move right.
        }
        return mostWater;
    }
}
