import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Program {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        IO.print("Enter file full path: ");
        String pathFile = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(pathFile))){
           
            Map<String, Integer> candidates = new HashMap<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");

                if (!candidates.containsKey(fields[0])) {candidates.put(fields[0], Integer.parseInt(fields[1]));}
                else {
                    int soma = Integer.parseInt(fields[1]);
                    int novoValor = candidates.get(fields[0]) + soma;

                    candidates.put(fields[0], novoValor);
                }

                line = br.readLine();
            }

            for(Map.Entry<String, Integer> candidate : candidates.entrySet()){
                String name = candidate.getKey();
                Integer votos = candidate.getValue();

                IO.println(name + ": " + votos);
            }
            

        } catch (IOException e){
            e.printStackTrace();
        }

        sc.close();
    }
}
