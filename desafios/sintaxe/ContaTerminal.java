import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação dos dados ao usuário
        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer do teclado

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo inicial: R$ ");
        saldo = scanner.nextDouble();

        // Exibição da mensagem de boas-vindas
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
