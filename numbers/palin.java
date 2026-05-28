import java.util.*;
class palin{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int cpy;
        System.out.println("enter number");
        int n= sc.nextInt();
        cpy=n;
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
    if (cpy==r){
        System.out.println("Palindrome");
    }    
    else{
        System.out.println("Not palindrome");
    }
    }
}