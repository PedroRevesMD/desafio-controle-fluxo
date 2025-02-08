import java.util.InputMismatchException;
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

            int resultadoDiferenca = calculaDiferenca(primeiroNumero, segundoNumero);
            imprimirValores(resultadoDiferenca);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Não foi possível realizar operação: Erro no Input de valores");
        }


    }

    public static int calculaDiferenca(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException("Não foi possível realizar operação: Primeiro número maior que o segundo Numero!");
        }

        return numero2 - numero1;
    }

    public static void imprimirValores(int indice) {
        for(int i = 1; i <= indice; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
