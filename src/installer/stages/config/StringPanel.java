package installer.stages.config;

import javax.swing.*;
import java.awt.*;

/**
 * @author cfif11
 */
public class StringPanel extends StagePanel<String> {
	private JPanel panel1;
	private JButton button2;
	private JButton button3;
	private JTextField textField1;
	private JLabel label;

	public StringPanel(int index, String question, String defaultAnswer) {
		super(index);
		init();
		label.setText(question);
		textField1.setText(defaultAnswer);

		button3.addActionListener(exitListener);
		button2.addActionListener(nextListener);
	}

	@Override
	public JPanel getGUI() {
		return panel1;
	}

	@Override
	protected void init() {
		panel1.setSize(400, 300);
		button2.setText("Вперед");
		button3.setText("Отмена");
	}

	@Override
	protected void calcData() {
		data = textField1.getText();
		super.calcData();
	}

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
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(0, 0));
		final JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout(0, 0));
		panel1.add(panel2, BorderLayout.SOUTH);
		final JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel2.add(panel3, BorderLayout.EAST);
		button2 = new JButton();
		button2.setText("Button");
		panel3.add(button2);
		button3 = new JButton();
		button3.setText("Button");
		panel3.add(button3);
		final JPanel panel4 = new JPanel();
		panel4.setLayout(new GridBagLayout());
		panel1.add(panel4, BorderLayout.CENTER);
		label = new JLabel();
		label.setText("Label");
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panel4.add(label, gbc);
		textField1 = new JTextField();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel4.add(textField1, gbc);
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return panel1;
	}
}
