import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lucroMaior1000 = 0;
        int lucroMenor200 = 0;
        double lucroTotal = 0;
        
        System.out.println("Digite tipo, preço de compra e venda (tipo 'F' para encerrar):");
        
        while (true) {
            System.out.print("Tipo da ação: ");
            String tipo = scanner.next();
            
            if (tipo.equalsIgnoreCase("F")) {
                break;
            }
            
            System.out.print("Preço de compra: R$ ");
            double precoCompra = scanner.nextDouble();
            
            System.out.print("Preço de venda: R$ ");
            double precoVenda = scanner.nextDouble();
            
            double lucro = precoVenda - precoCompra;
            
            System.out.printf("Lucro da ação %s: R$ %.2f\n", tipo, lucro);
            
            if (lucro > 1000) {
                lucroMaior1000++;
            }
            
            if (lucro < 200) {
                lucroMenor200++;
            }
            
            lucroTotal += lucro;
        }
        
        System.out.println("Ações com lucro > R$1000: " + lucroMaior1000);
        System.out.println("Ações com lucro < R$200: " + lucroMenor200);
        System.out.printf("Lucro total: R$ %.2f\n", lucroTotal);
        
        scanner.close();
    }
}
