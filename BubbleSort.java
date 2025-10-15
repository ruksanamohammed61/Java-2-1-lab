import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter array size:");
           int n=sc.nextInt();
           System.out.println("enter +n+ elements:");

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            
        System.out.println("Sorted array: ");
      

}
}

     