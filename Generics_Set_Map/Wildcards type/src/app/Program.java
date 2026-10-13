package app;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Integer> listInt = Arrays.asList(1,3,4);
        printList(listInt);
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            IO.println(obj);
        }
    }
}
