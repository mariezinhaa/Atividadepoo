public class Questao2 {
    public static void main(String[] args) {
        double preco = 5.0;
        double despesa = 200.0;
        double melhorLucro = 0;
        double melhorPreco = 0;
        int melhorQtd = 0;

        System.out.println("Preço\tIngressos\tLucro");

        while (preco >= 1.0) {
            int ingressos = (int)(120 + ((5.0 - preco) / 0.5) * 26);
            double lucro = (preco * ingressos) - despesa;
            System.out.printf("R$ %.2f\t%d\t\tR$ %.2f%n", preco, ingressos, lucro);

            if (lucro > melhorLucro) {
                melhorLucro = lucro;
                melhorPreco = preco;
                melhorQtd = ingressos;
            }

            preco -= 0.5;
        }

        System.out.printf("%nLucro máximo: R$ %.2f%n", melhorLucro);
        System.out.printf("Preço ótimo: R$ %.2f%n", melhorPreco);
        System.out.println("Quantidade de ingressos: " + melhorQtd);
    }
}

