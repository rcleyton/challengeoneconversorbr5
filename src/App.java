import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

    String[] typeConversion = {"Conversor de Moeda", "Conversor de Temperatura"};

    String selectType = (String) JOptionPane.showInputDialog(null, 
      "Escolha uma opção", 
      "Menu", 
      JOptionPane.QUESTION_MESSAGE,
      null,
      typeConversion,
      typeConversion[0]
    );
  }
}
