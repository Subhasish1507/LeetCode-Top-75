class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int length = nums.length;   //First find out the length of the array
        int[] left = new int[length];   //Define the left array with size of nums
        int[] right = new int[length];  //Define the right array with size of nums
        left[0] = 1;    //Assign the first index value with 1
        right[length-1] = 1;    //Assign the last index value with 1
        //Traverse through the array from left with multiplying the values 
        for(int i = 1 ; i<length ; i++)
        {
            left[i] = left[i-1] * nums[i-1];
        }
        //Traverse through the array from right with multiplying the values 
        for(int i = length-2 ; i>= 0 ; i--)
        {
            right[i] = nums[i+1]*right[i+1];
        }
        //Define answer array with size of nums
        int[] answer = new int[length];
        //Just multiply the left product and right product , to get the actual answer in a specific index
        for(int i = 0 ; i <length ; i++)
        {
            answer[i] = left[i] * right[i];
        }
        //Return it
        return answer;
    }
}
