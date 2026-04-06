import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {
    TextField tInput;
    Panel panel;

    String btnString[] = {
        "7", "8", "9", "+",
        "4", "5", "6", "-",
        "1", "2", "3", "*",
        "C", "0", "=", "/"
    };

    Button btn[] = new Button[16];

    char op;
    double num1 = 0, num2 = 0, result = 0;

    public Calculator() {
        setLayout(new BorderLayout());

        tInput = new TextField();
        tInput.setFont(new Font("Arial", Font.BOLD, 20));

        panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));

        add(tInput, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        for (int i = 0; i < 16; i++) {
            btn[i] = new Button(btnString[i]);
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        try {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
                num1 = Double.parseDouble(tInput.getText());
                op = str.charAt(0);
                tInput.setText("");

            } else if (str.equals("=")) {
                num2 = Double.parseDouble(tInput.getText());

                switch (op) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            tInput.setText("Error");
                            return;
                        }
                        result = num1 / num2;
                        break;
                }

                tInput.setText(String.valueOf(result));
                num1 = result;

            } else if (str.equals("C")) {
                tInput.setText("");
                num1 = num2 = result = 0;

            } else {
                tInput.setText(tInput.getText() + str);
            }

        } catch (Exception e) {
            tInput.setText("Error");
        }
    }

    public static void main(String args[]) {
        Calculator m = new Calculator();
        m.setTitle("My Calculator");
        m.setSize(300, 350);
        m.setVisible(true);
    }
}