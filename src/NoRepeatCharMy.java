import java.util.HashMap;

/**
 * @author xupangen on 2019/6/4.
 */

public class NoRepeatCharMy {

    public static void main(String[] args) {
        System.out.println("map->" + getNoRepeatCharLength("abcabcbbetfaopwl"));
    }

    public static int getNoRepeatCharLength(String s) {
        if ("".equals(s)) return -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int length = s.length();
        int left = 0;
        int max = 0;
        String temp ="";
//        StringBuilder sn=new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(s.charAt(i))) {
//                sn= new StringBuilder();
                left = Math.max(left, map.get(s.charAt(i)) + 1);// 更新 left 位置,移除 相同元素
            }
            map.put(s.charAt(i), i);
//            sn.append(new Character(s.charAt(i)));
            max = Math.max(max, i - left + 1);
        }
//        System.out.println("str->="+sn.toString());
        return max;

    }
}
