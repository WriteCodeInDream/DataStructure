package oneCode;

import java.util.Scanner;

/**
 * 查找两个字符串a,b中的最长公共子串。若有多个，输出在较短串中最先出现的那个。
 * 注：子串的定义：将一个字符串删去前缀和后缀（也可以不删）形成的字符串。请和“子序列”的概念分开！
 * 本题含有多组输入数据！
 * 输入描述：
 * 输入两个字符串
 * 输出描述：
 * 返回重复出现的字符
 */
public class Hj65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
            while (scanner.hasNext()){
                String line1 = scanner.nextLine();
                String line2 = scanner.nextLine();
                System.out.println(getCom(line1,line2));
            }
        }
    }

    private static String getCom(String line1, String line2) {
        if(line1.length() > line2.length()){
            return getCom(line2, line1);
        }
        for(int i = line1.length(); i > 0;i--){
            for(int j = 0; j <line1.length() - i + 1;j++){
                if(line2.contains(line1.substring(j,j+i))){
                    return line1.substring(j,j+i);
                }
            }
        }
        return null;
    }
}
