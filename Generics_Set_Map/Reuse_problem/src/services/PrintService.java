package services;

import java.util.ArrayList;

public class PrintService {

    public ArrayList<Integer> list = new ArrayList<>();

    public void addValue(Integer value){
        list.add(value);
    }

    public int first(){
        return list.get(0);
    }

    public void print(){
        IO.println(list);
    }
}
