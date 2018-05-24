class Solution {
    public String reverseString(String s) {
        char[] result = s.toCharArray();
        int hl = s.length() / 2;
        char temp;
        
        for (int i = 0; i < hl; i++) {
            temp = result[s.length() - 1 - i];
            result[s.length() - 1 - i] = result[i];
            result[i] = temp;
        }
        
        return new String(result);
    }
}
