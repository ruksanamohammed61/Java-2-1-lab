import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = sc.nextLine().trim();
        String[] words = line.split("\\s+");
        System.out.println("Number of words: " + words.length);


}
}