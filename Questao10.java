import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0, somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();

            if (n % 2 == 0) somaPares += n;
            if (ehPrimo(n)) somaPrimos += n;
        }

        System.out.println("\nSoma dos pares: " + somaPares);
        System.out.println("Soma dos primos: " + somaPrimos);

        sc.close();
    }

    static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
