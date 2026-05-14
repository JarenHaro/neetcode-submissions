

class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        boolean finish = false;
        
        System.out.println(s);
        while (!finish) {
            if (s == "") {
                return true;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            if (start >= end) {
                finish = true;
                return true;
            }
            start++;
            end--;
        }
        return true;
    }
}
