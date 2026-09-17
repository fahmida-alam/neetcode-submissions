class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        java.util.HashMap<Character, Integer> map =
            new java.util.HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            map.put(
                sChar,
                map.getOrDefault(sChar, 0) + 1
            );

            map.put(
                tChar,
                map.getOrDefault(tChar, 0) - 1
            );
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
