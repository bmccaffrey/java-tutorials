import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }
    public void go() {
        Book b1 = new Book("The Giving Tree");
        Book b2 = new Book("The Fellowship of the Ring");
        Book b3 = new Book("Quidditch Through the Ages");

        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book>(bookCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }

    class Book implements Comparable<Book> {
        String title;
        public Book(String title) { this.title = title; }
        public String getTitle() { return title; }
        public int compareTo(Book b) { return title.compareTo(b.getTitle()); }
    }

    public class BookCompare implements Comparator<Book> {
        public int compare(Book one, Book two) { return one.getTitle().compareTo(two.getTitle()); }
    }

}
