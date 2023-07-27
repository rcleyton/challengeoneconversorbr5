import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertCurrency {
	public double brUsd = 0.211;
	public double brEur = 0.191;
	public double brGbp = 0.165;
	public double brArs = 57.51;
	public double brClp = 174.08;

	public double brlToUsd(double brlToUsd) {
		return brlToUsd * brUsd;
	}

	public double brlToEur(double brlToEur) {
		return brlToEur * brEur;
	}

	public double brlToGbp(double brlToGbp) {
		return brlToGbp * brGbp;
	}

	public double brlToArs(double brlToArs) {
		return brlToArs * brArs;
	}

	public double brlToClp(double brlToClp) {
		return brlToClp * brClp;
	}

	public double usdToBrl(double usdToBrl) {
		return usdToBrl / brUsd;
	}

	public double eurToBrl(double eurToBrl) {
		return eurToBrl / brEur;
	}

	public double gbpToBrl(double gbpToBrl) {
		return gbpToBrl / brGbp;
	}

	public double arsToBrl(double arsToBrl) {
		return arsToBrl / brArs;
	}

	public double clpToBrl(double clpToBrl) {
		return clpToBrl / brClp;
	}

	public void convertCurrency(double value, String currency) {
//		DecimalFormat formatResult = new DecimalFormat("#.00");
//		
//		double numeroFormatado = formatResult.format(value);
		double convertedCurrency = 0.0;

		switch (currency) {
		case "Real para Dólar":
			convertedCurrency = brlToUsd(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + convertedCurrency);
			break;
		case "Real para Euro":
			convertedCurrency = brlToEur(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de € " + convertedCurrency);
			break;
		case "Real para Libra Esterlina":
			convertedCurrency = brlToGbp(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de £ " + convertedCurrency);
			break;
		case "Real para Peso Argentino":
			convertedCurrency = brlToArs(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de $ " + convertedCurrency);
			break;
		case "Real para Peso Chileno":
			convertedCurrency = brlToClp(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de $ " + convertedCurrency);
			break;
		case "Dólar para Real":
			convertedCurrency = usdToBrl(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + convertedCurrency);
			break;
		case "Euro para Real":
			convertedCurrency = eurToBrl(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + convertedCurrency);
			break;
		case "Libra Esterlina para Real":
			convertedCurrency = gbpToBrl(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + convertedCurrency);
			break;
		case "Peso Argentino para Real":
			convertedCurrency = arsToBrl(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + convertedCurrency);
			break;
		case "Peso Chileno para Real":
			convertedCurrency = clpToBrl(value);
			JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + convertedCurrency);
			break;
		default:
			throw new IllegalArgumentException("Opção de moeda inválida: " + currency);
		}
	}
}
