class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        if(s.length() == 0 )
            return true;    //If s length is 0 then it's true
        if(t.length()==0)
            return false;   //If t length is 0 then it's false
        int i = 0 ; //Initialize two pointers
        int j = 0;
        while(i<s.length()&&j<t.length())   //Check boundary condition
        {
            if(s.charAt(i) == t.charAt(j))  //When both character are same , move both pointer
            {
                i++;
                j++;
            }
            else
            {
                j++;        //Otherwise both just j pointer
            }
        }
        //At the end , check whether i is equal to the length of s or not 
        return (i==s.length());
    }
}
