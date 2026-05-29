import java.util.*;
class prime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int k=0;
        for (int i=1; i<=n; i++){
            if (n%i==0){
                k=k+1;
            }
        }
        if (k==2){
        System.out.println("Prime");
    }
    else{
        System.out.println("Not prime");
    }}
}