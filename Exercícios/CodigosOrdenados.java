import java.util.Random;
import java.util.Scanner;

public class CodigosOrdenados {

    public static void printConsole(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite quantos códigos deseja:");
        int qtd = input.nextInt(); // esta variável indicará quantas posições terá o vetor dos códigos

        System.out.println("Digite o intervalo mínimo:");
        int minimo = input.nextInt();

        System.out.println("Digite o intervalo máximo:");
        int maximo = input.nextInt();

        int num = 0; // índice do vetor que será gerado aleatoriamente
        int[] numbers = new int[qtd];
        int[] ordenerNumbers = new int[qtd];
        while (num < qtd) {
            boolean estaDuplicado = false;
            int number = r.nextInt((maximo - minimo) + minimo) + 1; // gera um valor aleatório e armazena em uma variável de controle
                                                                    
            for (int i = 0; i < qtd; i++) {
                if (number == numbers[i]) {
                    estaDuplicado = true; // verifica se há números duplicados antes de inserir no vetor
                    break;
                }
            }

            if (!estaDuplicado) {
                numbers[num] = number;
                ordenerNumbers[num] = number; // duplicando o vetor de números aleatórios para ordená-lo
                num++;
            }
        }
        int temp = 0;
        for (int j = 0; j < qtd - 1; j++) {
            for (int k = j + 1; k < qtd; k++) { // realizando uma abordagem próxima do algoritmo Bubble Sort
                temp = numbers[j];
                if (ordenerNumbers[j] > ordenerNumbers[k]) {
                    contador++;
                    temp = ordenerNumbers[j];
                    ordenerNumbers[j] = ordenerNumbers[k];
                    ordenerNumbers[k] = temp;

                }
            }
        }
        System.out.println("\nCódigos gerados aleatoriamente:"); // impressão no console do vetor
        printConsole(numbers);

        System.out.println("\nCódigos em ordem crescente"); // impressão no console do vetor
        printConsole(ordenerNumbers);

        System.out.printf("\nIterações do Bubble Sort: %d", contador);
        input.close();
    }
}
