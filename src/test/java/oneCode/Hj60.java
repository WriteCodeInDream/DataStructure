package oneCode;

import java.util.Scanner;

/**
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求
 * 输出组成指定偶数的两个素数差值最小的素数对。
 * 本题含有多组样例输入。
 * 输入描述：
 * 输入一个偶数
 * 输出描述：
 * 输出两个素数
 */
public class Hj60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            for(int i = 0; i <num / 2 ;i ++){
                int numOne = num / 2 +i;
                int numTwo = num /2 - i;
                if(isShu(numOne) && isShu(numTwo)){
                    System.out.println(numTwo);
                    System.out.println(numOne);
                    break;
                }
            }
        }
    }

    private static boolean isShu(int num){
        for(int i = 2;i < num; i ++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
