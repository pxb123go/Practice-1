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
     class program {
    public static void main(String[] args) {
        Person p=new Person("Jeff Kiney",217,"Diary of a Wimpy Kid");
        p.display();
    }
        
    }