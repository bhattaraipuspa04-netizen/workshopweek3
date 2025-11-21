import java.util.Scanner;

/**
 * Write a description of class passorfail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class passorfail
{
   public static void main(String[] args){
   Scanner input= new Scanner(System.in);
   int grade=input.nextInt();
    System.out.println(grade);
     String isValid =(grade>40)? "pass" : "fail";
         System.out.println(isValid);

     
   
    }
}