// class Solution {
// //      public int kthGrammar(int n, int k){
         
// //      }
    
//     public int kthGrammar(int n, int k) {
//         String prv="0";
//         String prv2="";
//         if(n==1 && k==1){
//             return 0;
//         }
//         for(int i=1; i<n; i++){
//             for(char x: prv.toCharArray()){
//                 if(x=='0') prv2+="01";
//                 else if(x=='1') prv2+="10";
//             }
//             prv= prv2;
//             prv2="";
//         }
//         System.out.println(prv);
        
//         // return Integer.valueOf(prv.charAt(k-1)-'0');
//         return 0;
//     }
// }

class Solution {
    public int kthGrammar(int N, int K) {
        if(N==1) return 0;
        if(K%2==0){
            if (kthGrammar(N-1,K/2)==0) return 1;
            else return 0;
        }
        else{
            if(kthGrammar(N-1,(K+1)/2)==0) return 0;
            else return 1;
        }
    }
}