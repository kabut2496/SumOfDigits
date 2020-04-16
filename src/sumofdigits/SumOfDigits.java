/**
 * Karl Butler
 * 4/16/2020
 * Sum of Digits
 * The purpose of this program is to add the sum of a numbers digits 
 */
package sumofdigits;
import javax.swing.JOptionPane;
/**
 *
 * @author Karl Butler
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
* declaring variables
* num is the number that the user inputs
* nNum is used to help keep track of the number as it gets shortened
* num2 is used to be the sum of the numbers digits
*/
        String gNum;
        int num,nNum,num2;
        nNum=0;
        num2=0;
        
//used to get the users numbers

        gNum=JOptionPane.showInputDialog("Pleas input the number that you would like to add the sum of it's digets");
        num=Integer.parseInt(gNum);
        
//used to call the recursive method

        math(num,nNum,num2);
    }
    
    public static void math(int num,int nNum,int num2){
// This method is the all the math behid the program

    num2=num2+nNum;
        
        if(num<=1){
            num2=num2+num;
            System.out.println("The sum of the digets of the number you enterd is " + num2);
        }else{
            nNum= num%10;
            num=num/10;
            
            math(num,nNum,num2);
        }
        
    }
    
}
