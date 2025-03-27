public class Q18 {
  public static void main(String[] args) {
    // use classes
    Integer intObj = 69;
    Double doubleObj = 69.69696969;
    Character charObj = 'X';
    Boolean boolObj = true;

    System.out.println("Wrapped objs:");
    System.out.println("Integer object: " + intObj);
    System.out.println("Double object: " + doubleObj);
    System.out.println("Character object: " + charObj);
    System.out.println("Boolean object: " + boolObj);

    int intVal = intObj;
    double doubleVal = doubleObj;
    char charVal = charObj;
    boolean boolVal = boolObj;

    System.out.println("\nUnwrapped values:");
    System.out.println("int value: " + intVal);
    System.out.println("double value: " + doubleVal);
    System.out.println("char value: " + charVal);
    System.out.println("boolean value: " + boolVal);

}
}
