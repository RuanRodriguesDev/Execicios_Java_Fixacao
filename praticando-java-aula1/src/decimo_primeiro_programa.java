import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class decimo_primeiro_programa {
    static Scanner leitura = new Scanner(System.in); // Cria uma instância estática de Scanner para leitura de dados do usuário
    static double valorDolar ; // Variável para armazenar o resultado da multiplicação (tabuada)
    static double valorReal; // Variável para armazenar o número cuja tabuada será calculada

    static double valorCabio = 5.67; ;
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
            System.out.println("Digite o valor do Dolar ");
            valorDolar = leitura.nextInt(); // Lê o número cuja tabuada será calculada
            valorReal = valorCabio * valorDolar;

            System.out.println("O valor em Dolar para real " + valorReal);



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
