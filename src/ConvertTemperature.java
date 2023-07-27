import javax.swing.JOptionPane;

public class ConvertTemperature {

	public double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	public void convertTemperature(double value, String temperature) {
		double convertedTemperature = 0.0;

		if (temperature == "Celsius para Fahrenheit") {
			convertedTemperature = celsiusToFahrenheit(value);
			JOptionPane.showMessageDialog(null, "A temperatura convertida é " + convertedTemperature + " °F");
		} else {
			convertedTemperature = fahrenheitToCelsius(value);
			JOptionPane.showMessageDialog(null, "A temperatura convertida é " + convertedTemperature + " °C");
		}
	}
}
