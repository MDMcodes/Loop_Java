import java.util.Scanner;

//Calculadora +, -, * e /
public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        System.out.print("Primeiro valor: ");
        double num1 = scanner.nextDouble();
        System.out.print("Segundo valor: ");
        double num2 = scanner.nextDouble();
        double resultado = 0;
        switch (opcao) {
            case 1:
            resultado = num1 + num2;
            System.out.println("O resultado da soma é: " + resultado);
            break;
            case 2:
            resultado = num1 - num2;
            System.out.println("O resultado da subtração é: " + resultado);
            break;
    }
}
