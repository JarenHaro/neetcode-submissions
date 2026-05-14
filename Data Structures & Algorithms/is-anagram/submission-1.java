class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        String sortedString1 = new String(s1);
        String sortedString2 = new String(s2);
        System.out.println(sortedString1);
        System.out.println(sortedString2);
        
        for (int i = 0; i < s.length(); i++) {
            if (s.length() != t.length()) {
                return false;
            }
            if (sortedString1.charAt(i) != sortedString2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
