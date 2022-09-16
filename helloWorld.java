import java.util.Scanner;

public class helloWorld{
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner name = new Scanner(System.in);
        String x = name.nextLine();
        System.out.println(x);
    }
}
