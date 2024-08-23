import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String fractionAddition(String expression) {
        
        Pattern fractionPattern = Pattern.compile("([+-]?\\d+)/(-?\\d+)");
        Matcher fractionMatcher = fractionPattern.matcher(expression);

        ArrayList<Integer> numerators = new ArrayList<>();
        ArrayList<Integer> denominators = new ArrayList<>();

        while (fractionMatcher.find()) {
            int numerator = Integer.parseInt(fractionMatcher.group(1));
            int denominator = Integer.parseInt(fractionMatcher.group(2));
            numerators.add(numerator);
            denominators.add(denominator);
        }

        int den = denominators.get(0);
        for(int i=1;i<denominators.size();i++){
            den = LCM(den,denominators.get(i));
        }

        int num = 0;
        for(int i=0;i<numerators.size();i++){
            num += (den/denominators.get(i))*numerators.get(i);
        }

        int sign = num<0?-1:1;
        num = Math.abs(num);
        while(HCF(num,den)!=1){
            int hcf = HCF(Math.abs(num),den);
            num /= hcf;
            den /= hcf;
        }
        return sign==-1?-num+"/"+den:num+"/"+den;
    }
    public int HCF(int a,int b){
        if(b==0)return a;
        return HCF(b,a%b);
    }
    public int LCM(int a,int b){
        return (a*b)/HCF(a,b);
    }
}