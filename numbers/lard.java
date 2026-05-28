import java.util.*;
class lard{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int max=0;
        while(n>0){
            int d=n%10;
            if (max<d){
                max=d;
            }
            n=n/10;
        }
        System.out.println("largest is: "+max);
    }
}