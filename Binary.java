import java.util.Scanner;
public class Binary {
    public static void main(String args[]){
        String output="";
        int upper;
        int n=1;
        Scanner stdin=new Scanner(System.in);
        int input=stdin.nextInt();
        while(true){
            if(Math.pow(2,n)>input){
                upper=n-1;
                break;
            }
            else if(Math.pow(2,n)==input){
                upper=n;
                break;
            }            
            else
                n++;
        }
        for(int i=upper;i>=0;i--){
            int power=(int)Math.pow(2, i);
            if(power>input||input==0)
                output+="0";
            else if(input>=power){
                output+="1";
                input=input-power;
            }    
        }
        System.out.println(output);
    }
}
