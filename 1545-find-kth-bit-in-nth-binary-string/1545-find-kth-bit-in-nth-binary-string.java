class Solution {
    public char findKthBit(int n, int k) {
        String s[]=new String[n];

        s[0]="0";

        for(int i=1;i<n;i++){
            s[i]=s[i-1]+"1"+reverse(s[i-1]);
        }
        return s[n-1].charAt(k-1);
    }


    public String reverse(String s){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
          char c = s.charAt(i) == '0' ? '1' : '0';
            sb.append(c);
        }
        sb.reverse();
        s=sb.toString();
        return s;
    }
}