import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Nombre del Proyecto: Conversor de Divisas
 * Copyright (c) 2023 Deiby Herrera. Todos los derechos reservados.
 *
 * Este software es propiedad de Tu Nombre y está protegido por las leyes de copyright
 * y tratados internacionales. Se prohíbe la redistribución no autorizada de este software,
 * ya sea en su totalidad o en partes, sin el consentimiento expreso y por escrito de Tu Nombre.
 * 
 * Publicado para Alura Latam
 */

public class conv extends JFrame {

	// declaramos las variables
    private JTextField amountField;
    private JComboBox<String> fromCurrencyBox;
    private JComboBox<String> toCurrencyBox;
    private JButton convertButton;
    
    // el valor de las divisas puedes modificarlas
    
    private static final double COLON_TO_DOLLAR = 0.00185;
    private static final double COLON_TO_EURO = 0.00167;
    private static final double COLON_TO_POUND = 0.00144;
    private static final double COLON_TO_YEN = 0.263;
    private static final double COLON_TO_WON = 2.38;
    private static final double POUND_TO_COLON = 1 / 0.000545; // 1832.27
    private static final double YEN_TO_COLON = 1 / 0.1105; // 9.05
    private static final double WON_TO_COLON = 1 / 0.7692; // 1.30
    private static final double DOLLAR_TO_COLON = 1 / COLON_TO_DOLLAR;
    private static final double EURO_TO_COLON = 1 / COLON_TO_EURO;
   
  
    private static final double POUND_TO_DOLLAR = 1.27;
    private static final double DOLLAR_TO_POUND = 1 / POUND_TO_DOLLAR;

    private static final double YEN_TO_DOLLAR = 0.009;
    private static final double DOLLAR_TO_YEN = 1 / YEN_TO_DOLLAR;

    private static final double WON_TO_DOLLAR = 0.00085;
    private static final double DOLLAR_TO_WON = 1 / WON_TO_DOLLAR;

    private static final double POUND_TO_EURO = 1.16;
    private static final double EURO_TO_POUND = 1 / POUND_TO_EURO;

    private static final double YEN_TO_EURO = 0.007;
    private static final double EURO_TO_YEN = 1 / YEN_TO_EURO;

    private static final double WON_TO_EURO = 0.0007;
    private static final double EURO_TO_WON = 1 / WON_TO_EURO;

    private static final double POUND_TO_YEN = 182.23;
    private static final double YEN_TO_POUND = 1 / POUND_TO_YEN;

    private static final double POUND_TO_WON = 1653.82;
    private static final double WON_TO_POUND = 1 / POUND_TO_WON;

    private static final double YEN_TO_WON = 9.08;
    private static final double WON_TO_YEN = 1 / YEN_TO_WON;
    
    private static final double DOLLAR_TO_EURO = 1 / 1.0735; // Aproximadamente, 1 dólar es 0.931 euros
    private static final double EURO_TO_DOLLAR = 1.0735; // Aproximadamente, 1 euro es 1.0735 dólares

