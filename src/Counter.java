import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parameterOne = input.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parameterTwo = input.nextInt();

        try {
            count(parameterOne, parameterTwo);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }
    }

    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int counter = parameterTwo - parameterOne;
        for (int i = 1; i <= counter; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
