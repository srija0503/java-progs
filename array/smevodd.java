import java.util.*;
class smevodd{
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
        Arrays.sort(a);
        System.out.println("2nd largest is: "+ a[n-2]);
        System.out.println("2nd smallest is: "+ a[1]);
        for(int i=0;i<n;i++){
            if (a[i]%2==0)
            System.out.println("even: " +a[i]);
            else
            System.out.println("odd: " +a[i]);
        }
}}