import java.util.Scanner;

//Create a class Admin with Id, enrollnment no and name. Create two methods named
//input()
// and display(). Create 5 objects of that class and print all the values of it.
// Note: use Array of Object concept
public class Q11 {
    private int id=0;
    private String name;

    public void input(int id,String name){
        this.id=id;
        this.name=name;

    }
    public void display(){
        System.out.println("The id is:"+id);
        System.out.println("The name is:"+name);
    }

    public static void main(String[] args) {
        int id=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of enteries:");
        int len=sc.nextInt();

        Q11[] enteries=new Q11[len];

        for(int i=0;i<len;i++){
            System.out.println("Enter your name:");
            String name=sc.next();

            id++;

            enteries[i]=new Q11();
            enteries[i].input(id,name);
        }
        for(Q11 entry:enteries){
            entry.display();
        }
        sc.close();
    }
}
