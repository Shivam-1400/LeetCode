class Solution {
    static class Node {
        Node children [] = new Node[26];
        int freq = 0;
        Node(){
            for(int i = 0 ; i < 26 ; i++){
                children[i] = null; 
            }
        }
    }
    public static Node root ;

    public static void insert(String word){
        Node curr = root ;
        for (int i = 0 ; i < word.length() ; i++){
           
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null)
                curr.children[idx] = new Node();
           
            curr = curr.children[idx];
            curr.freq += 1;
           
        }
        
    }

    public static int freqCount(String word){
        Node curr = root;
        int tf = 0;
        for(int i = 0 ; i < word.length() ; i++){
            int idx = word.charAt(i) - 'a';
            tf += curr.children[idx].freq;
            curr = curr.children[idx];
        }
        return tf;
    }


    public int[] sumPrefixScores(String[] words) {

        root = new Node();
       
        for(int i = 0 ; i < words.length ; i++){
            insert(words[i]);
        }

        int result [] = new int [words.length];

        for(int i = 0 ; i < result.length ; i++){
            result[i] = freqCount(words[i]);
        }
        root = null;

        return result;
    }
}