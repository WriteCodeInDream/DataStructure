package oneCode;

import java.util.*;

/**
 * 定义一个单词的“兄弟单词”为：交换该单词字母顺序（注：可以交换任意次），而不添加、删除、修改原有的
 * 字母就能生成的单词。
 * 兄弟单词要求和原来的单词不同。例如：ab和ba是兄弟单词。ab和ab则不是兄弟单词。
 * 现在给定你n个单词，另外再给你一个单词str，让你寻找str的兄弟单词里，按字典序排列后的第k个单词是什么？
 * 注意：字典中可能有重复单词。本题含有多组输入数据。
 * 输入描述：
 * 先输入单词的个数n，再输入n个单词。 再输入一个单词，为待查找的单词x 最后输入数字k
 * 输出描述：
 * 输出查找到x的兄弟单词的个数m 然后输出查找到的按照字典顺序排序后的第k个兄弟单词，没有符合第k个的话则不用输出。
 */
public class Hj27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        List<String> strList = new ArrayList<>();
        String origin = null;
        List<String> strListAfter = new ArrayList<>();
        while (scanner.hasNext()){
            int totalNum = scanner.nextInt();
            for (int i = 0; i< totalNum; i++){
                strList.add(scanner.next());
            }
            origin = scanner.next();
            index = scanner.nextInt();
            break;
        }
        int sum = 0;
        for(String str : strList){
            if(isBrother(str, origin)){
                strListAfter.add(str);
                sum++;
            }
        }
        System.out.print(sum + " ");
        strListAfter.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        if(index < strListAfter.size()){
            System.out.println(strListAfter.get(index));
        }

    }

    private static boolean isBrother(String str1, String str2){
        if (str1.equals(str2)) {
            return false;
        }
        char[] charOne = str1.toCharArray();
        char[] charTwo = str2.toCharArray();
        Arrays.sort(charOne);
        Arrays.sort(charTwo);
        return Arrays.equals(charOne,charTwo);
    }
}
