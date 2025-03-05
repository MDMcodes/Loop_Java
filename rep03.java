import java.util.Scanner;

public class rep03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contadores para cada departamento
        int contAlm = 0, contProd = 0, contCont = 0, contVend = 0;
        
        while (true) {
            // Exibindo as opções de departamentos
            System.out.println("A\t\t\tAlmoxarifado");
            System.out.println("P\t\t\tProdução");
            System.out.println("C\t\t\tContabilidade");
            System.out.println("V\t\t\tVendas");
            System.out.println("");
            
            // Solicitando a escolha do departamento
            System.out.println("Digite a escolha (A, P, C, V): ");
            String escolha = scanner.nextLine().toUpperCase();  // Convertendo para maiúsculo para garantir consistência
            
            // Verificando qual departamento foi escolhido
            if (escolha.equals("A")) {
                contAlm++;
            } else if (escolha.equals("P")) {
                contProd++;
            } else if (escolha.equals("C")) {
                contCont++;
            } else if (escolha.equals("V")) {
                contVend++;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
            
            // Perguntar se deseja continuar ou sair
            System.out.println("Deseja continuar (S para sim, N para não)? ");
            String resposta = scanner.nextLine().toUpperCase();
            if (resposta.equals("N")) {
                break;  // Sai do loop se o usuário digitar "N"
            }
        }

        // Exibindo os totais
        System.out.println("\nTotal de escolhas por departamento:");
        System.out.println("Almoxarifado (A): " + contAlm);
        System.out.println("Produção (P): " + contProd);
        System.out.println("Contabilidade (C): " + contCont);
        System.out.println("Vendas (V): " + contVend);
    }
}
