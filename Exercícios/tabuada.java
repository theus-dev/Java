import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Você deseja ver a tabuada de qual número?");
        int escolha = input.nextInt();

        System.out.printf("Tabuada do %d:\n", escolha);
        for (int i = 1; i <= 10; i++) {
            int conta = 0;
            conta = escolha * i;

            System.out.printf("%d: %d * %d = %d\n", i, escolha, i, conta);

        }
    }
}
