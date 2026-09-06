package application;

import java.util.*;

import entities.Empregado;

public class Exercicio_lista{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos empregados serão registrados? ");
        
        ArrayList<Empregado> empregados = new ArrayList<>();
        
        int qntdEmpregados = sc.nextInt();
        System.out.println();


        for(int i = 0 ; i < qntdEmpregados ; i++){
            System.out.println("Empregado #" + (i+1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            float salario = sc.nextFloat();

            System.out.println();

            empregados.add(new Empregado(id, nome, salario));
        }
        
        System.out.println();

        System.out.print("Digite o id do empregado que receberá um aumento: ");
        int idProcurado = sc.nextInt();

        Integer idAchado = null;

        for(Empregado empregado : empregados){
            if (empregado.getId() == idProcurado){
                idAchado = empregados.indexOf(empregado);
            }
        }

        if(idAchado != null){
            System.out.print("Digite a porcentagem: ");
            float porAumento = sc.nextFloat();

            empregados.get(idAchado).increaseSalario(porAumento);
        } else{
            System.out.println("Esse id não existe!");
        }

        System.out.println();
        
        for(Empregado empregado : empregados){
            System.out.println(empregado.toString());
        }

        sc.close();
    }
}