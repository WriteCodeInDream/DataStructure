package oneCode;

import java.util.Scanner;

/**
 * 输入两个用字符串表示的整数，求它们所表示的数之和。
 * 字符串的长度不超过10000。
 * 本题含有多组样例输入。
 * 输入描述：
 * 输入两个字符串。保证字符串只含有'0'~'9'字符
 * 输出描述：
 * 输出求和后的结果
 */
public class Hj57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            if(line1.length()>10000 ||line2.length() > 10000){
                System.out.println("字符串长度应小于10000");
                continue;
            }else {
                System.out.println(getSum(line1,line2));
            }
        }
    }

    private static String getSum(String line1 , String line2){
        if(line1.length() > line2.length()){
            return getSum(line2 , line1);
        }
        int[] line1List = new int[line1.length()];
        int[] line2List = new int[line2.length() + 1];
        for(int i = line1.length() - 1,index = 0; i >= 0 ; i--){
            try {
                line1List[index] = (Integer.parseInt(String.valueOf(line1.charAt(i))));
                index++;
            }catch (Exception e){
                System.out.println("请输入数字");;
            }

        }
        for(int i = line2.length() - 1,index = 0; i>= 0; i--){
            try {
                line2List[index] = (Integer.parseInt(String.valueOf(line2.charAt(i))));
                index++;
            }catch (Exception e){
                System.out.println("请输入数字");;
            }

        }
        line2List[line2.length()] = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line1List.length; i++) {
            System.out.print(line1List[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < line2List.length; i++) {
            System.out.print(line2List[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<line1.length();i++){
            line2List[i] = line2List[i] + line1List[i];
            if(line2List[i] >=10){
                line2List[i] = line2List[i] - 10;
                line2List[i+1] = line2List[i + 1] + 1;
            }
        }

        for(int i = line2List.length - 1 ;i >= 0 ;i--){
            if(!( line2List[i] == 0 && sb.length() == 0)){
                sb.append(line2List[i]);
            }
        }
        return sb.toString();
    }
}
