import java.util.Scanner;

public class SmurfsDaSegundona {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de chuteiras"); // chuteiras individuais
        int n = input.nextInt();
        int[] tamanho = new int[n];
        Character[] lado = new Character[n];
        int tamanhoPares = 0;
        int corretos = 0;
        int tamanhoIguais = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o tamanho da %d° chuteira e o lado(D ou E). Ex: 41 D ", i + 1);

            tamanho[i] = input.nextInt();
            lado[i] = input.next().charAt(0);
        }

        for (int i = 0; i < tamanho.length; i++) {
            for (int j = 1; j < tamanho.length; j++) {
                if (tamanho[i] == tamanho[j]) {
                    tamanhoIguais++;
                    if (tamanhoIguais % 2 == 0) {
                        tamanhoPares++;
                        if (lado[i] != lado[j]) {
                            corretos++;
                        }
                    }
                }

            }
        }

        System.out.println(corretos);
        input.close();
    }

}
