package installer.stages.config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author cfif11
 */
class ChoicePanel extends StagePanel<Integer> {

	private JPanel panel1;
	private JButton button2;
	private JButton button3;
	private JRadioButton[] radioButtons;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label;
	private JPanel panel2;
	private ItemListener itemListener = new ItemListener() {
		@Override
		public void itemStateChanged(ItemEvent e) {
			button2.setEnabled(true);
		}
	};

	ChoicePanel(int index, String text, String[] radioButtonsText) {
		super(index);
		init();
		panel1.setSize(400, 300);
		label.setText(text);
		radioButtons = new JRadioButton[radioButtonsText.length];
		GridBagConstraints gbc;
		for (int i = 0; i < radioButtonsText.length; i++) {
			radioButtons[i] = new JRadioButton();
			radioButtons[i].setText(radioButtonsText[i]);
			radioButtons[i].addItemListener(itemListener);
			gbc = new GridBagConstraints();
			gbc.gridx = 0;
			gbc.gridy = i + 1;
			gbc.anchor = GridBagConstraints.WEST;
			panel2.add(radioButtons[i], gbc);
			buttonGroup.add(radioButtons[i]);
		}
		button2.setEnabled(false);
		button3.addActionListener(exitListener);
		button2.addActionListener(nextListener);
	}

	@Override
	public JPanel getGUI() {
		return panel1;
	}

	@Override
	protected void init() {
		button2.setText("Вперед");
		button3.setText("Отмена");
	}

	@Override
	protected void calcData() {
		for (int i = 0; i < radioButtons.length; i++) {
			if (radioButtons[i].isSelected())
				data = i;
		}
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
		panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		panel1.add(panel2, BorderLayout.WEST);
		label = new JLabel();
		label.setText("Label");
		GridBagConstraints gbc;
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panel2.add(label, gbc);
		final JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout(0, 0));
		panel1.add(panel3, BorderLayout.SOUTH);
		final JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel3.add(panel4, BorderLayout.EAST);
		button2 = new JButton();
		button2.setText("Button");
		panel4.add(button2);
		button3 = new JButton();
		button3.setText("Button");
		panel4.add(button3);
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return panel1;
	}
}
