import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
            TODO:
                - Incluir tratamento de erros/exceptions
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scan.nextLine().strip();
        System.out.println("Informe o número de sua agência: ");
        String agencia = scan.nextLine().strip();
        System.out.println("Informe o número da conta: ");
        int conta = scan.nextInt();
        System.out.println("Para concluir a abertura da conta, realize o primeiro depósito. Infome o valor que seja depositar: ");
        double saldoInicial = scan.nextDouble();

        System.out.printf("Olá %s!\n", nome);
        System.out.println("Agradecemos por criar sua conta em nosso banco!");
        System.out.println("====DADOS DA CONTA====");
        System.out.printf("""
                            AGÊNCIA: %s
                            CONTA:   %s
                            SALDO:   %.2f\n
                        """, agencia, conta, saldoInicial);
                            



    }
}
