class Solution {
    public int maxOperations(int[] nums, int k) 
    {
        Arrays.sort(nums);  //First sort the array
        int left = 0;   //Initialize two pointer left and right
        int right = nums.length-1;
        int count = 0;  //This is count the no of remove operation
        while(left<right)   //Check either two pointer cross each other or not
        {
            //Now if the sum of left and right index value is less than k , then we should move left pointer
            // as for the total sum value will be increases..
            if(nums[left] + nums[right] < k)    
            {
                left++;
            }
            //Now if the sum of left and right index value is greater than k , then we should move right pointer
            // as for the total sum value will be decreases..
            else if(nums[left]+nums[right]>k)
            {
                right--;
            }
            else{       // when both equal , so remove them and move both pointer
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
}
