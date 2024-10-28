import java.util.HashMap;

public class leetcode242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "a"));
    }

    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> alpha = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(alpha.containsKey(s.charAt(i))) {
                alpha.put(s.charAt(i), alpha.get(s.charAt(i)) + 1);
            } else {
                alpha.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++) {
            if(alpha.containsKey(t.charAt(i)) && alpha.get(t.charAt(i)) > 0) {
                alpha.put(t.charAt(i), alpha.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        for(int i : alpha.values()) {
            if(i != 0) {
                return false;
            }
        }
        return true;

    }
}