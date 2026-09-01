import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        
        String nome  = "";

        System.out.print("Seu nome: ");
        nome = sc.next();

        System.out.println(nome);
        
        sc.close();
    }
}
