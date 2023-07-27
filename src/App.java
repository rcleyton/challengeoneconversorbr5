import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {

		UserInterface userInterface = new UserInterface();
		ConvertCurrency convertCurrency = new ConvertCurrency();
		ConvertTemperature convertTemperature = new ConvertTemperature();

		Object[] options = { "Sim", "Não" };
		int option = 0;

		while (option == 0 || option == JOptionPane.YES_OPTION) {
			String converter = userInterface.selectType();
			double inputValue = userInterface.inputValue();

			if (converter == "Conversor de Moeda") {				
				String selectCurrency = userInterface.selectCurrency();
				convertCurrency.convertCurrency(inputValue, selectCurrency);
			} else {
				String selectTemperature = userInterface.selectTemperature();
				convertTemperature.convertTemperature(inputValue, selectTemperature);
			}
			option = JOptionPane.showOptionDialog(null, "Deseja fazer nova conversão?", "Continuar...",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		}
		
        if (option != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa finalizado.", "Fim", JOptionPane.INFORMATION_MESSAGE);
        }
	}
}
