public class Factorial {
   static int Factorial(int fact)
    {
        if(fact==1)
       {return 1;} 
        else{ return (fact*Factorial(fact-1));}
       
    }
    public static void main(String args[]) {
        System.out.println(Factorial(5));        
    }
    
}