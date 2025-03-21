class Solution {
    public int compress(char[] chars) 
    {
        int index = 0;  //track the number of character present in the result array 
        int start = 0;
        while(start<chars.length)
        {
            int end = start;
            while(end<chars.length && chars[start] == chars[end])   //Check how far a character consecutively occur
                end++;
            int count = end-start;  // Find out the no of occurance
            chars[index++] = chars[start];  //Add the start charcter
            if(count>1) //If this character comes greater than 1 then add to the array 
            {
                char[] frequency = Integer.toString(count).toCharArray();
                for(char ch : frequency)
                {
                    chars[index++] = ch;
                }
            }
            start = end; // Again the loop will start from the end index
        }
        return index;
    }
}
