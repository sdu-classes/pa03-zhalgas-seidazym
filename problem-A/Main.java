public class Main {
    public static void main(String[] args) {
//-------------Right-----------------
        Calculator c1 = new Calculator(5, 6);
        System.out.println("Add " + c1.Add());
        Calculator c2 = new Calculator(10, 8);
        System.out.println("Substract " + c2.Substract());
        Calculator c3 = new Calculator(4, 3);
        System.out.println("Multiply " + c3.Myltiply());
        Calculator c4 = new Calculator(81, 9);
        System.out.println("Divide " + c4.Divide());
//--------------False-------------
        try{
            Calculator c5 = new Calculator(5.98, 6.32);
            System.out.println(c5.Add());
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        try{
            Calculator c6 = new Calculator(5, -6);
            System.out.println(c6.Add());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            Calculator c7 = new Calculator(-5, 6);
            System.out.println(c7.Substract());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            Calculator c8 = new Calculator(5, 0);
            System.out.println(c8.Myltiply());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            Calculator c9 = new Calculator(0, 6);
            System.out.println(c9.Divide());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
