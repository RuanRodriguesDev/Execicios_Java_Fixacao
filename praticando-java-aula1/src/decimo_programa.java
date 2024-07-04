import java.util.Scanner;

public class decimo_programa {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner leitura = new Scanner(System.in);

        // Declaração das variáveis
        double precoProduto;  // Declara uma variável para armazenar o preço do produto (tipo double)
        int quantidade;       // Declara uma variável para armazenar a quantidade do produto (tipo int)
        int resultado;        // Declara uma variável para armazenar o resultado (tipo int)

        // Solicita ao usuário que digite o preço do produto
        System.out.println("Digite o preço do produto:");
        // Lê o preço do produto inserido pelo usuário
        precoProduto = leitura.nextDouble();

        // Solicita ao usuário que digite a quantidade do produto
        System.out.println("Digite a quantidade do produto:");
        // Lê a quantidade do produto inserida pelo usuário
        quantidade = leitura.nextInt();

        // Calcula a soma do preço do produto e a quantidade e converte o resultado para inteiro
        resultado = (int) (precoProduto + quantidade);

        // Exibe o resultado da soma
        System.out.println("O resultado: " + resultado);

        // Fecha o objeto Scanner para liberar os recursos
        leitura.close();
    }
}
