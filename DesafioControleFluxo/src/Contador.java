import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int primeiroNumero;
        int segundoNumero;

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o Primeiro número");
            primeiroNumero = scanner.nextInt();

            System.out.println("Digite o Primeiro número");
            segundoNumero = scanner.nextInt();
        }
    }
}
