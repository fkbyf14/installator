package installator;

import installator.stages.config.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by cfif11 on 24.04.14.
 */
public class TestIter extends JFrame {

    TestIter() {
        super();
        Dimension d = new Dimension(800, 600);
        setMinimumSize(d);
        button1.setText("Button1");
        setContentPane(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setVisible(true);
    }

    void add(JPanel panel) {
        this.panel.add(panel, BorderLayout.CENTER);
    }

    private JPanel panel;
    JButton button1;


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout(0, 0));
        panel.setMinimumSize(new Dimension(200, 300));
        button1 = new JButton();
        button1.setText("Button");
        panel.add(button1, BorderLayout.NORTH);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }
}
