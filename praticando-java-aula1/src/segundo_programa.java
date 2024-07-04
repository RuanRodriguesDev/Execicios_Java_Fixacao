import java.util.Scanner;

public class segundo_programa {
    static Scanner leitura = new Scanner(System.in);

    static int numero ;
    static int numero2;
    public static void main(String[] args) {
        System.out.println("Digite o numero");
        numero = leitura.nextInt();
        System.out.println("Digite o numero2");
        numero2 = leitura.nextInt();
        if(numero == numero2){
            System.out.println("Número iguais");
        }else if(numero >= numero2 ){
            System.out.println("Número primeiro é maior");
        }else if(numero2 >= numero){
            System.out.println("Número segundo é maior");
        }else {
            System.out.println("Número null0");
        }

    }
}