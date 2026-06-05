import java.util.*;
class zeesta{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();}
        System.out.println("Elements are");
        for(int i=0;i<n;i++){
        System.out.println(a[i]);}
        System.out.println("zeros at start");
         for(int i = 0; i < n; i++) {
    if(a[i] == 0) {
        System.out.println(a[i]);
    }}
        for(int i=0;i<n;i++){
        if (a[i]!=0){
        System.out.println(a[i]);}}
}}