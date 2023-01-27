import java.util.ArrayList;

public abstract class Book {
    private String BookAuthor;
    private String BookName;
    private String BookLang;

    public void SetBookAuthor(String bookAuthor) {
        this.BookAuthor = bookAuthor;
    }

    public void SetBookName(String bookName) {
        this.BookName = bookName;
    }

    public void SetBookLang(String bookLang) {
        this.BookLang = bookLang;
    }

    public String GetBookAuthor() {
        return BookAuthor;
    }

    public String GetBookName() {
        return BookName;
    }

    public String GetBookLang() {
        return BookLang;
    }


}
