package NewJavaLearning.appletLearning;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApletApp extends Applet implements ActionListener {
    TextField number1, number2, result;
    Button addButton;

    public void init() {
        // Initialize the text fields
        number1 = new TextField(10);
        number2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false); // Result field should be read-only

        // Initialize the button
        addButton = new Button("Add");

        // Add the components to the applet
        add(new Label("Number 1:"));
        add(number1);
        add(new Label("Number 2:"));
        add(number2);
        add(addButton);
        add(new Label("Result:"));
        add(result);

        // Register the button to listen for action events
        addButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get numbers from text fields
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());

            // Calculate the sum
            int sum = num1 + num2;

            // Display the sum in the result text field
            result.setText(Integer.toString(sum));
        } catch (NumberFormatException ex) {
            // Handle the case where the input is not a valid number
            result.setText("Invalid input");
        }
    }

}