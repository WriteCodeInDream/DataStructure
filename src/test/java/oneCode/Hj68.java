package oneCode;

import java.util.*;

/**
 * 查找和排序
 * 题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
 * 都按先录入排列在前的规则处理。
 * 例示：
 * jack      70
 * peter     96
 * Tom       70
 * smith     67
 *
 * 从高到低  成绩
 */
public class Hj68 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()){
            int total = s.nextInt();
            int rule = s.nextInt();
            Map<String,Integer> map = new HashMap<>();
            for(int i = 0;i < total; i++){
                // 升序排列
                map.put(s.next(),s.nextInt());
                //升序排列
            }

            String[] name = new String[map.keySet().size()];
            int[] score = new int[map.keySet().size()];
            int index = 0;
            for(String st: map.keySet()){
                name[index] = st;
                score[index] = map.get(st);
                index ++;
            }
            for(int i = 0;i<score.length;i++){
                for(int j = 0; j < score.length - 1 ; j ++){
                    int t;
                    String str;
                    if(score[j] > score[j+1]){
                        t = score[j];
                        score[j] = score[j+1];
                        score[j+1] = t;

                        str = name[j];
                        name[j] = name[j+1];
                        name[j+1] = str;
                    }
                }
            }
            // 从高到低
            if(rule == 0){
                for(int i = name.length - 1; i>=0;i--){
                    System.out.print(name[i] + " ");
                    System.out.println(score[i]);
                }
            }else if (rule == 1){
                for(int i = 0; i < name.length;i++){
                    System.out.print(name[i] + " ");
                    System.out.println(score[i]);
                }
            }else {
                System.out.println("请输入0 或 1");
                continue;
            }

        }
    }
}
