package Tasks.NewPreparation.Library;

import java.util.*;

public class Library {

    public static void main(String[] args){

        List<Books> library = new ArrayList<>();

        addBooks(library, "Руслан и Людмила", "А.С.Пушкин", 1821, "русский", 5);
        delBooks(library, "Руслан и Людмила", 3);

        System.out.println(library.toString());

    }

    public static void addBooks(List<Books> library, String titleOfBook, String authorOfBook, int ageOfBook, String languageOfBook, int count){
        for (int i = 0; i < count; i++){
            library.add(new Books(titleOfBook, authorOfBook, ageOfBook, languageOfBook));
        }
    }

    public static void delBooks(List<Books> library, String titleOfBook, int count){
        for (int i = 0; i < count; i++){
            for (int j = 0; j < library.size(); j++){
                if (library.get(i).getNameBook().equals(titleOfBook)){
                    library.remove(i);
                    break;
                }
            }
        }
    }

}
