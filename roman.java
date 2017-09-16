/**
 *  A program which changes roman numeral to
 *  hindu arabic  numeral and expects the input to be correct 
 *  according to the rules of roman numbers
 *  it doesn't throws custom exceptions 
 * @author ronit
 */
import java.util.HashMap;
import java.util.Scanner;
public class roman {
    public static void main(String args[]){
        System.out.print("Enter a correct roman numeral ? ");
        Scanner stdin=new Scanner(System.in);
        int result=convert(stdin.nextLine());
        System.out.println("The number in hindu arabic fromat is "+result);
    }
    public static int convert(String numeral){
        int value=0;
        int pos=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        value=map.get(numeral.charAt(pos));
        pos++;
        while(pos<=numeral.length()-1||(numeral.length()==2&&pos==1)){
            char current=numeral.charAt(pos);
            int buffer=map.get(current);
            int last=map.get(numeral.charAt(pos-1));
            int next=0;
            if(pos==numeral.length()-1)
                ;
            else
                next=map.get(numeral.charAt(pos+1));
            if(next>buffer&&last>buffer){
                value+=(next-buffer);
                pos++;
            }            
            else if(last>=buffer) 
                value+=buffer;
            else 
                value=buffer-value;
            pos++;
        }
        return value;
    }
}
