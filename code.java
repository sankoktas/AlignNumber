/**This program aims to align the output from CW004 in an orderly fashion.
 * @author (Fikri San Koktas)
 * @version (12 October 2020)
 */
import java.util.Scanner;
public class KFS_AlignNumber_Main
{  
     public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the bigger integer: ");
        int biginteger = in.nextInt();
        
        System.out.print("Please enter the smaller integer: ");
        int smallinteger = in.nextInt();
        
        int sum = biginteger + smallinteger ;
        System.out.println("Sum:                " + sum);
       
        int difference = biginteger - smallinteger ;
        System.out.println("Difference:         " + difference);
        
        int multiplication = biginteger * smallinteger ;
        System.out.println("Multiplication:     " + multiplication);
        
        double average = (biginteger + smallinteger)/2.0 ;
        System.out.println("Average:            " + average);
    }
}
