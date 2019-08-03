package OOP_Basic.zad3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Mem base = new Mem();

        List<Mem> list = new ArrayList<>();
        list.add(new Mem("mem1", "www.mem1.pl", "description1", "no"));
        list.add(new Mem("mem2", "www.mem2.pl", "description2", "yes"));
        list.add(new Mem("mem3", "www.mem3.pl", "description3", "yes"));
        list.add(new Mem("mem4", "www.mem4.pl", "description4", "no"));

        for (int i=0; i<list.size(); i++) {
            if (base.isFavourite(list.get(i))){
                System.out.println(list.get(i));
            }
        }


    }

}
