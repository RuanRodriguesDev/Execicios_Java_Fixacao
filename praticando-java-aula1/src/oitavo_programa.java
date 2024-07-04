import java.util.Scanner;

public class oitavo_programa {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner leitura = new Scanner(System.in);

        // Declaração das variáveis
        int numero1;       // Armazena o primeiro número (inteiro)
        double numero2;    // Armazena o segundo número (decimal)
        int resultado;     // Armazena o resultado da soma (convertido para inteiro)

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite primeiro numero");
        // Lê o primeiro número inserido pelo usuário
        numero1 = leitura.nextInt();

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite segundo numero");
        // Lê o segundo número inserido pelo usuário
        numero2 = leitura.nextDouble();

        // Calcula a soma dos dois números e converte o resultado para inteiro
        resultado = (int) (numero1 + numero2);

        // Exibe o resultado da soma
        System.out.println("O resultado : " + resultado);

        // Fecha o objeto Scanner
        leitura.close();
    }
}
