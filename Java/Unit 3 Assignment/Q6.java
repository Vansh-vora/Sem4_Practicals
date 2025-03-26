import java.util.*;
//Create a class name Book that contains data fields for the title and number of pages.
// Include get and set methods for these fields. Next, create a subclass named Textbook,
// which contains an additional field that holds a grade level for the Textbook and
// additional methods to get and set grade level field. Write an application that
// demonstrates using objects of each class.
class Book{
  String title;
  int pages;

  public void set(String title,int pages){
    this.title=title;
    this.pages=pages;
  }
  public int getPages(){
    return pages;
  }
  public String getTitle(){
    return title;
  }
}

class Textbook extends Book{
  int gradelevel;

  public void setGradeLevel(int gradelevel){
    this.gradelevel=gradelevel;
  }

  Textbook(String title,int pages,int gradelevel){
    super.set(title,pages);
    setGradeLevel(gradelevel);

  }
  public int getGradeLevel(){
    return gradelevel;
  }
}

public class Q6 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Title of Book: ");
      String Title=sc.nextLine();
      System.out.println("Enter the pages in the Book: ");
      int pages=sc.nextInt();
      System.out.println("Enter the gradelevel in the book: ");
      int gl=sc.nextInt();
      sc.close();

      Textbook tt=new Textbook(Title, pages, gl);

      System.out.println("Grade Level:"+tt.getGradeLevel()+"\n Total Pages:"+tt.getPages()+"\n Book Title:"+tt.getTitle());
    }
}
