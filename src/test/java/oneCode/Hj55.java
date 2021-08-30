package oneCode;

import java.util.Scanner;

/**
 * 输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）
 * 的个数（一组测试用例里可能有多组数据，请注意处理）
 * 输入描述：
 * 一个正整数N。(N不大于30000)
 * 输出描述：
 * 不大于N的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.
 */
public class Hj55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            if(num>30000 || num <0){
                System.out.println("请输入0-30000的正整数");
                continue;
            }
            int count = 0;
            for (int i = 1; i < num; i++) {
                if(String.valueOf(i).contains("7") || i%7 == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
