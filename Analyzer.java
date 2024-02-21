import java.text.DecimalFormat;
import java.util.ArrayList;

class Analyzer {
    public static void main(String[] args) {
        ArrayList<Temperature> data = DataRetriever.load();
        if (data.size() < 1) {
            System.out.println("No temps to analyze; make sure nyc_temperature.csv is present");
            return;
        }
        double sumTemp = 0;
        double sumPrecip = 0;
        for (Temperature temp : data) {
            sumTemp += temp.tavg;
            if (!temp.precipitation.equals("T")) {
                // parse
                double precip = Double.parseDouble(temp.precipitation);
                sumPrecip += precip;
            }
        }
        double avgTemp = sumTemp / (double)data.size();
        double avgPrecip = sumPrecip / (double)data.size();
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println("Average temperature: " + format.format(avgTemp) + "F");
        System.out.println("Average precipitation: " + format.format(avgPrecip) + " inches");
    }
}
