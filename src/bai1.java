import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, kt = 1;
        do {
            System.out.println("Nhập Phần tử của mảng:");
            n = sc.nextInt();
        }
        while (n <= 0);
        int A[] = new int[n];
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            if (A[i] != A[n - i - 1]) {
                kt = 0;
                break;
            }
        }
            if (kt == 0) {
                System.out.println("Mảng 1 chiều vừa nhập không là mảng đối xứng");
            }
            else
                System.out.println("Mảng 1 chiều vừa nhập là mảng đối xứng");
    }
}

