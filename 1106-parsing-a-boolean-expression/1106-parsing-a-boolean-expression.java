class Solution {
    private int pos; 
    public boolean parseBoolExpr(String expression) {
        pos = 0;
        return parse(expression.toCharArray());
    }
    
    private boolean parse(char[] expr) {
        char curr = expr[pos];
        
        if (curr == 't') {
            pos++;
            return true;
        }
        if (curr == 'f') {
            pos++;
            return false;
        }
        
        char operator = curr;
        pos += 2;
        List<Boolean> values = new ArrayList<>();
        
        while (pos < expr.length && expr[pos] != ')') {
            if (expr[pos] == ',') {
                pos++;
                continue;
            }
            values.add(parse(expr));
        }
        
        pos++;  
        return switch (operator) {
            case '!' -> !values.get(0);
            case '&' -> values.stream().allMatch(Boolean::booleanValue);
            case '|' -> values.stream().anyMatch(Boolean::booleanValue);
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}