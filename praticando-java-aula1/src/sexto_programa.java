import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class sexto_programa {
    // Cria uma instância estática de Scanner para leitura de dados do usuário
    static Scanner leitura = new Scanner(System.in);
    // Variável para armazenar o número inserido pelo usuário
    static int numero;
    // Variável para armazenar o resultado do fatorial
    static long resultado = 0;
    // Variável para armazenar a opção de continuar do usuário
    static char continuar;

    public static void main(String[] args) {
        do {
            // Solicita que o usuário digite um número para calcular o fatorial
            System.out.println("Digite o Fatorial!");
            // Lê o número inserido pelo usuário
            numero = leitura.nextInt();

            // Calcula o fatorial do número inserido
            resultado = fatorial(numero);

            // Exibe o resultado do fatorial
            System.out.println("O Fatorial do número " + numero + " é " + resultado);
            // Pergunta se o usuário deseja continuar
            System.out.println("Digite a opção para continuar [s/n]");
            // Lê a opção do usuário
            continuar = leitura.next().charAt(0);
        } while (continuar == 's' || continuar == 'S'); // Continua se o usuário digitar 's' ou 'S'

        // Fecha o Scanner após sair do loop
        leitura.close();
    }

    // Método recursivo para calcular o fatorial de um número
    private static long fatorial(int numero) {
        // Caso base: se o número for menor ou igual a 1, retorna 1
        if (numero <= 1) {
            return 1;
        } else {
            // Caso recursivo: multiplica o número atual pelo fatorial do número anterior
            return numero * fatorial(numero - 1);
        }
    }
}
