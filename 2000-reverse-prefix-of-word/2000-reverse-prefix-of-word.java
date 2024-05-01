class Solution {
    public String reversePrefix(String word, char ch) 
       {
        int c=word.indexOf(ch);
        int n=word.length();
        String s="";
        for(int i=c;i>=0;i--)
        {
            s=s+word.charAt(i);
        }
        s+=  word.substring(word.indexOf(ch)+1,n);
        return s;
    }
}