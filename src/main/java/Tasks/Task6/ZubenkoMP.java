package Tasks.Task6;

import java.util.ArrayList;

public class ZubenkoMP {

    private int legs;
    private int hands;
    private String name;

    public ZubenkoMP(String name, int legs, int hands){
        this.legs = legs;
        this.hands = hands;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLegs(){
        return legs;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public int getHands(){
        return hands;
    }

    public void setHands(int hands){
        this.hands = hands;
    }


}
enum Status{
    Mafioznick,
    Preispolnenniy
}



class programm{
    public static void main(String[] args){
        ArrayList<ZubenkoMP> MenName = new ArrayList<>();
        Status[] status = Status.values();
        for (int i = 1; i < 11; i++){
            MenName.add(new ZubenkoMP("Zb" + i, 2, 2));
        }
        for(ZubenkoMP ZMP : MenName){
            System.out.println(ZMP.getName() + ": " + "legs - " + ZMP.getLegs() +  ", hands - " + ZMP.getHands()
                    + ", status - " + status[(int)(Math.random() * 10 % 2)]);
        }


    }
}