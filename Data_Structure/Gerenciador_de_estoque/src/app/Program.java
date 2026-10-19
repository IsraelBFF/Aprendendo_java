package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    static void main(String[] args){
        Map<String, Integer> gerenciador = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
       
        do {
            System.out.println("\n======== GERENCIADOR DE ESTOQUE ========");

            System.out.println("[1] Adicionar/Atualizar");
            System.out.println("[2] Remover");
            System.out.println("[3] Visualizar");
            System.out.println("[4] Sair");
            System.out.print(": ");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("\nNome do produto: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    gerenciador.put(nome, quantidade);
                    
                    break;
                case 2:
                    System.out.print("\nNome do produto: ");
                    sc.nextLine();
                    nome = sc.nextLine();

                    gerenciador.remove(nome);

                    break;
                case 3:
                    System.out.println("\nProdutos:");

                    for(String produto : gerenciador.keySet()){
                        System.out.println("Produto: " + produto + " - Quantidade: " + gerenciador.get(produto));
                    }
                    break;
                case 4:
                    System.out.println("ENCERRANDO...");
                    break;
                default:
                    System.out.println("Número inválido!");
            }
        } while (opcao != 4);
        

        sc.close();
    }
}
