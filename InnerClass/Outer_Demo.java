package InnerClass;

class Outer_Demo {
   int num;
   
   static int i=10;
   int j=20;
  
   // inner class
    class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
         
      }
      int i=30;

		 final static int j=40; 

      int j(){


      return 60;
      }
   }
   
   // Accessing the inner class from the method within
   void display_Inner() {
	   
	   System.out.println("This is outer class i :" +i);
      Inner_Demo inner = new Inner_Demo();
      inner.print();
      System.out.println("This is inner class i :" +inner.i);
      System.out.println("This is inner class j :" +inner.j);
      System.out.println("This is inner class j method :" +inner.j());
   }
   
   
   public static void main(String args[]) {
	      // Instantiating the outer class 
	      Outer_Demo outer = new Outer_Demo();
	      System.out.println("This is outer class i :" +outer.i);
	      System.out.println("This is outer class j :" +outer.j);
	      // Accessing the display_Inner() method.
	      outer.display_Inner();
   }
}
   