class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1,len2);
        int k = 0 ; int j = 0 ;
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i<= min ; i++)
        {
            sb.append(word1.charAt(j++));
            sb.append(word2.charAt(k++));
        }
        while(j<len1)
            sb.append(word1.charAt(j++));
        while(k<len2)
            sb.append(word2.charAt(k++));
        return sb.toString();
    }
}
