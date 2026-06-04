import java.util.*;
class sumavg{
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
        System.out.println();
        int s=0;
        for(int i=0;i<n;i++){
            s=s+a[i];
        }
        System.out.println("Sum is: " + s);
        double avg=(double)s/n;
        System.out.println("Average is: " + avg);
    }
}