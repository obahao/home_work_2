import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int n1 = 0;
        while(n != 0){
            n1 = n1*10 + n%10;
            n /= 10;
        }
        System.out.println(n1);
    }
}