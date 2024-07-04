import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class decimo_segundo_programa {
    static Scanner leitura = new Scanner(System.in); // Cria uma instância estática de Scanner para leitura de dados do usuário
    static double valorproduto; // Variável para armazenar o valor do produto
    static double valorPercentual; // Variável para armazenar o valor do produto com desconto

    static double desconto = 10; // Variável para armazenar o percentual de desconto (10%)
    static int opcao = -1; // Variável para armazenar a opção do usuário (continuar ou sair)

    public static void main(String[] args) {
        // Exibe o menu inicial
        System.out.println("""
                1 - continuar
                0 - Sair
                """);
        System.out.println("Digite se deseja continuar: ");
        opcao = leitura.nextInt(); // Lê a opção do usuário

        while (opcao != 0) { // Loop continua enquanto a opção não for 0 (sair)
            System.out.println("Digite o valor Produto ");
            valorproduto = leitura.nextInt(); // Lê o valor do produto

            // Calcula o valor do produto com o desconto
            valorPercentual = valorproduto * (1 - (desconto / 100));

            // Exibe o valor original do produto, o desconto e o valor final do produto
            System.out.println("O valor Produto: " + valorproduto + " com Desconto " + desconto + " O valor final do Produto " + valorPercentual);

            // Exibe o menu novamente após calcular o valor com desconto
            System.out.println("""
                1 - continuar
                0 - Sair
                """);
            System.out.println("Digite se deseja continuar: ");
            opcao = leitura.nextInt(); // Lê a nova opção do usuário
        }
    }
}
