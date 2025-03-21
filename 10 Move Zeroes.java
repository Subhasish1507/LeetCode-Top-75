class Solution {
    public void moveZeroes(int[] nums) 
    {
        if(nums.length ==1 && nums[0] == 0)
            return;
        int[] temp = nums;
        int count = 0;
        for(int i = 0 ; i<temp.length ; i++)
        {
            if(temp[i] == 0)
                count++;
        }
        int j = 0;
        for(int i = 0 ; i <temp.length;i++)
        {
            if(temp[i] != 0)
            {
                nums[j++] = temp[i]; 
            }
        }
        while(count!=0)
        {
            nums[j++] = 0;
            count--;
        }
        return;
    }
}
