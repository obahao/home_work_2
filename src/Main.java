import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                System.out.println("Задание №1");
                Scanner num = new Scanner(System.in);
                int n = num.nextInt();

                int bad_digit = num.nextInt();
                StringBuilder sb = new StringBuilder(Integer.toString(n));
                String bad = Integer.toString(bad_digit);
                int idxOfFirst = sb.indexOf(bad);

                if (idxOfFirst >= 0) {
                    if (sb.charAt(0) == '-') {
                        sb.deleteCharAt(sb.lastIndexOf(bad));
                    } else {
                        sb.deleteCharAt(idxOfFirst);
                    }
                }
                System.out.println(sb);
            }
        }