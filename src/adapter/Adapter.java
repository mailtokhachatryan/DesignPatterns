package adapter;

public class Adapter extends Sensor {

    private FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();

    @Override
    public double getTemperature() {
        return (fahrenheitSensor.getFahrenheitTemp() - 32.0) * 5.0 / 9.0;
    }
}
