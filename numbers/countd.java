import java.util.*;
class countd{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int k=0;
        while(n>0){
            int d=n%10;
            k=k+1;
            n=n/10;
        }
        System.out.println("count is: "+k);
    }
}