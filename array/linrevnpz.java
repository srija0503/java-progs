import java.util.*;
class linrevnpz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Elements are");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("Enter search eement");
        int tar=sc.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            if (a[i]==tar){
            k=1;
            break;}
        }
        if(k==1)
        System.out.println("present");
        else
        System.out.println("not present");
        for(int i=0;i<n;i++){
            if(a[i]>0)
            System.out.println("Positives are: "+a[i]);
            else if(a[i]<0)
            System.out.println("Negatives are: "+a[i]);
            else if(a[i]==0)
            System.out.println("zeros present are: "+a[i]);
        }
        System.out.println("Reverse is: ");
        for(int i = n - 1; i >= 0; i--) {
    System.out.println(a[i]);
}
}}