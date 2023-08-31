import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite três números:");

        int n = input.nextInt();

        String numeroString = Integer.toString(n);
        while (numeroString.length() > 3 || numeroString.length() < 3) {
            System.out.println("Desculpe, você precisa digitar exatamente três, tente novamente:");
            n = input.nextInt();
            numeroString = Integer.toString(n);
        }

        int primeiroDigito = numeroString.charAt(0);
        int ultimoDigito = numeroString.charAt(2);

        if (primeiroDigito == ultimoDigito || ultimoDigito == primeiroDigito) {
            System.out.println("Este número é um palíndromo!");
        } else {
            System.out.println("Este número não é um palíndromo!");
        }
        input.close();
    }
}
