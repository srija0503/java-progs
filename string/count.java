import java.util.*;
class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine().toLowerCase();
       int n=0;
       int cc=0;
        int vc=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='0'||ch=='1')
            n++;
            else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            vc++;
            else
            cc++;
        }
        System.out.print(n+" "+cc+" "+vc);
    }
}