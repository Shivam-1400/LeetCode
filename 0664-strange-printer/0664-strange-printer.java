class Solution {
    public int strangePrinter(String s) {
        int size = s.length();
        int turnsNeeded[][] = new int[size][size];
        for(int indx = 0; indx < size; indx++){
            turnsNeeded[indx][indx] = 1;
        }
        for(int len = 2; len <= size; len++){
            for(int startIndx = 0; startIndx + len - 1 < size; startIndx++){
                int endIndx = startIndx + len -1;
                int minPrevStateContri = size;
                for(int brkPtIndx = startIndx; brkPtIndx < endIndx; brkPtIndx++){
                    int prevStateContri  = turnsNeeded[startIndx][brkPtIndx] + turnsNeeded[brkPtIndx+1][endIndx];
                    
                    if(s.charAt(brkPtIndx) == s.charAt(endIndx))prevStateContri--;
                    minPrevStateContri = Math.min(minPrevStateContri, prevStateContri);
                }
                turnsNeeded[startIndx][endIndx] = minPrevStateContri;
            }
        }
        return turnsNeeded[0][size - 1];
    }
}