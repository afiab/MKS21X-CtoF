//afia pd3

//The functions should have celsius and fahrenheit values as parameters.
//They should be doubles to be able to support more bytes.
//The functions should return the Fahrenheit or Celsius equivalent of the other.


//create celsiusToFahrenheit() and fahrenheitToCelsius()


public class CtoFTester{ 
        public static double celsiusToFahrenheit(double celsius){   
        return (celsius * ( 9 / 5 ) + 32 ) ; 
    }  
    public static double fahrenheitToCelsius(double fahrenheit){   
        return (( fahrenheit - 32 ) * ( 5 / 9 )) ; }
    public static void main(String[] args){  
        System.out.println(fahrenheitToCelsius(32));// expect 0
        System.out.println(celsiusToFahrenheit(0));
        System.out.println(fahrenheitToCelsius(5.0));// expect -15
        System.out.println(celsiusToFahrenheit(-15.0));
        System.out.println(fahrenheitToCelsius(14.0));// expect -10
        System.out.println(celsiusToFahrenheit(-10.0));
    }
}

/* 
(i tried making a tester procedure here)
public static boolean ftcandctftester(double celsius, double fahrenheit){
  System.out.println(celsius, fahrenheit);
  return (celsiusToFahrenheit(celsius) == fahrenheit);
}

System.out.println(ftcandctftester(0, 32));
*/