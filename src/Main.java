/*
VAR
celsius, fahrenheit: Real

INICIO

Ler celsius

fahrenheit ← (celsius * 1.8) + 32

Escreva "O valor transformado é igual a " + fahrenheit + "°F"

FIM

TESTE DE MESA

| Celsius | Fahrenheit (celsius * 1.8 + 32) | Saída |
|---------|--------------------------------|--------------------------------------------|
| 0       | 32.0                           | "O valor transformado é igual a 32.0°F"    |
| 25      | 77.0                           | "O valor transformado é igual a 77.0°F"    |
| 37      | 98.6                           | "O valor transformado é igual a 98.6°F"    |
| 100     | 212.0                          | "O valor transformado é igual a 212.0°F"   |
*/


import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        //Strings
        String scelsius;
        scelsius = JOptionPane.showInputDialog(null, "Qual o valor em °C?");
        celsius = Double.parseDouble(scelsius);

        //Main code
        fahrenheit = (celsius * 1.8) + 32;

        //Saída
        JOptionPane.showMessageDialog(null, "O valor transformado é igual a " + fahrenheit + "°F" );
    }
}