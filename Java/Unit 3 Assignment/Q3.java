import java.util.*;
// Write a program to calculate arithmetic mean in the superclass and standard deviation in the subclass.

class Mean{
  double[] numbers;

  Mean(double[] numbers){
    this.numbers=numbers;
  }

  double calculateMean(){
    double sum=0;

    for(double num : numbers){
      sum+=num;
    }
    return sum/numbers.length;
  }
}

class StdDevitation extends Mean{
  
  StdDevitation(double[] numbers){
    super(numbers);
  }

  double calculateStdDevitation(){
    double mean=super.calculateMean();
    double sumSquareDifference=0;

    for(double num:numbers){
      sumSquareDifference+=Math.pow(num-mean,2);
    }
    return Math.sqrt(sumSquareDifference/numbers.length);
  }
}
public class Q3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the number of elements: ");
      int n = scanner.nextInt();
      double[] data = new double[n];

      System.out.println("Enter " + n + " numbers:");
      for (int i = 0; i < n; i++) {
          data[i] = scanner.nextDouble();
      }

      scanner.close();

      StdDevitation stats = new StdDevitation(data);

      System.out.println("The data is: " + Arrays.toString(data));
      System.out.println("The mean is: " + stats.calculateMean());
      System.out.println("The standard deviation is: " + stats.calculateStdDevitation());
    }
}
