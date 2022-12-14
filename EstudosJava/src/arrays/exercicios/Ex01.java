package arrays.exercicios;
// POSIÇÃO MAIOR
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        double[] vet = new double[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int posicaoMaior = 0;

        for (int i=1; i<N; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("%.1f%n", maior);
        System.out.println(posicaoMaior);

        sc.close();

    }
}
