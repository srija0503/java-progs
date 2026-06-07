import java.util.*;

class kleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter K");
        int k = sc.nextInt();

        for(int r = 1; r <= k; r++) {

            int temp = a[0];

            for(int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }

            a[n - 1] = temp;
        }

        System.out.println("Array after left rotation:");

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}