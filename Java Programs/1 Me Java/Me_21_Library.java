class library
{
  
    String bookName,authorName,language,price;
    Boolean isBorrowed = false;
    
    library(String bookName, String authorName,String language,String price)
    {
      this.bookName = bookName;
      this.authorName = authorName;
      this.language = language;
      this.price = price;
    }
    
    void buyBook(){
      if(this.isBorrowed)
      {
        System.out.println(this.bookName+"is alerady bought!");
      }
      else
      {
        this.isBorrowed=true;
        System.out.println("Enjoy Your Book "+ this.bookName);
      }
    }
    
    void returnBook()
    {
      if(this.isBorrowed)
      {
        this.isBorrowed=false;
        System.out.println("Hope You Enjoyed a Book"+this.bookName);
      }
      else
      {
        System.out.println("Book is Already returned.");
      }
    }
    
    void getBookInfo()
    {
      System.out.printf("Name: "+this.bookName+"\nAuthor: "+this.authorName+"\nLanguage: "+this.language+"\n");
    }
    
  }
  
  
  public class Me_21_Library
  {
    public static void main(String[] args)
    {
      library book1 = new library("gulmohar","dennis","english","150");
      library book2 = new library("GotSeen","rithchie","spanish","400");

      book1.buyBook();
      book1.getBookInfo();
      book1.returnBook();
      book1.buyBook();
      book1.returnBook();
      book2.buyBook();
      book2.getBookInfo();
      book2.returnBook();
    }
}
  
  
  
  
  
  
  
  
  
  