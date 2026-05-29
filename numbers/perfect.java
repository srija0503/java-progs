import java.util.*;
class perfect{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int s=0;
        int cpy=n;
        for (int i=1;i<n;i++){
            if (n%i==0){
                s=s+i;
            }
        }
        if (cpy==s)
        System.out.println("perfect");
        else
        System.out.println("not perfect");
        }
}