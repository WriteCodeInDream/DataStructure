package oneCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这
 * 些图片按照大小（ASCII码值从小到大）排列收好。请大家给Lily帮忙，通过C语言解决。
 * 本题含有多组样例输入。
 * 输入描述：
 * Lily使用的图片包括"A"到"Z"、"a"到"z"、"0"到"9"。输入字母或数字个数不超过1024。
 * 输出描述：
 * Lily的所有图片按照从小到大的顺序输出
 */
public class Hj34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            List<Character> chList = new ArrayList<>();
            for(char ch : line.toCharArray()){
                chList.add(ch);
            }
            chList.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return o1 - o2;
                }
            });
            for(char ch:chList){
                System.out.print(ch);
            }
        }
    }
}
