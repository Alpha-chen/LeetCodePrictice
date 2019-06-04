import java.util.HashMap;

/***
 * 无重复字符的最长子串
 */
public class NoRepeatChar {


    public static void main(String[] args) {


//        System.out.println("result->" + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("result->" + lengthOfLongestSubstring("abcabcbbetfaopwl"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int max = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);// 更新 left的位置
//                left = Math.max(left, i );// 更新 left的位置
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);// 更新 right的位置
        }
        return max;
    }
}
