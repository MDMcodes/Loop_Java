import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double salario;
        System.out.println("Escolha T = Técnico, E = Engenheiro de software, A = Analista de sistemas, P = Programador");
        String escolha = scanner.next();
        System.out.println("Qual o seu salário?");
        salario = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        switch (escolha.toUpperCase()) {
            case "T":
                System.out.println("O salário do " + nome + " é de R$ " + (salario * 1.5) + ",00");
                break;
            case "E":
                System.out.println("O salário do " + nome + " é de R$ " + (salario * 2) + ",00");
                break;
            case "A":
                System.out.println("O salário do " + nome + " é de R$ " + (salario * 1.8) + ",00");
                break;
            case "P":
                System.out.println("O salário do " + nome + " é de R$ " + (salario * 1.2) + ",00");
                break;
            default:
                System.out.println("Escolha inválida");
        }
    }
}
