import java.util.*;
class maxmin{
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
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++){
           if(a[i]>max)
           max=a[i];
            else if (a[i]<min)
            min=a[i];
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
}}