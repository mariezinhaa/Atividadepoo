import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            if (ehPrimo(num)) contPrimos++;
        }

        System.out.println("\nQuantidade de números primos: " + contPrimos);
        sc.close();
    }

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

