class Solution {
    public String customSortString(String S, String T) {
        char[] s = S.toCharArray();  
        char[] t = T.toCharArray();  
        int[] map = new int[26];  
        StringBuilder newString = new StringBuilder();
        
        for(int i = 0; i < t.length; i++) {  
            int index = t[i] - 'a';  
            map[index]++;  
        }  
        
        for(int i = 0; i < s.length; i++) {  
            int index = s[i] - 'a';  
            while(map[index] > 0) {  
                newString.append(s[i]);  
                map[index]--;  
            }  
        }  
        
        for(int i=0; i < 26; i++) {  
            while(map[i] > 0) {  
                newString.append((char)(i + 'a'));  
                map[i]--;  
            }  
        }  
        
        return newString.toString();  
    }
}
