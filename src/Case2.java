/**
 * Author: bjccdsrlcr
 * Date: 2017/12/11 0011
 * Time: 14:54
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
输入描述:
输入一个有字母和数字以及空格组成的字符串，和一个字符。
输出描述:
输出输入字符串中含有该字符的个数。
示例1
输入

ABCDEF A
输出

 1
 */

public class Case2 {
    public static int case2(String str, String a){
        String array[] = str.split("");
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i].equalsIgnoreCase(a)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int count = case2("sdasd", "a");
        System.out.print(count);
    }
}