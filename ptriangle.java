import java.util.Scanner;
public class ptriangle {
    public static void main(String args[]){
        Scanner stdin=new Scanner(System.in);
        pascal(stdin.nextInt());
    }
    public static void pascal(int rows){
    pascal(null,rows);   
    }
    private static void pascal(int[] array,int rows) { //a recursive function to print out pascal's triangle
        if(array==null){
            System.out.println(1);
            System.out.println(1+" "+1);
            array=new int[2];
            array[0]=1;
            array[1]=1;
            pascal(array,rows);
        }
        else{
            if(array.length==rows+1)
                return;
            else{
                int[] rtn=new int[array.length+1];
                rtn[0]=1;
                if(array.length-2!=0)
                System.out.print(1+" ");
                for(int i=1;i<=array.length-2;i++){
                    rtn[i]=array[i]+array[i-1];
                    System.out.print(rtn[i]+" ");
                }
                rtn[array.length-1]=1;
                if(array.length-2!=0){
                System.out.print(1);
                System.out.println();
                }
                pascal(rtn,rows);
        }
}
}
}