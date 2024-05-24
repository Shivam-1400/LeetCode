class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freqs = new int[26];
        int[] scores = new int[26];
        for (int i = 0; i < letters.length; i++) {
            freqs[letters[i] - 'a']++;
            if (freqs[letters[i] - 'a'] == 1) {
                scores[letters[i] - 'a'] = score[letters[i] - 'a'];
            }
        }
        return helper(words, freqs, scores, -1);
    }
    private int helper(String[] words, int[] freqs, int[] scores, int i) {
        int max = 0;
        int current = 0;
        int breakIndex = -1;
        boolean stop = false;
        if (i != -1) {
            String word = words[i];
            // System.out.println(freqs[0]);
            for (int j = 0; j < word.length(); j++) {
                if (freqs[word.charAt(j) - 'a'] == 0) {
                    breakIndex = j;
                    stop = true;
                    break;
                } else {
                    current += scores[word.charAt(j) - 'a'];
                    freqs[word.charAt(j) - 'a']--;
                }
            }
        }
        if (!stop) {
            for (int j = i + 1; j < words.length; j++) {
                max = Math.max(max, helper(words, freqs, scores, j));
            }
        }
        
        if (stop) {
            String word = words[i];
            for (int j = 0; j < breakIndex; j++) {
                freqs[word.charAt(j) - 'a']++;
            }
            return 0;
        }
        if (i != -1) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                freqs[word.charAt(j) - 'a']++;
            }  
        }
        return max + current;
    }
}