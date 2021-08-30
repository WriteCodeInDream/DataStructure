package oneCode;

import java.util.Scanner;

/**
 * 1、对输入的字符串进行加解密，并输出。
 * 2、加密方法为：
 * 当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 * 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
 * 其他字符不做变化。
 * 3、解密方法为加密的逆过程。
 * 本题含有多组样例输入
 */
public class Hj29 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一串要加密的密码");
        while (scanner.hasNext()){

            String str1 = scanner.next();
            System.out.println("请输入一床要解密的密码");
            String str2 = scanner.next();
            System.out.println(add(str1));
            System.out.println(pull(str2));
        }
    }


    private static String add(String str){
        char[] charArray = str.toCharArray();
        for(int i = 0; i< charArray.length; i ++){
            if(Character.isLowerCase(charArray[i])){
                if(charArray[i] == 122){
                    charArray[i] = 'A';
                }else {
                    charArray[i] = (char)(charArray[i] - 31);
                }
            }else if(Character.isUpperCase(charArray[i])){
                if(charArray[i] == 90){
                    charArray[i] = 'a';
                }else {
                    charArray[i] = (char)(charArray[i] + 33);
                }
            }else {
                if(charArray[i] == 57){
                    charArray[i] = '0';
                }else {
                    charArray[i] = (char)(charArray[i] + 1);
                }
            }
        }
        return String.valueOf(charArray);
    }

    private static String pull(String str){
        char[] charArray = str.toCharArray();
        for(int i = 0; i< charArray.length; i ++){
            if(Character.isLowerCase(charArray[i])){
                if(charArray[i] == 97){
                    charArray[i] = 'Z';
                }else {
                    charArray[i] = (char)(charArray[i] - 33);
                }
            }else if(Character.isUpperCase(charArray[i])){
                if(charArray[i] == 65){
                    charArray[i] = 'z';
                }else {
                    charArray[i] = (char)(charArray[i] + 31);
                }
            }else {
                if(charArray[i] == 48){
                    charArray[i] = '9';
                }else {
                    charArray[i] = (char)(charArray[i] - 1);
                }
            }
        }
        return String.valueOf(charArray);
    }
}
