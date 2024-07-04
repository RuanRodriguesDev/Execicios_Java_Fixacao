import java.util.Scanner;

public class primeiro_programa {
    static Scanner leitura = new Scanner(System.in);

    static int numero ;
    public static void main(String[] args) {
        System.out.println("Digite o numero");
        numero = leitura.nextInt();
        if(numero % 2 == 0){
            System.out.println("Número positivo");
        }else{
            System.out.println("Número negativo");
        }

    }
}