package Tasks.CodeWars;

public class Converter {

    public static float mpgToKPM(final float mpg) {
        double k = 1.609344 / 4.54609188;
        double mpgToKpm = mpg * k;
        String res = String.format("%.2f", mpgToKpm);
        return Float.parseFloat(res);
    }

}
