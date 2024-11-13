import java.util.Scanner;

 class Book {
    String author,Title;
    int no;
    
        public Book( String author, int no,String Title){
            this.author=author;
        this.no=no;
        this.Title=Title;
    
        }
        public void display(){
            System.out.println(this.author+"is the name of the author of the book "+this.Title);
        }
    }
    class Person extends Book{

        public Person(String author, int no,String Title){
            super(author, no, Title);

        }
    }
     class Textbook extends Book {
        String edtion;
    public Textbook(String author, int no , String Title, String edtion){
        super( author,no,Title);
             this.edtion=edtion;
            
    }
        
    }
     class program {
    public static void main(String[] args) {
        Person p=new Person("Jeff Kiney",217,"Diary of a Wimpy Kid");

        p.display();
        Textbook t=new Textbook("Enid Blyton", 312, "The ultimate Science Guide Textbook", "Latest");
        t.display();
    }
        
    }