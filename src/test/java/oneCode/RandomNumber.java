package oneCode;

import java.util.*;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1
 * 000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着
 * 不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”
 * 与“排序”的工作(同一个测试用例里可能会有多组数据(用于不同的调查)，希望大家能正确处理)。
 *
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组
 */
public class RandomNumber {
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       System.out.println("请输入一个正整数");
       while (scanner.hasNextInt()){
           int num = scanner.nextInt();
           System.out.println(num);
           Set<Integer> numberSet = new HashSet();
           for(int i = 0; i<num; i++){
               numberSet.add(random.nextInt(100));
           }
           List<Integer> numberList = new ArrayList(numberSet);
           for(int i = 0; i<numberList.size();i++){
               for(int j = 0; j < numberList.size()-1;j++){
                   int a = numberList.get(j);
                   int b = numberList.get( j + 1);
                   if(a > b){
                       numberList.set(j,b);
                       numberList.set(j+1,a);
                   }
               }
           }
           System.out.println(numberList);
           System.out.println("输入正整数继续或其他字符退出");
       }
   }
}
