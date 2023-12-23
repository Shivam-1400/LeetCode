class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        Set<Pair<Integer, Integer>> st= new HashSet<>();
        st.add(new Pair<>(x, y));
        
        for(char c: path.toCharArray()){
            if(c== 'N'){
                x++;
                if(st.contains(new Pair<>(x, y))){
                    return true;
                }
                st.add(new Pair<>(x, y));
            }
            else if(c== 'S'){
                x--;
                if(st.contains(new Pair<>(x, y))){
                    return true;
                }
                st.add(new Pair<>(x, y));
            }
            else if(c== 'E'){
                y++;
                if(st.contains(new Pair<>(x, y))){
                    return true;
                }
                st.add(new Pair<>(x, y));
            }
            else if(c== 'W'){
                y--;
                if(st.contains(new Pair<>(x, y))){
                    return true;
                }
                st.add(new Pair<>(x, y));
            }
        }
        return false;
    }
}