import java.util.*;
class sumd{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int s=0;
        while(n>0){
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println("Sum of digits is: "+s);
    }
}