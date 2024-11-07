public class BancoTerminal {
    public static void main(String[] args) {
        // Primeiro cenário: Saldo suficiente
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Segundo cenário: Saldo insuficiente
        saldo = 15.0;
        valorSolicitado = 22.0;

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
