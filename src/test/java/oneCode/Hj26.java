package oneCode;

import java.util.*;

/**
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * 如，输入： Type 输出： epTy
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * 如，输入： BabA 输出： aABb
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * 如，输入： By?e 输出： Be?y
 */
public class Hj26 {
        public String sort(String str) {
            // 先将英文字母收集起来
            List<Character> letters = new ArrayList<>();
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters.add(ch);
                }
            }
            // 将英文字母先排序好
            letters.sort(new Comparator<Character>() {
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1) - Character.toLowerCase(o2);
                }
            });
            // 若是非英文字母则直接添加
            StringBuilder result = new StringBuilder();
            for (int i = 0, j = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    result.append(letters.get(j++));
                }
                else {
                    result.append(str.charAt(i));
                }
            }
            return result.toString();
        }


        public static void main(String[] args) {
            Hj26 solution = new Hj26();
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine()) {
                String str = in.nextLine();
                String res = solution.sort(str);
                System.out.println(res);
            }
        }
    }


//    public static void main(String[] args) {
//        List<String> strs = new ArrayList();
//        strs.add("dsad");
//        strs.add("cxzf");
//        strs.add("fasd");
//        strs.add("dsad");
//        strs.add("dada");
//        strs.add("kjgs");
//        strs.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        for(String str : strs){
//            System.out.print(str+" ");
//        }
//    }
