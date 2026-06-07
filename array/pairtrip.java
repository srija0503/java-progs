import java.util.*;
class pairtrip{
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
        System.out.println("Enter target");
        int tar=sc.nextInt();
        System.out.println("Pair elements");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==tar)
            System.out.println(a[i]+ " "+ a[j]);
        }}
        System.out.println("Triplets elements");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                if(a[i]+a[j]+a[k]==tar)
            System.out.println(a[i]+" "+ a[j]+" "+a[k]);
        }}
}}}