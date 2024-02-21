import java.util.ArrayList;

import core.data.*;

class DataRetriever {
    static ArrayList<Temperature> load() {
        DataSource ds = DataSource.connect("nyc_temperature.csv");
        ds.load();
        return ds.fetchList(Temperature.class, "date", "tmax", "tmin", "tavg", "departure", "HDD", "CDD", "precipitation", "new_snow", "snow_depth");
    }
}