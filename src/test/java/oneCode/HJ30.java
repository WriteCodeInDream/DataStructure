package oneCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 按照指定规则对输入的字符串进行处理。
 * 详细描述：
 * 将输入的两个字符串合并。
 * 对合并后的字符串进行排序，要求为：下标为奇数的字符和下标为偶数的字符分别从小到大排序。这里的下标意思是字符在字
 * 符串中的位置。
 * 对排序后的字符串进行操作，如果字符为‘0’——‘9’或者‘A’——‘F’或者‘a’——‘f’，则对他们所代表的16进制的数进行BIT
 * 倒序的操作，并转换为相应的大写字符。如字符为‘4’，为0100b，则翻转后为0010b，也就是2。转换后的字符为‘2’；
 * 如字符为‘7’，为0111b，则翻转后为1110b，也就是e。转换后的字符为大写‘E’。
 * 举例：输入str1为"dec"，str2为"fab"，合并为“decfab”，分别对“dca”和“efb”进行排序，
 * 排序后为“abcedf”，转换后为“5D37BF”
 * 注意本题含有多组样例输入
 * 输入描述：
 * 本题含有多组样例输入。每组样例输入两个字符串，用空格隔开。
 * 输出描述：
 * 输出转化后的结果。每组样例输出一行。
 */
public class HJ30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str1 = scanner.next();
            String str2 = scanner.next();
            String str = str1 + str2;
            char[] strChar = str.toCharArray();
            List<Character> charOdd = new ArrayList<>();
            List<Character> charEven = new ArrayList<>();
            for(int i = 0; i< strChar.length; i++){
                if(i % 2 == 0){
                    charEven.add(str.charAt(i));
                }else {
                    charOdd.add(str.charAt(i));
                }
            }
            charOdd.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o1 - o2;
                }
            });
            charEven.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o1 - o2;
                }
            });

            for(char ch : charEven){

            }

            for(char ch : charOdd){

            }
            StringBuilder sb = new StringBuilder();
            for(char a : charEven){
                sb.append(a);
            }for(char a : charOdd){
                sb.append(a);
            }
        }
    }

    public static char getChange(char ch){
        StringBuilder sb = new StringBuilder();
        if(Character.isLetter(ch)){
            Character.toUpperCase(ch);
        }else {
            int chInt = Integer.parseInt(String.valueOf(ch));
            int i = 2;
            while (chInt >= i ){
                sb.append(chInt % 2 );
                chInt = chInt / 2;
            }
        }

        return ' ';
    }
}
