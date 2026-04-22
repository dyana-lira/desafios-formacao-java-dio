import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().trim();

        List<Consultant> consultantList = new ArrayList<>();

        // Cada consultor pode vir separado por ";"
        String[] entries = inputLine.split(";");

        for (String entry : entries) {
            entry = entry.trim();
            if (entry.isEmpty()) continue;

            String[] parts = entry.split(" ", 2);
            String jobTitle = parts[0];
            String personName = parts[1];

            // TODO: Criar os if/else para instanciar Developer, Analyst ou Manager.

        }

        // Impressão final na ordem de entrada
        for (Consultant consultant : consultantList) {
            System.out.println(consultant.present());
        }
    }
}
