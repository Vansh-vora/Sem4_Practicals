import java.util.Scanner;

//Write a Java Program that calculate area of triangle using Constructor. Also
// find area of rectangle using Constructor Overloading
public class Q9 {
    public  static void main(String[] args){
        Triangle tr1=new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of triangle:");
        tr1.height=sc.nextFloat();
        System.out.println("Enter base of triangle:");
        tr1.base=sc.nextFloat();
        tr1.findArea();

        Triangle tr2=new Triangle();

        System.out.println("Enter height of reactagle:");
        tr2.height=sc.nextFloat();
        System.out.println("Enter base of rectangle:");
        tr2.base=sc.nextFloat();
        tr2.findArea(tr2.height, tr2.base);
    }
}
class Triangle{
    float height;
    float base;

    void findArea(){
        float area=(height*base)/2;
        System.out.println("Area of Triangle is:"+area);
    }
    void findArea(float height,float base){
        float area=(height*base);
        System.out.println("Area of Rectangle is:"+area);
    }
}