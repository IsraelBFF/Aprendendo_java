package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.lang.Number;
import java.lang.Object;

public class Program {
    static void main(String[] args){
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        IO.println("My objects: " + myObjs);
        copy(myInts, myObjs);
        IO.println("My new list of integers: " + myObjs);

        copy(myDoubles, myObjs);
        IO.println("My new list of doubles and integers: " + myObjs);

        
    }

    static void copy(List<? extends Number> origin, List<? super Number> destination){ // covariance and countercovariance
        for(Number element : origin){
            destination.add(element);
        }
    }

    static void clearList(List<? super Number> list){
        if(list.size() > 0){
            for(Object element : list){
                list.remove(element);
            } 
        }
    }
}
