package Tasks.Exams.Chess;

import java.util.ArrayList;

public class Chess {

    static ArrayList<Object> setChess = new ArrayList<>();

    public void motion(){
        System.out.println("Делает ход");
    }

    public ArrayList<Object> addSet(){
        for (int i = 1; i < 4; i++){
            setChess.add(new Queen().getPriceQueen());
        }
        for (int i = 1; i < 1001; i++){
            setChess.add(new Horse().getPriceHorse());
        }
        return setChess;
    }

    public static int sum(){;
        int summa = 0;
        for (int i = 0; i < setChess.size(); i++){
            summa += i;
        }
        return summa;
    }

    public static void main(String[] args){
        System.out.println(sum());
    }

}
