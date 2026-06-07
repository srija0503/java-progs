import java.util.*;

class majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean found = false;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
            }
            if(count > n / 2) {
                System.out.println("Majority element = " + a[i]);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("No majority element");
        }
    }
}