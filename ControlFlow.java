public class ControlFlow {
    public static void main(String[] args) {
        int temperature = 68;
        int heatingPoint = 70;
        int coolingPoint = 75;
        boolean isFanOn = false;
    if ((temperature >= heatingPoint) && (temperature <= coolingPoint)) {       // 68 >= 70 is false && 68 <= 75 is true, false && true is false
        if (isFanOn) {                                                          // isFanOn = false    
            System.out.println("Turning fan off");
            isFanOn = false;                                                        
        }
    } else if ((temperature > coolingPoint) && !isFanOn) {                      // 68 > 75 is false && is not false is true, false && true is false
        System.out.println("Turning on air conditioner and fan");
        isFanOn = true;                                                         // isFanOn = true
    } else if ((temperature < heatingPoint) && !isFanOn) {                      // 68 < 70 is true && is not false is true, true && true is true, execute code block statement
        System.out.println("Turning on the heat and fan");
        isFanOn = true;
    }  
}
}