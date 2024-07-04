import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class quarto_programa {
    static Scanner leitura = new Scanner(System.in); // Cria uma instância estática de Scanner para leitura de dados do usuário
    static int soma = 0; // Variável para armazenar o resultado da multiplicação (tabuada)
    static int numero; // Variável para armazenar o número cuja tabuada será calculada
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
            System.out.println("Digite a tabuada! ");
            numero = leitura.nextInt(); // Lê o número cuja tabuada será calculada

            // Calcula e exibe a tabuada do número inserido
            for (int i = 1; i <= 10; i++) {
                soma = numero * i; // Calcula a multiplicação
                System.out.println(numero + " x " + i + " = " + soma); // Exibe o resultado
            }

            // Exibe o menu novamente após calcular a tabuada
            System.out.println("""
                1 - continuar
                0 - Sair
                """);
            System.out.println("Digite se deseja continuar: ");
            opcao = leitura.nextInt(); // Lê a nova opção do usuário
        }
    }
}
