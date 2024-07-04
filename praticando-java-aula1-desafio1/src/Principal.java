import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    // Scanner para ler entradas do usuário
    Scanner leitura = new Scanner(System.in);

    // Variáveis para armazenar valores de depósito, saque e saldo
    private double depositoConta;
    private double saqueConta;
    private double saldoConta;

    // Variáveis para armazenar o nome do usuário e o tipo de conta
    private String nome;
    private String tipoConta;

    // Lista para armazenar os saldos após cada operação
    List<Double> listaSaldo = new ArrayList<>();

    // Variável para armazenar a opção escolhida pelo usuário no menu
    int opcao = -1;

    // Método que exibe o menu e processa as escolhas do usuário
    public void menu() {
        // Exibe as opções do menu
        System.out.println("""
               1 - Depositar na Conta
               2 - Sacar na conta
               3 - Verificar Saldo
               0 - Sair da Aplicação
               """);
        System.out.println("Digite a sua opção: ");
        opcao = leitura.nextInt(); // Lê a opção escolhida pelo usuário

        // Loop para manter o menu ativo até que o usuário escolha sair (opção 0)
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    depositarConta(); // Chama o método para depositar na conta
                    break;
                case 2:
                    sacarConta(); // Chama o método para sacar da conta
                    break;
                case 3:
                    verificarSaldo(); // Chama o método para verificar o saldo
                    break;
                case 0:
                    System.out.println("Saindo da Aplicação");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println("Digite a sua opção: ");
            opcao = leitura.nextInt(); // Lê a próxima opção do usuário
        }
    }

    // Método para depositar na conta
    private void depositarConta() {
        System.out.println("Digite tipo de Conta: ");
        tipoConta = leitura.next(); // Lê o tipo de conta
        System.out.println("Digite seu Nome: ");
        nome = leitura.next(); // Lê o nome do usuário
        System.out.println("Digite o valor do Deposito: ");
        depositoConta = leitura.nextDouble(); // Lê o valor do depósito

        // Adiciona o valor do depósito à lista de saldos e atualiza o saldo da conta
        listaSaldo.add(depositoConta);
        saldoConta += depositoConta;

        // Exibe informações sobre a transação
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Usuário: " + nome);
        System.out.println("Depósito da conta: " + listaSaldo);
        System.out.println("Saldo da conta: " + saldoConta);
        System.out.println("Depositado com Sucesso!");

        // Chama o menu novamente
        menu();
    }

    // Método para sacar da conta
    private void sacarConta() {
        System.out.println("Digite o valor de Saque:");
        saqueConta = leitura.nextDouble(); // Lê o valor do saque

        // Adiciona o valor do saque à lista de saldos (como valor negativo) e atualiza o saldo da conta
        listaSaldo.add(-saqueConta);
        saldoConta -= saqueConta;

        // Exibe informações sobre a transação
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Usuário: " + nome);
        System.out.println("Retirada do Valor: " + saqueConta);
        System.out.println("Saldo da conta: " + saldoConta);
        System.out.println("Retirado da Conta com Sucesso!");

        // Chama o menu novamente
        menu();
    }

    // Método para verificar o saldo da conta
    private void verificarSaldo() {
        // Exibe o saldo atual da conta, o tipo de conta e o nome do usuário
        System.out.println("Saldo da conta");
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Usuário: " + nome);
        System.out.println("Saldo atualizado: " + saldoConta);

        // Chama o menu novamente
        menu();
    }
}
