import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solicitacao = scanner.nextLine();

        scanner.close();

        String texto = solicitacao.toLowerCase();
        // TODO: Imprima o serviço AWS correspondente de acordo com as palavras-chave presentes na solicitação.
        // Dica: Use if/else if/else e o método contains para identificar o serviço correto.

        if (texto.contains("aplicacoes")) {
            System.out.println("EC2");
            return;
        }

        if (texto.contains("armazenar")) {
            System.out.println("S3");
            return;
        }
        if (texto.contains("relacional")) {
            System.out.println("RDS");
            return;
        }

        if (texto.contains("funcoes")) {
            System.out.println("Lambda");
            return;
        } 
        
        System.out.println("Servico desconhecido");  

    }
}