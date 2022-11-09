import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев Толстой", "ltolstoy@gmail.com", 'M');
        Author author1 = new Author("Aaly Tokombaev", "tokombaev@gmail.com", 'M');
        Author author2 = new Author("Maksim Gorkiy", "Gotkiy@gmail.com", 'M');
        Author author3 = new Author("Asel Moldokulova", "moldokulova@gmail.com", 'M');
        Author author4 = new Author("Tattubyby Asanalieva", "Taty@gmail.com", 'M');

        Book book = new Book("Vouna i mir", author, 1000, 5);
        Book book1 = new Book("Chalkar", author1, 2500, 4);
        Book book2 = new Book("Gorkiydin armany", author2, 1233, 6);
        Book book3 = new Book("Aseldin  poeziyzsy", author3, 2345, 6);
        Book book4 = new Book("Tattuu tokochtor", author4, 2312, 5);

        Scanner scanner = new Scanner(System.in);
        Author[] authors = {author, author1, author2, author3, author4};
        Book[] books = {book, book1, book3, book4};
        getMaxMin(authors,books);
    }

    public static void getMaxMin(Author[] authors, Book[] books) {
//        int max = books[0].getPrise(), min = books[0].getPrise();
//        for (Book book : books) {
//            max = Math.max(max, book.getPrise());
//            min = Math.min(min, book.getPrise());
//        }
//        for (Book book: books) {
//            if (book.getPrise()==max){
//                System.out.println("Max price of book: " + max + "\nName of book: " + book.getName() + "\n" + book.getAuthor());
//            } else if (book.getPrise()==min) {
//                System.out.println("\nMin price of book: " + min + "\nName of book: " + book.getName() + "\n" + book.getAuthor());
//            }
//        }
//

        int max = books[0].getPrice(), min = books[0].getPrice();
        for (Book book : books) {
            max = Math.max(max, book.getPrice());
            min = Math.min(min, book.getPrice());
        }
        for (Book book : books) {
            if (book.getPrice() == max) {
                System.out.println("Max price of book: " + max + "\nName of book: " + book.getName() + " \n" + book.getAuthor());
            } else if (book.getPrice() == min) {
                System.out.println("\nMin price of book :" + min + "\nName of book :" + book.getName() + "\n" + book.getAuthor());
            }
        }
    }

    public static void getAuthor(String name, Book[] books) {
        for (Book book : books) {
            if (name.equals(book.getAuthor().getFullName()))
            {
                System.out.println(name + "\n" + book.getName());
            }
        }
    }
}