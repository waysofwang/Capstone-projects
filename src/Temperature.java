//Programmer: Sonam lama
import javax.swing.JOptionPane;

public class Temperature {

    public static void main(String[] args) {
        String temperatureInput = JOptionPane.showInputDialog("Enter the temperature.");
        double temperature = Double.parseDouble(temperatureInput);

        // Get the user's choice of conversion.
        String choice = JOptionPane.showInputDialog("Do you want to convert to Fahrenheit (F) or Celsius (C)?");

        // Convert the temperature to the desired unit.
        double convertedTemperature;
        if (choice.equals("F")) {
            convertedTemperature = (temperature * 9 / 5) + 32;
        } else {
            convertedTemperature = (temperature - 32) * 5 / 9;
        }

        // Display the converted temperature.
        JOptionPane.showMessageDialog(null, "The converted temperature is " + convertedTemperature);
    }
}
