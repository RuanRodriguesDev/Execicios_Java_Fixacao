import java.util.Scanner;

public class terceiro_programa {
    static Scanner leitura = new Scanner(System.in);
    static int opcao = - 1 ;

    public static void main(String[] args) {
        System.out.println("""
                    1 - Calcular área do quadrado
                    2 - Calcular área do círculo
                    3 - Sair Programa
                    """);
        System.out.println("Digite sua Opçao: ");
        opcao = leitura.nextInt();
        while (opcao != 0 ){

            switch (opcao){
                case 1:
                    calculoAreaQuadrado();
                    break;
                case 2:
                    calcularAreaCirculo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }


    }
    public static void calculoAreaQuadrado() {
        System.out.println("Digite o Lado?");
        int lado = leitura.nextInt();
        int area = lado * lado;
        System.out.println("A area do quadrado é " + area);
        System.out.println("Digite sua Opçao: ");
        opcao = leitura.nextInt();
    }
    private static void calcularAreaCirculo() {
        System.out.println("Digite o Raio?");
        double   raio = leitura.nextInt();
        double area = Math.PI * raio *raio;
        System.out.println("A area do circulo é " + area);
        System.out.println("Digite sua Opçao: ");
        opcao = leitura.nextInt();

    }


}