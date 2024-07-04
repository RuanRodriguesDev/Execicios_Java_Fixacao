import java.util.Scanner;

public class setimo_programa {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero1, numero2;
        double media;
        char continuar;

        do {
            // Solicita que o usuário digite um número para calcular a média
            System.out.println("Digite o Numero1:");
            // Lê o número inserido pelo usuário
            numero1 = leitura.nextInt();
            System.out.println("Digite o Numero2:");
            // Lê o número inserido pelo usuário
            numero2 = leitura.nextInt();

            // Calcula a média dos dois números
            media = (numero1 + numero2) / 2.0;

            // Exibe o resultado da média
            System.out.println("A média dos números " + numero1 + " e " + numero2 + " é " + media);

            // Pergunta se o usuário deseja continuar
            System.out.println("Digite a opção para continuar [s/n]:");
            // Lê a opção do usuário
            continuar = leitura.next().charAt(0);
        } while (continuar == 's' || continuar == 'S'); // Continua se o usuário digitar 's' ou 'S'

        // Fecha o Scanner após sair do loop
        leitura.close();
    }
}
