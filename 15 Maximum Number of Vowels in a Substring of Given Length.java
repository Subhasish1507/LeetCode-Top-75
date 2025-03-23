class Solution {
    public boolean isVowel(char ch) //Checking for a character is vowel or not
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
    public int maxVowels(String s, int k) 
    {
        int no = 0;
        for(int i = 0 ; i<k ; i++)  //Find out the no of vowels present in first k length slide
        {
            if(isVowel(s.charAt(i)))
                no++;
        }
        int maxNo = no;
        int start = 0;  //Sliding window left boundary
        int end = k;    //This is right boundary
        while(end<s.length())   //Run the loop for all slide of k length
        {
            if(isVowel(s.charAt(start)))    //If left boundary last character was vowel , then no will decreased
                no--;
            start++;    //Move the left boundary to one step forward
            if(isVowel(s.charAt(end)))      //If right boundary upcoming character is vowel , then no will increased
                no++;
            end++;  //Move the right boundary to one step forward
            maxNo = Math.max(no,maxNo); // Check current maximum no of vowel is greater  than previous or not
        }
        return maxNo;   // return the maximum
    }
}
