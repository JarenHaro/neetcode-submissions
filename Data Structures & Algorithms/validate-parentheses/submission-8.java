class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char c = 's';
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if ("{[(".indexOf(c) != -1) {
                stk.push(c);
            }
            else if ("}])".indexOf(c) == 0) {
                if (stk.empty()) {
                    return false;
                }
                else {
                    char match = stk.pop();
                    if (match != '{') {
                        return false;
                    }  
                }
                 
            }
            else if ("}])".indexOf(c) == 1) {
                if (stk.empty()) {
                    return false;
                }
                else {
                    char match = stk.pop();
                    if (match != '[') {
                    return false;
                    }
                }
            }
            else if ("}])".indexOf(c) == 2) {
                if (stk.empty()) {
                    return false;
                }
                else {
                    char match = stk.pop();
                    if (match != '(') {
                        return false;
                    }
                }
                
            }
        }
        if (!stk.empty()) {
            return false;
        }
        return true;
    }
}
