package oneCode;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 *
 * 输入描述：
 * 输入一个十六进制的数值字符串。注意：一个用例会同时有多组输入数据，请参考帖子https://www.nowcoder.com/discuss/276处理多组输入的问题。
 *
 * 输出描述：
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 */
public class ChangeHEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个十六进制数字");
        String strHex;
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            strHex = str.substring(2);
            System.out.println(Integer.parseInt(strHex,16));
            System.out.println("输入十六进制数字继续");
        }

    }
}