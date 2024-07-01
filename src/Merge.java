import java.util.Scanner;

public class Merge {
    public static void inputArr(Scanner sc,int arr[]) {
        for(int i =0;i < arr.length;i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void printArr(int arr[]) {
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int arr[]) {
        for(int i = 0 ;i < arr.length;i++) {
            for(int j = 0; j < arr.length - i - 1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int linearSearch(int arr[],int target) {
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == target) {
                return  i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang:");
        int n = scanner.nextInt();
        System.out.println("Nhap phan tu mang:");
        int arr[] = new int[n];
        inputArr(scanner,arr);
        System.out.println("Mang ban dau:");
        printArr(arr);
        System.out.println("Mang sau khi sap xep:");
        bubbleSort(arr);
        printArr(arr);

        System.out.println("Nhap vi tri can tim:");
        int target = scanner.nextInt();
        int result = linearSearch(arr,target);
        if(result != -1) {
            System.out.println("Phan tu " + target + " duoc tim thay tai vi tri " + result);
        }
        else {
            System.out.println("Phan tu " + target + " khong duoc tim thay trong mang");
        }

    }
}
