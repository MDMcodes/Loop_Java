import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione seu curso: ADM, DIR ou INFO");
        String curso = scanner.nextLine();
        switch(curso.toUpperCase()){
            case "ADM":
            System.out.println("Você está no curso de ADM");
            break;
            case "DIR":
            System.out.println("Você está no curso de DIR");
            break;
            case "INFO":
            System.out.println("Você está no curso de INFO");
            break;
            default:
            System.out.println("Curso não encontrado");
            }
        }
}