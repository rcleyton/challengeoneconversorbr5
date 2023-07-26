import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {

		UserInterface userInterface = new UserInterface();
		ConvertCurrency convertCurrency = new ConvertCurrency();

		Object[] options = { "Sim", "Não" };
		int opcao = 0;

		while (opcao == 0 || opcao == -1) {

			userInterface.selectType();

			double inputValue = userInterface.inputValue();

			String selectCurrency = userInterface.selectCurrency();

			String result = convertCurrency.convert(inputValue, selectCurrency);

			JOptionPane.showMessageDialog(null, result);

			opcao = JOptionPane.showOptionDialog(null, "Deseja fazer nova conversão?", "Continuar...",
					JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		}
	}
}
