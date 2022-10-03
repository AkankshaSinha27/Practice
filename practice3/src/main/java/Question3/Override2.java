package Question3;
class Override2 {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Override2 {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Override2 {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}

