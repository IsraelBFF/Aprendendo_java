package application;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        
        float[] alturas = new float[n];

        float soma = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Altura em centímetros: ");
            alturas[i] = sc.nextFloat();
            soma += alturas[i];
        }

        float avg = soma/n;
        System.out.println();

        System.out.printf("Altura média: %.2f metros\n", avg/100);
        
        sc.close();


    }
}
