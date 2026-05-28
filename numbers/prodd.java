import java.util.*;
class prodd{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int p=1;
        while(n>0){
            int d=n%10;
            p=p*d;
            n=n/10;
        }
        System.out.println("Reverse is: "+p);
    }
}