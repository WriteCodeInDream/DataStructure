package oneCode;

import java.util.*;

/**
 * 问题描述：给出4个1-10的数字，通过加减乘除，得到数字为24就算胜利
 * 输入：
 * 4个1-10的数字。[数字允许重复，但每个数字仅允许使用一次，测试用例保证无异常数字。
 * 输出：
 * true or false
 * 本题含有多组样例输入。
 */
public class Hj67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int three = scanner.nextInt();
            int four = scanner.nextInt();
            if(isNormal(one) && isNormal(two) && isNormal(three) && isNormal(four)){
            }else {
                System.out.println("请输入0-10之间的整数");
                continue;
            }
            Set<Double> set1 = new HashSet<>();
            set1.add((double)one + two);
            set1.add((double)one - two);
            set1.add((double)one * two);
            set1.add((double)one / two);
            Set<Double> set2 = new HashSet<>();
            for(double d :set1){
                set2.add(d + three);
                set2.add(d - three);
                set2.add(d * three);
                set2.add(d / three);
            }
            boolean flag = false;
            for(double d : set2){
                if(canBe(d,four)){
                    flag = true;
                    break;
                }
            }
            System.out.println(flag);
        }

    }

    private static boolean isNormal(int num){
        return num >=0 && num <=10;
    }

    private static boolean canBe(double x,double y){
        if(x * y == 24 || x + y == 24 || x-y ==24 || x/y == 24){
            return true;
        }else {
            return false;
        }
    }
}
