public class Temperature {
    private double highTemperature;
    private double lowTemperature;
    private String temperatureScale;
    public Temperature (double high, double low, String scale) {
        highTemperature = high;
        lowTemperature = low;
        if ((scale.equals("F"))||(scale.equals("C"))){
            temperatureScale = scale;
        } else {
            temperatureScale = "F";
        }
    }
    public static double convertCtoF (double temp) {
        return (temp * 9/5) +32;
    }
    public static double convertFtoC (double temp) {
        return (temp -32) * 5/9;
    }
    public void changeToC() {
        if (!(temperatureScale.equals("C"))) {
            highTemperature = convertFtoC(highTemperature);
            lowTemperature = convertFtoC(lowTemperature);
            temperatureScale = "C";
        }
    }
    public void changeToF() {
        if (!(temperatureScale.equals("F"))) {
            highTemperature = convertCtoF(highTemperature);
            lowTemperature = convertCtoF(lowTemperature);
            temperatureScale = "F";
        }
    }
    public String tempInfo() {
        return "High Temperature: " + highTemperature + " " + temperatureScale + "\nLow Temperature: " + lowTemperature + " " + temperatureScale;
    }
}
