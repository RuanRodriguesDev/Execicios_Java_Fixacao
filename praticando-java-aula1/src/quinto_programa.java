import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class quinto_programa {
    static Scanner leitura = new Scanner(System.in); // Cria uma instância estática de Scanner para leitura de dados do usuário
    static int numero; // Variável para armazenar o número inserido pelo usuário
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
            System.out.println("Digite o numero! ");
            numero = leitura.nextInt(); // Lê o número inserido pelo usuário

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) { // Verifica se o número é divisível por 2
                System.out.println(numero + " Resultado Par"); // Se for, o número é par
            } else {
                System.out.println(numero + " Resultado Ímpar"); // Caso contrário, o número é ímpar
            }

            // Exibe o menu novamente após verificar o número
            System.out.println("""
                1 - continuar
                0 - Sair
                """);
            System.out.println("Digite se deseja continuar: ");
            opcao = leitura.nextInt(); // Lê a nova opção do usuário
        }
    }
}
