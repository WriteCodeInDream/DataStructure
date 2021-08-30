package oneCode;

import java.util.Scanner;

/**
 * 密码要求:
 *
 * 1.长度超过8位
 *
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 *
 * 3.不能有相同长度大于2的子串重复
 *
 * 输入描述：
 * 一组或多组长度超过2的字符串。每组占一行
 *
 * 输出描述：
 * 如果符合要求输出：OK，否则输出NG
 */
public class Hj20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.length()<=8){
                System.out.println("NG");
            }else {
                int lowCase = 0;
                int upCase = 0;
                int number = 0;
                int others = 0;
                for(int i = 0;i < line.length(); i++ ){
                    if(line.charAt(i)>128){
                        System.out.println("NG");
                        break;
                    }else {
                        if(line.charAt(i)<=57 && line.charAt(i)>=48){
                            number++;
                        }else if(line.charAt(i)<=90 && line.charAt(i)>=65){
                            upCase++;
                        }
                        else if(line.charAt(i)<=122 && line.charAt(i)>=97){
                            lowCase++;
                        }else {
                            others++;
                        }
                    }
                }
                // 判断是否含四种字符
            if(lowCase == 0 || upCase == 0 || number == 0 ||others == 0){
                System.out.println("NG");
            }
            // 判断是否有两个连续的重复字符串
            else {
                if(getHasSamStr(line,0,3)){
                    System.out.println("NG");
                }else {
                    System.out.println("OK");
                }
            }

            }
        }
    }

    private static boolean getHasSamStr(String line, int begin, int end){
        if(end >= line.length()){
            return false;
        }
        if(line.substring(end).contains(line.substring(begin,end))){
            return true;
        }else {
            return getHasSamStr(line, begin+1, end+1);
        }
    }
}
