package InnerClass;

public class My_class {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();
      System.out.println("This is outer class i :" +outer.i);
      System.out.println("This is outer class j :" +outer.j);
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
}
