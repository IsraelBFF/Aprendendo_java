package application.Matrizes;

import java.util.*;

public class ex{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ordem da matriz: ");
        int ordem = sc.nextInt();

        int[][] matriz = new int[ordem][ordem];

        for(int i = 0 ; i < ordem ; i++){
            System.out.printf("Valores da %dª linha: ", (i+1));
            for(int j = 0 ; j < ordem ; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        int qntdNeg = 0;
        System.out.println("Diagonal principal:");
        for(int i = 0 ; i < ordem ; i++){
            for(int j = 0 ; j < ordem ; j++){
                if(i == j){
                    System.out.print(matriz[i][j] + " ");
                }

                if(matriz[i][j] < 0){
                    qntdNeg++;
                }
            }
        }

        System.out.println();

        System.err.printf("Quantidade de números negativos: %d\n", qntdNeg);

        sc.close();
    }
}