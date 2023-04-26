package Tasks.NewPreparation.AnimalsOfZoo;

public enum AnimalType {
    mammal("Млекопитающее"),
    bird("Птица"),
    reptile("Рептилия");

    private final String type;

    AnimalType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
