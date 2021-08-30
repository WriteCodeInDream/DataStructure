package oneCode;

import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * 输入描述：
 * 连续输入字符串(输入多次,每个字符串长度小于100)
 *
 * 输出描述：
 * 输出到长度为8的新字符串数组
 */
public class ContinueString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        int length = line.length();
        int left = length % 8;
        int sum = length / 8;
        StringBuilder sb = new StringBuilder(line);

        String[] stringArray;
        if (left != 0) {
            for (int i = 0; i < 8 - left; i++) {
                sb.append("0");
            }
            stringArray = new String[sum+1];
        }else {
            stringArray = new String[sum];

        }
        String stringAfter = sb.toString();
            for (int i = 0; i < (left == 0?sum:sum+1); i++) {
                stringArray[i] = stringAfter.substring(i * 8, (i + 1) * 8);
            }
            for (int i = 0; i < stringArray.length; i++) {
                System.out.println(stringArray[i]);
            }
        }
    }
