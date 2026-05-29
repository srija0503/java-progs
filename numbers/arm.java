import java.util.*;
class arm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int s = 0;
        int cpy = n;
        int temp = n;
        int k = 0;
        while(temp > 0){
            k++;
            temp /= 10;
        }
        while(n > 0){
            int d = n % 10;
            s = s + (int)Math.pow(d, k);
            n = n / 10;
        }

        if(cpy == s)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }
}