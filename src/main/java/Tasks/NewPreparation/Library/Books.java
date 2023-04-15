package Tasks.NewPreparation.Library;

public class Books {

    private String title;
    private String author;
    private String language;
    private int age;

    public Books(String title, String author, int age, String language){
        this.title = title;
        this.author = author;
        this.age = age;
        this.language = language;
    }

    public String getNameBook(){
        return title;
    }

    public void setName(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    @Override
    public String toString(){
        return "Книга: " + getNameBook() +
                ", автор: " + getAuthor() +
                ", год: " + getAge() +
                ", язык: " + getLanguage() + "\n";
    }

}
