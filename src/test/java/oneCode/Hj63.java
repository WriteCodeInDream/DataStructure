package oneCode;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 一个DNA序列由A/C/G/T四个字母的排列组合组成。G和C的比例（定义为GC-Ratio）
 是序列中G和C两个字母的总的出现次数除以总的字母数目（也就是序列长度）。在基因工程中，这个比例非常重要。
 因为高的GC-Ratio可能是基因的起始点。
 给定一个很长的DNA序列，以及限定的子串长度N，请帮助研究人员在给出的DNA序列中从左往右找出GC-Ratio最高且长
 度为N的第一个子串。
 DNA序列为ACGT的子串有:ACG,CG,CGT等等，但是没有AGT，CT等等
 输入描述：
 输入一个string型基因序列，和int型子串的长度
 输出描述：
 找出GC比例最高的子串,如果有多个则输出第一个的子串
 */
public class Hj63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.next();
            int length = scanner.nextInt();
            String need = null;
            float f = 0f;
            for(int i = 0; i < line.length() - length + 1;i++){
                int end = i + length;
                    if(rad(line.substring(i,end)) > f){
                        f = rad(line.substring(i,end));
                        need = line.substring(i,end);
                    }
            }
            System.out.println(need);
        }

    }

    private static float rad(String line){
        String lineAfter = line.toUpperCase();
        int count = 0;
        for(char ch : lineAfter.toCharArray()){
            if(ch == 'C' || ch == 'G'){
                count++;
            }
        }
        float rate = (float) count/line.length();
        return rate;
    }

    @Test
    private static void test(){
        System.out.println(rad("AC"));
    }

    @Test
    private void test1(){
        System.out.println("acft".substring(2,4));
    }
}
