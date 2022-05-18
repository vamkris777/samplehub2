package loops.operation;

import java.util.ArrayList;
import java.util.List;

public class LoopApplication {

    public static void main(String[] args) {
        Racer r1= new Racer();
        r1.setName("bill");
        r1.setNo(49);
        r1.setPosition(1);

        Racer r2= new Racer();
        r2.setName("strange");
        r2.setNo(59);
        r2.setPosition(1);

        Racer r3= new Racer();
        r3.setName("ranger");
        r3.setNo(69);
        r3.setPosition(2);

        Racer r4= new Racer();
        r4.setName("mike");
        r4.setNo(79);
        r4.setPosition(3);
        List<Racer> racerList=new ArrayList<Racer>();
        racerList.add(r1);
        racerList.add(r2);
        racerList.add(r3);
        racerList.add(r4);
        for (int i=0; i<racerList.size(); i++){
            System.out.println(racerList.get(i).getName());
            System.out.println(racerList.get(i).getNo());
            System.out.println(racerList.get(i).getPosition());


        }

    }
}
