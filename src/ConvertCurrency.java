import java.text.DecimalFormat;

public class ConvertCurrency {
	public double brToUsd = 0.211;
	public double brToEur = 0.191;
	public double brToGbp = 0.165;
	public double brToArs = 57.51;
	public double brToClp = 174.08;

	public String convert(double value, String currency) {
		DecimalFormat formatResult = new DecimalFormat("#.00");

		switch (currency) {
		case "Real para Dólar":
			value = value * brToUsd;
			break;
		case "Real para Euro":
			value = value * brToEur;
			break;
		case "Real para Libra Esterlina":
			value = value * brToGbp;
			break;
		case "Real para Peso Argentino":
			value = value * brToArs;
			break;
		case "Real para Peso Chileno":
			value = value * brToClp;
			break;
		case "Dólar para Real":
			value = value / brToUsd;
			break;
		case "Euro para Real":
			value = value / brToEur;
			break;
		case "Libra Esterlina para Real":
			value = value / brToGbp;
			break;
		case "Peso Argentino para Real":
			value = value / brToArs;
			break;
		case "Peso Chileno para Real":
			value = value / brToClp;
			break;
		default:
			throw new IllegalArgumentException("Opção de moeda inválida: " + currency);
		}

		String numeroFormatado = formatResult.format(value);
		return "O valor da conversão é de " + numeroFormatado;
	}
}
