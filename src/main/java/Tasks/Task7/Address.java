package Tasks.Task7;

public class Address {

    private String name;
    private String street;
    private int house;
    private int building;
    private int flat;

    public Address(String name, String street, int house, int building, int flat){
        this.name = name;
        this.street = street;
        this.house = house;
        this.building = building;
        this.flat = flat;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getHouse(){
        return house;
    }

    public void setHouse(int house){
        this.house = house;
    }

    public int getBuilding(){
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getFlat(){
        return flat;
    }

    public void setFlat(int flat){
        this.flat = flat;
    }

    enum City{
        Moscow,
        Bryansk,
        Vologda,
        Voronezh,
        Luga,
        Samara,
        SaintPetersburg,
        Surgut
    }

    public static void main(String[] args){

        Address my = new Address("Илья", "Долгоозераная", 7, 3, 49);
        Address Andrew = new Address("Андрей", "Академика Байкова", 8, 3, 245);
        Address Anton = new Address("Антон", "Комендантский проспект", 9, 2, 99);
        System.out.println(my);
        System.out.println(Andrew);
        System.out.println(Anton);
    }

    @Override
    public String toString(){
        return getName() + ". Адрес: " +
                "ул. " + getStreet() +
                ", д. " + getHouse() +
                ", копр. " + getBuilding() +
                ", кв. " + getFlat() + ".";
    }
}






















