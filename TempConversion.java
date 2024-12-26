class TempConversion {

    // Define the temperature conversion method
    static int fahrenheitToCelsius(int fahrenheitTemperature){      // Define a method called fahrenheitToCelsius() with parameter an int called fahrenheitTemperature

        // Compute and return the celsius temperature from the parameter
        return(fahrenheitTemperature - 32) * 5/9;       // method block: compute and return the converted Farenheit to Celsius temperature
    }
        public static void main(String[] args) {
            // Call the method to print the conversion to 32F
            System.out.println("32F in Celsius is: " + fahrenheitToCelsius(32));    // from main method call on the fahrenheitToCelsius() to compute 32F
            // Call the method to print the conversion to 90F
            System.out.println("90 in Celsius is: " + fahrenheitToCelsius(90)); // from main method call on the fahrenheitToCelsius() to compute 90F
        }
}


