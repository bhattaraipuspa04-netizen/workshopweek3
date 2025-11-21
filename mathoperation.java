
/**
 * Write a description of class mathoperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathoperation
{
    public static void main(String[] args){
    int a=1;
    int b=2;
    int c=a+b;
    System.out.println(c); //arthematic
    System.out.println(a++); //post
        System.out.println(++a); //pre
        //relational
        if (a==b){;
           System.out.println("same value");
        }else{ System.out.println("it is not same");
        }
    
        //logical
        if (a>0 && b>0){
                System.out.println("its true");
            }

        
        //
        String isValid=(a>= 18)? "adult" : "minor";
            System.out.println(isValid);

        
 

    
    
    }
}