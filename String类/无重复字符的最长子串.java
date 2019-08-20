class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        char[] chars = s.toCharArray();
        int max = 0;
        int left = 0;
        for(int i = 0;i < chars.length;i++){
            for(int j = left;j < i;j++){
                if(chars[j] == chars[i]){
                    max = Math.max(max,i-left);
                    left = j+1;
                    break;
                }
            }
        }
        return Math.max(chars.length-left,max);
    }
}
