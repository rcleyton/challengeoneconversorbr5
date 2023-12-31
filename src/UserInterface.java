import javax.swing.JOptionPane;

public class UserInterface {

	public String selectType() {
		String[] typeConversion = { "Conversor de Moeda", "Conversor de Temperatura" };
		String selectType = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, typeConversion, typeConversion[0]);
		return selectType;
	}

	public double inputValue() {
		double value = 0.0;
		boolean validInput = false;

		while (!validInput) {
			String inputValue = JOptionPane.showInputDialog("Insira um valor:");
			try {
				value = Double.parseDouble(inputValue);
				validInput = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inválido! Insira um número válido.");
			}
		}
		return value;
	}

	public String selectCurrency() {
		String[] currency = { "Real para Dólar", "Real para Euro", "Real para Libra Esterlina",
				"Real para Peso Argentino", "Real para Peso Chileno", "Dólar para Real", "Euro para Real",
				"Libra Esterlina para Real", "Peso Argentino para Real", "Peso Chileno para Real" };
		String selectCurrency = (String) JOptionPane.showInputDialog(null, "Escolha a moeda desejada para conversão",
				"Moeda", JOptionPane.QUESTION_MESSAGE, null, currency, currency[0]);
		return selectCurrency;
	}
	
	public String selectTemperature() {
		String[] temperature = { "Celsius para Fahrenheit", "Fahrenheit para Celsius" };
		String selectTemperature = (String) JOptionPane.showInputDialog(null, "Escolha o tipo de temperatura desejada",
				"Temperatura", JOptionPane.QUESTION_MESSAGE, null, temperature, temperature[0]);
		return selectTemperature;
	}

}
