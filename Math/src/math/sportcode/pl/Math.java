package math.sportcode.pl;
import static java.lang.Math.*;
public class Math 
{
	public static void main(String[] args)
	{
		int a = 2 , b = 5 , c =4 , d = -5 ;
        double exponentiation = pow(a , b) ; 
        double element = sqrt(c) ;
        double absolutvalue = abs(d) ;
     
        System.out.println(a+" do potegi "+b+" jest rowne "+exponentiation) ;
        System.out.println("Wartosc pierwiastek z "+c+" wynosi "+element);
        System.out.println("Wartosc bezwzgledna z liczby "+d+" to "+absolutvalue);
	}
}
