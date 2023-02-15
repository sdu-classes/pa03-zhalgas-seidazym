public class Calculator {
    private int num1;
    private int num2;

//-------------Cinstructor------------
    public Calculator(double n1, double n2){
        try{
        if((int)n1 != n1 || (int)n2 != n2) throw new NumberFormatException();
        else{ 
            this.num1 = (int)n1;
            this.num2 = (int)n2;
            }
        }catch(NumberFormatException n){
            n.printStackTrace();
        }
    }
    
//-------------------Methods---------------
    public int Add(){
        try{
            if(num1 < 0 || num2 < 0)throw new ArithmeticException();
            else return num1 + num2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }
    public int Substract(){
        try{
            if(num1 < 0 || num2 < 0)throw new ArithmeticException();
            else return num1 - num2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }
    public int Myltiply(){
        try{
            if(num1 == 0 || num2 == 0)throw new ArithmeticException();
            else return num1 * num2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }
    public int Divide(){
        try{
            if(num1 == 0 || num2 == 0)throw new ArithmeticException();
            else return num1 / num2;
        }catch(ArithmeticException a){
            a.printStackTrace();
            return 1;
        }
    }

}
