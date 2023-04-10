import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960"));
        bookList.add(new Book("The Catcher in the Rye", 99, "J.D. Salinger", "1951"));
        bookList.add(new Book("1984", 328, "George Orwell", "1949"));
        bookList.add(new Book("Animal Farm", 112, "George Orwell", "1945"));
        bookList.add(new Book("Pride and Prejudice", 279, "Jane Austen", "1813"));
        bookList.add(new Book("The Great Gatsby", 218, "F. Scott Fitzgerald", "1925"));
        bookList.add(new Book("Jane Eyre", 532, "Charlotte Bronte", "1847"));
        bookList.add(new Book("The Hobbit", 300, "J.R.R. Tolkien", "1937"));
        bookList.add(new Book("Harry Potter and the Philosopher's Stone", 223, "J.K. Rowling", "1997"));
        bookList.add(new Book("The Lord of the Rings", 1178, "J.R.R. Tolkien", "1954"));

        Map<String, String> titleAuthorMap = bookList.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        System.out.println("Title-Author Map: " + titleAuthorMap);

        List<Book> pageCountGreaterThan100List = bookList.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        System.out.println("\nBooks with page count greater than 100:");
        for (Book book : pageCountGreaterThan100List) {
            System.out.println(book.getTitle());
        }
    }
}
