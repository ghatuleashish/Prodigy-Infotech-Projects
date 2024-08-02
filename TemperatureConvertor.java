package allTemp;
import java.util.*;

public class TemperatureConvertor {

		 public static double celsiusToFahrenheit(double celsius) {
		        return (celsius * 9/5) + 32;
		    }
		    public static double fahrenheitToCelsius(double fahrenheit) {
		        return (fahrenheit - 32) * 5/9;
		    }

		    
		    public static double celsiusToKelvin(double celsius) {
		        return celsius + 273.15;
		    }

		   
		    public static double kelvinToCelsius(double kelvin) {
		        return kelvin - 273.15;
		    }

	
		    public static double fahrenheitToKelvin(double fahrenheit) {
		        return (fahrenheit - 32) * 5/9 + 273.15;
		    }

		    
		    public static double kelvinToFahrenheit(double kelvin) {
		        return (kelvin - 273.15) * 9/5 + 32;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Temperature Converter");
		        System.out.println("1. Celsius to Fahrenheit and Kelvin ");
		        System.out.println("2. Fahrenheit to Celsius  Kelvin");
		        System.out.println("3. Kelvin to Celsius Fahrenheit");
		        System.out.println("Please Select from above option......");
		        
		        
		        int option = scanner.nextInt();

		        double inputTemp, convertedTemp1,convertedTemp2;

		        switch (option) {
		            case 1:
		                System.out.print("Enter temperature in Celsius: ");
		                inputTemp = scanner.nextDouble();
		                convertedTemp1 = celsiusToFahrenheit(inputTemp);
		                convertedTemp2 = celsiusToKelvin(inputTemp);
		                System.out.println("Temperature in Fahrenheit: " + convertedTemp1 + "\nTemperature in Keelvin: " +convertedTemp2);
		                break;
		            case 2:
		                System.out.print("Enter temperature in Fahrenheit: ");
		                inputTemp = scanner.nextDouble();
		                convertedTemp1 = fahrenheitToCelsius(inputTemp);
		                convertedTemp2 = fahrenheitToKelvin(inputTemp);
		                System.out.println("Temperature in Celsius: " + convertedTemp1 +"\nTemperature in Kelvin: " +convertedTemp2);
		                break;
		            case 3:
		                System.out.print("Enter temperature in Kelvin: ");
		                inputTemp = scanner.nextDouble();
		                convertedTemp1 = kelvinToCelsius(inputTemp);
		                convertedTemp2 = kelvinToFahrenheit(inputTemp);
		                System.out.println("Temperature in Celsius: " + convertedTemp1 +"\nTemperature in Fahrenheit: " +convertedTemp2);
		                break;
		            default:
		                System.out.println("Invalid option.");
		                break;
		        }

		        scanner.close();

	}

}
