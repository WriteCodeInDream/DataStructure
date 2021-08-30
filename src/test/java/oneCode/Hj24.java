package oneCode;

import java.util.*;

/**
 * 计算最少出列多少位同学，使得剩下的同学排成合唱队形
 * 说明：
 * N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
 * 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则
 * 他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
 * 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
 * 注意：不允许改变队列元素的先后顺序 且 不要求最高同学左右人数必须相等
 * 请注意处理多组输入输出！
 * 备注：
 * 1<=N<=3000
 * 输入描述：
 * 有多组用例，每组都包含两行数据，第一行是同学的总数N，第二行是N位同学的身高，以空格隔开
 *
 * 输出描述：
 * 最少需要几位同学出列
 */
public class Hj24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入总人数：");
        Map<String, List<Integer>> map = new HashMap<>();
        int index = 1;
        while (scanner.hasNextInt()){
            int total = scanner.nextInt();
            List heightList = new ArrayList();
            for(int i = 0; i<total;i++){
                heightList.add(scanner.nextInt());
            }
            map.put(String.valueOf(index),heightList);
        }

        for(String str : map.keySet()){
            List<Integer> strList = map.get(str);
            int max;
            int sum = 0;
            for (int i = 0; i<strList.size(); i++){
                int currentSum = 1;
                max = strList.get(i);
                for(int j = 0; j<strList.size() - 1; j++ ){
                    if(strList.get(j+1) > max){
                        currentSum++;
                        max = strList.get(j+1);
                    }
                }
                if(currentSum > sum){
                    sum = currentSum;
                }
            }
            for (int i = 0; i<strList.size(); i++){
                int currentSum = 1;
                max = strList.get(i);
                for(int j = 0; j<strList.size()-1; j++ ){
                    if(strList.get(j+1) < max){
                        currentSum++;
                        max = strList.get(j+1);
                    }
                }
                if(currentSum > sum){
                    sum = currentSum;
                }
            }
            System.out.println(sum);
        }

    }
}
