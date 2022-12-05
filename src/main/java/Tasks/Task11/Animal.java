package Tasks.Task11;


public class Animal implements Oaoaaaa {

    public void eat() {
        System.out.println("Кушает");
    }

    public void run(){
        System.out.println("Бегает");
    }

    public static void main(String[] args){
        Animal mouse = new Animal();
        mouse.eat();
        mouse.run();
    }
}
