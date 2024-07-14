import java.util.*;
import java.io.*;

class Solution {
    public HashMap<Integer, Integer> findBracketMultiplicityMap(String s, int n) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                stack.push(i);
            else if (ch == ')') {
                ans.put(stack.pop(), i);
            }
        }
        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            int firstIdx = entry.getKey(), secondIdx = entry.getValue();
            int nextIdx = secondIdx + 1;
            if (nextIdx == n || (s.charAt(nextIdx) < 48 || s.charAt(nextIdx) > 57))
                ans.put(firstIdx, 1);
            else{
                int ptr = nextIdx;
                StringBuilder sb = new StringBuilder("");
                while(ptr < n && s.charAt(ptr) >= 48 && s.charAt(ptr) <= 57){
                    sb.append(s.charAt(ptr));
                    ptr++;
                }
                ans.put(firstIdx, Integer.parseInt(sb.toString()));
            }
        }
        return ans;
    }

    public Pair findElementData(String formula, int idx) {
        int ptr = idx;
        StringBuilder name = new StringBuilder("");
        name.append(formula.charAt(ptr));
        ptr++;
        while (ptr < formula.length() && (formula.charAt(ptr) >= 97 && formula.charAt(ptr) <= 122)) {
            name.append(formula.charAt(ptr));
            ptr++;
        }
        StringBuilder number = new StringBuilder("");
        while (ptr < formula.length() && (formula.charAt(ptr) >= 48 && formula.charAt(ptr) <= 57)) {
            number.append(formula.charAt(ptr));
            ptr++;
        }
        if (number.toString().equals(""))
            number.append('1');
        return new Pair(name.toString(), number.toString());
    }

    public String countOfAtoms(String formula) {
        int formulaLength = formula.length();
        HashMap<Integer, Integer> bracketMultiplicityMap = findBracketMultiplicityMap(formula, formulaLength);
        SortedMap<String, Integer> map = new TreeMap<>((a, b) -> {
            return a.compareTo(b);
        });
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        for (int i = 0; i < formulaLength; i++) {
            char ch = formula.charAt(i);
            if(ch >= 48 && ch <= 57) continue;
            if (ch == '(') {
                int myBracketMultiplicity = bracketMultiplicityMap.get(i);
                stack.push(stack.peek() * myBracketMultiplicity);
                continue;
            } 
            if (ch == ')') {
                stack.pop();
                continue;
            }
            Pair elementData = findElementData(formula, i);
            String elementName = elementData.name;
            int elementQuantity = Integer.parseInt(elementData.number);
            map.put(elementName, map.getOrDefault(elementName, 0) + (elementQuantity * stack.peek()));
            if(elementQuantity != 1) i += (elementData.name.length() + elementData.number.length() - 1);
            else i += (elementData.name.length() + elementData.number.length() - 2);
        }
        StringBuilder sb = new StringBuilder("");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
            if(entry.getValue() != 1) sb.append(entry.getValue());
        }
        return sb.toString();
    }
}

class Pair {
    String name;
    String number;

    Pair() {
    }

    Pair(String name, String number) {
        this.name = name;
        this.number = number;
    }
}