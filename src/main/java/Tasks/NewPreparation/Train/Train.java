package Tasks.NewPreparation.Train;

public class Train {

    private int window;
    private int sitting;
    private String way;
    private String model;

    public Train(String way, String model, int sitting, int window){
        this.way = way;
        this.model = model;
        this.sitting = sitting;
        this.window = window;
    }

    public String getWay(){
        return way;
    }

    public void setWay(String way){
        this.way = way;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getWindow(){
        return window;
    }

    public void setWindow(int window){
        this.window = window;
    }

    public int getSitting(){
        return sitting;
    }

    public void setSitting(int sitting){
        this.sitting = sitting;
    }

    @Override
    public String toString(){
        return  "\n" + "Поезд " + getModel() +
                " пути: " + getWay() +
                ", посадочных мест: " + getSitting() +
                ", окон: " + getWindow();
    }
}
