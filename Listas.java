import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas{
    static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        // Adicionando elementos na lista
            nomes.add("Maria");
            nomes.add("Alex");
            nomes.add("Bob");
            nomes.add("Anna");
            nomes.add(2, "Marco");
        
            for(String x : nomes){
                System.out.print(x + " ");
            }
            System.out.println("");

        // System.out.println("\n------------------------------------");
        
        // Removendo elementos da lista
            // Removendo por valor
            // nomes.remove("Anna");
            
            // for(String x : nomes){
            //     System.out.print(x + " ");
            // }

            // Removendo por posição
            // System.out.println("\n------------------------------------");

            // nomes.remove(0);

            // for(String x : nomes){
            //     System.out.print(x + " ");
            // }

            // Removendo por predicado
            // System.out.println("\n------------------------------------");

            // nomes.removeIf(x -> x.charAt(0) == 'M');


            // for(String x : nomes){
            //     System.out.print(x + " ");
            // }

        // // Descobrindo posição do elemento
            // System.out.println("Posição de Anna: " + nomes.indexOf("Anna"));
            // System.out.println("Posição de Israel: " + nomes.indexOf("Israel")); // Retorna -1, pois não existe

        // Filtrar elementos
        
            // Retornando uma lista
            // List<String> resultado = nomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

            // for(String result : resultado){
            //     System.out.println(result);
            // }
            
            // Retornando um objeto
            // String nome = nomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
            // System.out.println(nome);


    }
}