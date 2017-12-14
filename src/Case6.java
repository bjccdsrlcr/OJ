import java.util.Scanner;

/**
 * Author: bjccdsrlcr
 * Date: 2017/12/11 0011
 * Time: 20:36
 */
public class Case6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long data = scanner.nextLong();
        for(int i=2; i<=data; i++){
            if(data%i==0){
                System.out.println(i + " ");
                data = data/i;
                i=1;
            }
        }
    }

}
