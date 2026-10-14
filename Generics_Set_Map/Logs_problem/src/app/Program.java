package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.DataLog;

public class Program {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        IO.print("Enter the path file: ");
        String pathFile = sc.nextLine();

        Set<DataLog> users = new HashSet<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(pathFile))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(" ");
                users.add(new DataLog(fields[0], Date.from(Instant.parse(fields[1]))));

                line = br.readLine();
            }


        } catch (IOException e){
            e.printStackTrace();
        }

        IO.println("Total users: " + users.size());
        
        for(DataLog dl : users){
            IO.println(dl.getName());
        }

        sc.close();
    }
}
