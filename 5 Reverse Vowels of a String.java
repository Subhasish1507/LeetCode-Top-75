class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a' ||ch=='e'|| ch=='i'|| ch=='o' || ch=='u' || ch=='A' ||ch=='E'|| ch=='I'|| ch=='O' || ch=='U')
            return true;
        return false;
    }
    public String reverseVowels(String s) 
    {
        char[] chars = s.toCharArray(); 
        int start = 0;
        int end = s.length()-1;
        while(start < end)
        {
            if(isVowel(chars[start]) && isVowel(chars[end]))
            {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
            if(!isVowel(chars[start]))
                start++;
            if(!isVowel(chars[end]))
                end--;
        }
        //s = new String(chars);
        //s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        //return s;
         return new String(chars); 
    }
}
