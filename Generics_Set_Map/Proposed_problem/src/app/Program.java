package app;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

import entities.*;

public class Program{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Student> stuA = new HashSet<>();
        Set<Student> stuB = new HashSet<>();
        Set<Student> stuC = new HashSet<>();
        
        // Course A

        IO.print("How many students for A? ");
        int qntdA = sc.nextInt();

        Course A = new Course("A", stuA);

        for(int i = 1 ; i <= qntdA ; i++){
            IO.print(i + "º student: ");
            int id = sc.nextInt();

            stuA.add(new Student(id));
        }

        // Course B

        IO.print("How many students for B? ");
        int qntdB = sc.nextInt();

        Course B = new Course("B", stuB);

        for(int i = 1 ; i <= qntdB ; i++){
            IO.print(i + "º student: ");
            int id = sc.nextInt();

            stuB.add(new Student(id));
        }

        // Course C

        IO.print("How many students for C? ");
        int qntdC = sc.nextInt();

        Course C  = new Course("C", stuC);

        for(int i = 1 ; i <= qntdC ; i++){
            IO.print(i + "º student: ");
            int id = sc.nextInt();

            stuC.add(new Student(id));
        }

        Set<Student> students = new HashSet<>();

        for(Student studentA : stuA){
            for(Student studentB : stuB){
                for(Student studentC : stuC){
                    students.add(studentC);
                }
                students.add(studentB);
            }
            students.add(studentA);
        }

        IO.println("Total students: " + students.size());
        
        sc.close();
    }
}