    public conv() {
       
    	setTitle("Conversor de Divisas");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Elementos de la lista
        amountField = new JTextField(10);
        String[] currencies = {"Colón", "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won Surcoreano"};
        fromCurrencyBox = new JComboBox<>(currencies);
        toCurrencyBox = new JComboBox<>(currencies);
        convertButton = new JButton("Convertir");

        // Accion al boton
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // try para los errores
            	 try {
            		 
            		// capturar los numeros
                double amount = Double.parseDouble(amountField.getText());

                // los datos
                String fromCurrency = (String) fromCurrencyBox.getSelectedItem();
                String toCurrency = (String) toCurrencyBox.getSelectedItem();

                // las conversiones con el if
                
                double convertedAmount = 0;
                
                if (fromCurrency.equals("Colón")) {
                    if (toCurrency.equals("Dólar")) {
                        convertedAmount = amount * COLON_TO_DOLLAR;
                    } else if (toCurrency.equals("Euro")) {
                        convertedAmount = amount * COLON_TO_EURO;
                    } else if (toCurrency.equals("Libra Esterlina")) {
                        convertedAmount = amount * COLON_TO_POUND;
                    } else if (toCurrency.equals("Yen Japonés")) {
                        convertedAmount = amount * COLON_TO_YEN;
                    } else if (toCurrency.equals("Won Surcoreano")) {
                        convertedAmount = amount * COLON_TO_WON;
                    }
                } else if (fromCurrency.equals("Dólar")) {
                    if (toCurrency.equals("Colón")) {
                        convertedAmount = amount * DOLLAR_TO_COLON;
                    } else if (toCurrency.equals("Euro")) {
                        convertedAmount = amount * DOLLAR_TO_EURO;
                    } else if (toCurrency.equals("Libra Esterlina")) {
                        convertedAmount = amount * DOLLAR_TO_POUND;
                    } else if (toCurrency.equals("Yen Japonés")) {
                        convertedAmount = amount * DOLLAR_TO_YEN;
                    } else if (toCurrency.equals("Won Surcoreano")) {
                        convertedAmount = amount * DOLLAR_TO_WON;
                    }
                } else if (fromCurrency.equals("Euro")) {
                    if (toCurrency.equals("Colón")) {
                        convertedAmount = amount * EURO_TO_COLON;
                    } else if (toCurrency.equals("Dólar")) {
                        convertedAmount = amount * EURO_TO_DOLLAR;
                    } else if (toCurrency.equals("Libra Esterlina")) {
                        convertedAmount = amount * EURO_TO_POUND;
                    } else if (toCurrency.equals("Yen Japonés")) {
                        convertedAmount = amount * EURO_TO_YEN;
                    } else if (toCurrency.equals("Won Surcoreano")) {
                        convertedAmount = amount * EURO_TO_WON;
                    }
                } else if (fromCurrency.equals("Libra Esterlina")) {
                    if (toCurrency.equals("Colón")) {
                        convertedAmount = amount * POUND_TO_COLON;
                    } else if (toCurrency.equals("Dólar")) {
                        convertedAmount = amount * POUND_TO_DOLLAR;
                    } else if (toCurrency.equals("Euro")) {
                        convertedAmount = amount * POUND_TO_EURO;
                    } else if (toCurrency.equals("Yen Japonés")) {
                        convertedAmount = amount * POUND_TO_YEN;
                    } else if (toCurrency.equals("Won Surcoreano")) {
                        convertedAmount = amount * POUND_TO_WON;
                    }
                } else if (fromCurrency.equals("Yen Japonés")) {
                    if (toCurrency.equals("Colón")) {
                        convertedAmount = amount * YEN_TO_COLON;
                    } else if (toCurrency.equals("Dólar")) {
                        convertedAmount = amount * YEN_TO_DOLLAR;
                    } else if (toCurrency.equals("Euro")) {
                        convertedAmount = amount * YEN_TO_EURO;
                    } else if (toCurrency.equals("Libra Esterlina")) {
                        convertedAmount = amount * YEN_TO_POUND;
                    } else if (toCurrency.equals("Won Surcoreano")) {
                        convertedAmount = amount * YEN_TO_WON;
                    }
                } else if (fromCurrency.equals("Won Surcoreano")) {
                    if (toCurrency.equals("Colón")) {
                        convertedAmount = amount * WON_TO_COLON;
                    } else if (toCurrency.equals("Dólar")) {
                        convertedAmount = amount * WON_TO_DOLLAR;
                    } else if (toCurrency.equals("Euro")) {
                        convertedAmount = amount * WON_TO_EURO;
                    } else if (toCurrency.equals("Libra Esterlina")) {
                        convertedAmount = amount * WON_TO_POUND;
                    } else if (toCurrency.equals("Yen Japonés")) {
                        convertedAmount = amount * WON_TO_YEN;
                    }
                }
                convertedAmount = Math.round(convertedAmount);
                
                // Se muestran de forma tradicional los resultados 
               // JOptionPane.showMessageDialog(conv.this,
                       // "Cantidad: " + amount + "\nDe: " + fromCurrency +
                       // "\nA: " + toCurrency + "\nResultado: " + convertedAmount);     
                
             // lo hice con html para cambiar color y tamaño en el resultado
                String resultMessage = "<html>Cantidad: " + amount + "<br>De: " + fromCurrency +
                        "<br>A: " + toCurrency + "<br>Resultado: <font color='red', size=5 >" + convertedAmount +
                        "</font></html>";

                // muestra el resultado
                JOptionPane.showMessageDialog(conv.this, resultMessage);               
                
            }catch (NumberFormatException ex) {
                // Si se lanza una NumberFormatException, muestra un mensaje de error
                JOptionPane.showMessageDialog(conv.this,
                        "Por favor, Usa Numeros y un punto (.) para los decimales, no una coma (,).",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }}
        });

        // UI elementos en el panel
        JPanel panel = new JPanel();
        panel.add(new JLabel("Cantidad:"));
        panel.add(amountField);
        panel.add(new JLabel("De:"));
        panel.add(fromCurrencyBox);
        panel.add(new JLabel("A:"));
        panel.add(toCurrencyBox);
        panel.add(convertButton);

        // se Add el panel a la ventana
        add(panel);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    conv frame = new conv();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
                
