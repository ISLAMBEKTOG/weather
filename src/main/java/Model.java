public class Model {
    private String name;
    private Double temp;
    private Double humidity;
    private String icon;
    private String main;

    public String getName() {
        return name;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getTemp() {
        return temp;
    }

    public String getIcon() {
        return icon;
    }

    public String getMain() {
        return main;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
