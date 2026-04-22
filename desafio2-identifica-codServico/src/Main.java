import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();

        scanner.close();

        // TODO: Verifique se o código corresponde exatamente a "EC2", "S3" ou "Lambda" e imprima o serviço correspondente.
        // Caso contrário, imprima "Codigo invalido".

        if (codigo.equals("EC2")) {
            System.out.println("EC2");
            return;
        } 
        if (codigo.equals("S3")) {
            System.out.println("S3");
            return;
        } 
        if (codigo.equals("Lambda")) {
            System.out.println("Lambda");
            return;
        } 

        System.out.println("Codigo invalido");
        

    }
}