import java.util.*;
class repeat{
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
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
            if(a[i] == a[j]) {
            System.out.println("First repeating element: " + a[i]);
            return;
        }
    }
}
System.out.println("No repeating element");
}}