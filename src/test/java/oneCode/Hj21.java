package oneCode;

import java.util.Scanner;

/**
 * 密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠
 * 它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。
 * 假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算
 * 法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，怎么忘都忘
 * 不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。
 * 他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7,
 * tuv--8 wxyz--9, 0--0,就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
 * 声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，
 * 如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
 */
public class Hj21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要转换的密码");
        while (scanner.hasNextLine()){
            String password = scanner.nextLine();
            for(int i = 0;i<password.length();i++){
                if(password.charAt(i)<=122 && password.charAt(i) >= 97){
                    if("abc".indexOf(password.charAt(i)) != -1){
                        password= password.replace(password.charAt(i),'2');
                    }else if("edf".indexOf(password.charAt(i)) != -1){
                        password= password.replace(password.charAt(i),'3');
                    }else if("ghi".indexOf(password.charAt(i)) != -1){
                        password=password.replace(password.charAt(i),'4');
                    }else if("jkl".indexOf(password.charAt(i)) != -1){
                        password= password.replace(password.charAt(i),'5');
                    }else if("mno".indexOf(password.charAt(i)) != -1){
                        password= password.replace(password.charAt(i),'6');
                    }else if("pqrs".indexOf(password.charAt(i)) != -1){
                        password=password.replace(password.charAt(i),'7');
                    }else if("tuv".indexOf(password.charAt(i)) != -1){
                        password= password.replace(password.charAt(i),'8');
                    }else if("wxyz".indexOf(password.charAt(i)) != -1){
                        password=password.replace(password.charAt(i),'9');
                    }
                }
            }
            for(int i = 0;i<password.length();i++) {
                if (password.charAt(i) < 90 && password.charAt(i) >= 65) {
                    password = password.replace(password.charAt(i), (char) (password.charAt(i) + (33)));
                } else if (password.charAt(i) == 90) {
                    password = password.replace(password.charAt(i), 'a');
                }
            }
            System.out.println(password);
        }
    }
}
