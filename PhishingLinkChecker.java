import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhishingLinkChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Phishing Link Checker");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter URL:");
        JTextField urlField = new JTextField(30);
        JButton checkButton = new JButton("Check URL");
        JLabel resultLabel = new JLabel("");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = urlField.getText().trim();
                if (url.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a URL.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                resultLabel.setText("Processing... (API call needed)");
                // Add API call here and update resultLabel accordingly
            }
        });

        frame.add(label);
        frame.add(urlField);
        frame.add(checkButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
