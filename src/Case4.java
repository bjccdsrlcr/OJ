import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: bjccdsrlcr
 * Date: 2017/12/11 0011
 * Time: 16:44
 *
 *题目描述
•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
输入描述:
连续输入字符串(输入2次,每个字符串长度小于100)
输出描述:
输出到长度为8的新字符串数组
示例1
输入

abc
123456789
输出

abc00000
12345678
90000000
 */
public class Case4 {
    public static String[] case4(String string){
        String array[] = new String[20];
        if (string.length()==0){
            array[0]="";
            return array;
        }
        if (string.length()>0 && string.length()<=8){
            while (string.length()<8){
                string+='0';
            }
            array[0] = string;
            return array;
        }else{
            int len = string.length();
            int consult = string.length()/8;
            int residue = len%8;
            array[0] = string.substring(0, 8);
            for (int i=1;i<consult;i++){
                array[i] = string.substring(8*i, 8*i+8);
            }
            int len1 = len-consult*8;
            if (residue == 0){
                array[consult]=null;
            }else {
                String lastString = string.substring(consult*8, consult*8+len1);
                while ((8-residue)>0){
                    lastString+='0';
                    residue++;
                }
                array[consult] = lastString;
            }
            return array;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String s = scanner.nextLine();
            String s1 = scanner.nextLine();
            String[] aa = case4(s);
            String[] bb = case4(s1);
            for (int i=0; i<aa.length; i++){
                if (aa[i]!=null){
                    System.out.println(aa[i]);
                }
            }
            for (int i=0; i<bb.length; i++){
                if (bb[i]!=null){
                    System.out.println(bb[i]);
                }
            }

    }
}
