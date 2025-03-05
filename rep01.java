import java.util.Scanner;

public class rep01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n1, n2;
        while (true) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a primeira nota: ");
            n1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota: ");
            n2 = scanner.nextDouble();
            Double conta = (n1 + n2) / 2;
            if (conta >= 7) {
                System.out.println(nome + " você está aprovado!");
            }
            else if (conta < 7 && conta >= 5) {
                System.out.println(nome + " você está de recuperação!");
            }
            else {
                System.out.println(nome + " você está reprovado!");
            }
            
            // Ask if the user wants to continue after processing
            System.out.println("Quer continuar? (s/n)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;  // Exit the loop if the user chooses "n"
            }

            // Consume the leftover newline character from nextDouble() call
            scanner.nextLine();
        }
    }
}
