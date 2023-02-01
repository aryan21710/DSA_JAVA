package DSA.Stacks;

import java.util.Stack;

public class BookReading {
    public static void main(String[] args) {
        Book myBook4 = new Book("Tinkle",100);
        Book myBook3 = new Book("Lord of the Rings", 300);
        Book myBook2 = new Book("Champak", 100);
        Book myBook1 = new Book("Harry Potter", 200);
        Stack<Book> bookStack = new Stack<>();
        bookStack.push(myBook1);
        bookStack.push(myBook2);
        bookStack.push(myBook3);
        bookStack.push(myBook4);
        while(!bookStack.isEmpty()) {
            Book currentBook= bookStack.peek();
            while (!currentBook.completed()) {
                currentBook.read100Pages();
            }
            bookStack.pop();
        }

    }
}

class Book {
    private String title;
    private int pagesLeft;

    public  Book(String title, int pagesLeft) {
        this.title = title;
        this.pagesLeft = pagesLeft;
    }


    public void read100Pages() {
        if (this.pagesLeft >= 100) {
            System.out.println("Reading 100 Pages of "+this.title);
            this.pagesLeft-=100;
        }
    }

    public Boolean completed() {
        return this.pagesLeft <= 0;
    }

}


