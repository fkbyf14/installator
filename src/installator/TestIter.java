package installator;

import javax.swing.*;
import java.awt.*;

/**
 * @author cfif11
 */
public class TestIter extends JFrame {

	TestIter() {
		super();
		Dimension d = new Dimension(400, 300);
		setMinimumSize(d);
		setContentPane(panel);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private JPanel panel;

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
		panel.setMinimumSize(new Dimension(400, 300));
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return panel;
	}
}
