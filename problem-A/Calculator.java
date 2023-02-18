public class Calculator {
    private int num1;
    private int num2;

//-------------Constructor------------
    public Calculator(double n1, double n2){
        if((int)n1 != n1 || (int)n2 != n2) throw new NumberFormatException("Your number is not int");
        else{ 
            this.num1 = (int)n1;
            this.num2 = (int)n2;
            }
    }
    
//-------------------Methods---------------
    public int Add(){
        if(num1 < 0 || num2 < 0)throw new ArithmeticException(String.format("One of your number is negative: " + num1 + " or " + num2));
        else return num1 + num2;
    }
    public int Substract(){
        if(num1 < 0 || num2 < 0)throw new ArithmeticException(String.format("One of your number is negative: " + num1 + " or " + num2));
        else return num1 - num2;
    }
    public int Myltiply(){
        if(num1 == 0 || num2 == 0)throw new ArithmeticException(String.format("One of your number is zero: " + num1 + " or " + num2));
        else return num1 * num2;
    }
    public int Divide(){
        if(num1 == 0 || num2 == 0)throw new ArithmeticException(String.format("One of your number is zero: " + num1 + " or " + num2));
        else return num1 / num2;
    }
}
