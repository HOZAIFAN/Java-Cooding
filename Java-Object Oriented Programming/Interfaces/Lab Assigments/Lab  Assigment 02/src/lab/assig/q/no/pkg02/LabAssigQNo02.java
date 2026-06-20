/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.assig.q.no.pkg02;

class Book{
    
   private String author;
   private String []chapterNames;
   private int chapCount;
   
   public Book() {
        this.author = "";
        this.chapterNames = new String[100];
        this.chapCount = 0;
    }
    public Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = new String[100]; // always size 100
        this.chapCount = Math.min(chapterNames.length, 100);

        // Copy chapter names into fixed array
        for (int i = 0; i < this.chapCount; i++) {
            this.chapterNames[i] = chapterNames[i];
        } 
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
     public String[] getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(String[] chapterNames) {
        this.chapCount = Math.min(chapterNames.length, 100);
        for (int i = 0; i < this.chapCount; i++) {
            this.chapterNames[i] = chapterNames[i];
        }
    }

    public int getChapterCount() {
        return chapCount;
        
    }
     public boolean compareBooks(Book other) {
        return this.author.equalsIgnoreCase(other.author);
    }

    // Compare chapter names → return the book with more chapters
    public Book compareChapterNames(Book other) {
        if (this.chapCount >= other.chapCount) {
            return this;
        } else {
            return other;
        }
    }

   
}
public class LabAssigQNo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String[] chapters1 = {"Intro", "OOP Basics", "Encapsulation"};
        String[] chapters2 = {"Start", "Psychology", "Civic", "Programming_fundamentals"};

        Book book1 = new Book("John Smith", chapters1);
        Book book2 = new Book("John Smith", chapters2);

        // Compare authors
        if (book1.compareBooks(book2)) {
            System.out.println("Both books have the same author.");
        } else {
            System.out.println("Different authors.");
        }

        // Compare chapters
        Book moreChapters = book1.compareChapterNames(book2);
        System.out.println("Book with more chapters is authored by: " + moreChapters.getAuthor());
        
    }
    
}
