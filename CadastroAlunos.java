import java.util.Scanner;

public class CadastroAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores para cada curso
        int contInf = 0, contMec = 0, contEle = 0, contDes = 0;
        
        // Limite de alunos
        int totalAlunos = 2;

        // Loop para cadastro de 50 alunos
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Cadastro do aluno " + i);

            // Nome do aluno
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            
            // Sigla do curso
            System.out.println("Digite a sigla do curso (INF, MEC, ELE, DES): ");
            String sigla = scanner.nextLine().toUpperCase(); // Converte a sigla para maiúscula para garantir a consistência
            
            // Verificar a sigla e incrementar o contador correspondente
            switch (sigla) {
                case "INF":
                    contInf++;
                    break;
                case "MEC":
                    contMec++;
                    break;
                case "ELE":
                    contEle++;
                    break;
                case "DES":
                    contDes++;
                    break;
                default:
                    System.out.println("Sigla inválida! Não contamos este aluno.");
                    break;
            }
        }
        
        // Exibição dos totais de alunos em cada curso
        System.out.println("\nTotal de alunos por curso:");
        System.out.println("Informática (INF): " + contInf);
        System.out.println("Mecatrônica (MEC): " + contMec);
        System.out.println("Eletrônica (ELE): " + contEle);
        System.out.println("Design (DES): " + contDes);
    }
}
