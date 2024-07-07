package com.mycompany.app;
import org.json.JSONObject;
/**
 * Hello world!
 *
 */

 class Book {
    private String name;
    private String author;
    private String genre;
    public Book() {}
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }
}
public class App 
{


    public static void main( String[] args )
    {
        String s ="{\n\t\t\"title\": \"The noob the hacker\",\n\t\t\"author\": \"Stephen King\",\n\t\t\"genre\": \"Sci-fi\"\n}";
        JSONObject obj = new JSONObject(s);
        Book bookModel = new Book();
        String title = obj.get("title").toString();
        String author = obj.get("author").toString();
        String genre = obj.get("genre").toString();
        bookModel.setName(title);
        bookModel.setAuthor(author);
        bookModel.setGenre(genre);
    
    }
}


