import java.util.*;
class missing{
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
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int miss=s-sum;
        System.out.println("Missing number: "+miss);
}}