// Given a string, find the length of the longest substring without repeating characters.

import java.util.HashSet;
import java.util.Set;

public class longestSubStr {
    private static int longestSubString(String s) {
        int n = s.length();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (unique(s, i, j))
                    answer = Math.max(answer, j - i);
            }
        }
        return answer;
    }

    private static boolean unique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    public static void main(String args[]){

        int answer = longestSubString( "abcababcd" );
    }
}


