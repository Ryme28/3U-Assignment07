
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author messr2578
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many people in the class");
        int numb = input.nextInt();
        int arynumb = 0;
        int[] array = new int[numb];
        int[] arry = new int[arynumb];
        while (numb >= arynumb) {
            System.out.println("input a mark");
            array[arynumb] = input.nextInt();
            arynumb = arynumb + 1;
            if (numb == arynumb) {
                break;
            }
        }
        int y=arynumb-1;
        double total = 0;
        while (y >= 0) {
            total = total + array[y];
            y = y - 1;
            if (y < 0) {
                break;
            }
        }
        double fina = total / numb;
        System.out.println("the class average is "+ fina);
    }
}
