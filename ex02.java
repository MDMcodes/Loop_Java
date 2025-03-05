import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printLn("Estado Civil: C casado, S solteiro, V viuvo, D divorciado");
        System.out.println("Escolha seu Estado Civil: ");
        String estadoCivil = scanner.nextLine();

        if (estadoCivil.equalsIgnoreCase(C)){
            System.out.println("Você é casado");
        }
        else if (estadoCivil.equalsIgnoreCase(S)){
            System.out.println("Você é solteiro");
        }
        else if (estadoCivil.equalsIgnoreCase(V)){
            System.out.println("Você é viuvo");
        }
        else if (estadoCivil.equalsIgnoreCase(D)){
            System.out.println("Você é divorciado");
        }
        else {
            System.out.println("Estado Civil inválido");
        }
        scanner.close();
        }
}
