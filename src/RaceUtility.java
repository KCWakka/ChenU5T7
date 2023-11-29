public class RaceUtility {
    private RaceUtility () {}
    public static double milesToKm(double miles) {
        return miles * 1.609;
    }
    public static double kmToMiles(double km) {
        return km / 1.609;
    }
    public static String makeProper(String str) {
        String newStr = str.substring(0, 1).toUpperCase();
        for (int i = 1; i < str.length();i++){
            if (str.substring(i - 1, i).equals(" ")) {
                newStr += str.substring(i, i +1).toUpperCase();
            } else {
                newStr += str.substring(i, i +1).toLowerCase();
            }
        }
        return newStr;
    }
}
