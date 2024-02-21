class Temperature {
    public String date;
    public double tmax;
    public double tmin;
    public double tavg;
    public double departure;
    public double hdd;
    public double cdd;
    public String precipitation;
    public String new_snow;
    public String snow_depth;

    public Temperature(String date, double tmax, double tmin, double tavg, double departure, double hdd, double cdd, String precipitation, String new_snow, String snow_depth) {
        this.date = date;
        this.tmax = tmax;
        this.tmin = tmin;
        this.tavg = tavg;
        this.departure = departure;
        this.hdd = hdd;
        this.cdd = cdd;
        this.precipitation = precipitation;
        this.new_snow = new_snow;
        this.snow_depth = snow_depth;
    }

    public String toString() {
        return "Temperature(date=" + date + ", tmax=" + tmax + ", tmin=" + tmin + ", tavg=" + tavg + ", departure=" + departure + ", hdd=" + hdd + ", cdd=" + cdd + ", precipitation=" + precipitation + ", new_snow=" + new_snow + ", snow_depth=" + snow_depth + ")";
    }

}
