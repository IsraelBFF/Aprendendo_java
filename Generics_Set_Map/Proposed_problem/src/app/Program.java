package app;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Program{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();
        
        // Course A

        IO.print("How many students for A? ");
        int qntdA = sc.nextInt();

        for(int i = 1 ; i <= qntdA ; i++){
            IO.print(i + "º student: ");
            A.add(sc.nextInt());
        }

        // Course B

        IO.print("How many students for B? ");
        int qntdB = sc.nextInt();

        for(int i = 1 ; i <= qntdB ; i++){
            IO.print(i + "º student: ");
            B.add(sc.nextInt());
        }

        // Course C

        IO.print("How many students for C? ");
        int qntdC = sc.nextInt();

        for(int i = 1 ; i <= qntdC ; i++){
            IO.print(i + "º student: ");
            C.add(sc.nextInt());
        }

        // Joining sets

        Set<Integer> totalStu = new HashSet<>(A);
        totalStu.addAll(B);
        totalStu.addAll(C);

        IO.println("Total students: " + totalStu.size());

        sc.close();
    }
}
