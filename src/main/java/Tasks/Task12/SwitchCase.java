package Tasks.Task12;

public class SwitchCase {

    public static void main(String[] args){

        int x = (int)(Math.random()*3+1);

        switch (x) {
            case 1 -> System.out.println("Ъуъ");
            case 2 -> System.out.println("Кибер");
            case 3 -> System.out.println("VasyaDiagnost.com");
            default -> System.out.println("ошибка");
        }

    }

}
