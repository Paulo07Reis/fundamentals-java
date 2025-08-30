package poo.exercise.exercise27;

import java.util.ArrayList;
import java.util.List;

public class ListService<t>{

    private List<t> list = new ArrayList<>();

    public void addItem(t item){
        list.add(item);
    }

    public void removeItem(t item){
        list.remove(item);
    }

    public void listItems(){
        for (t item : list){
            System.out.println(item);
        }
    }
}
