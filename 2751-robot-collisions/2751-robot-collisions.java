class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Set<Integer> st = new HashSet<>();
        Map<Integer, Pair<Integer, Boolean>> mp = new TreeMap<>();

        for (int i = 0; i < positions.length; i++) 
            mp.put(positions[i], new Pair<>(healths[i], directions.charAt(i) == 'R'));
        
        Stack<Integer> st2 = new Stack<>();
        
        for (Integer robot : mp.keySet()) {
        
            if (mp.get(robot).getValue())
                st2.push(robot);
            
            else {
                boolean flag = true;
                while (!st2.isEmpty()) {
                    int leftRobot = st2.pop();
                    int leftHP = mp.get(leftRobot).getKey();
                    int rightHP = mp.get(robot).getKey();
            
                    if (leftHP < rightHP)
                        mp.put(robot, new Pair<>(rightHP-1, false));
                    
                    else if (leftHP > rightHP) {
                        mp.put(leftRobot, new Pair<>(leftHP-1, true));
                        st2.push(leftRobot);
                        break;
                    }
                    
                    else {
                        flag = false;
                        break;
                    }
                }
                
                if (flag && st2.isEmpty())
                    st.add(robot);
            }
        }
        while (!st2.isEmpty())
            st.add(st2.pop());

        
        List<Integer> ans = new ArrayList<>();
        for (int robot : positions) {
            if (st.contains(robot))
                ans.add(mp.get(robot).getKey());
        }
        
        
        return ans;
    }
}