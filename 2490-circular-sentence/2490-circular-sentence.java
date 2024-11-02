class Solution {
    public boolean isCircularSentence(String sentence) {
        char front = sentence.charAt(0);
        char last = sentence.charAt(sentence.length()-1);

        if(front != last){
            return false;
        }

        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            char lastChar = words[i].charAt(words[i].length()-1);
            char nextChar = words[(i+1)%words.length].charAt(0);
            if(lastChar != nextChar){
                return false;
            }
        }
        return true;
    }
}