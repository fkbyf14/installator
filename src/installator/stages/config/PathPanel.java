package installator.stages.config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author cfif11
 */
public class PathPanel extends StagePanel<String> {
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JTextField textField1;
	private JLabel label;
	private JButton button4;
	private JFileChooser fileChooser = new JFileChooser();


	public PathPanel(int index, String question, String defaultAnswer) {
		super(index);
		init();
		label.setText(question);
		textField1.setText(defaultAnswer);
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				if (fileChooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
					return;
				textField1.setText(fileChooser.getSelectedFile().getParent() + '/' +
						fileChooser.getSelectedFile().getName());
			}
		});
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcData();
			}
		});
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
	}

	@Override
	public JPanel getGUI() {
		return panel1;
	}

	@Override
	protected void init() {
		panel1.setSize(400, 300);
		button1.setText("Назад");
		button2.setText("Вперед");
		button3.setText("Отмена");
		button4.setText("Обзор");
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
		button1 = new JButton();
		button1.setText("Button");
		panel3.add(button1);
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
		gbc.weightx = 0.1;
		gbc.anchor = GridBagConstraints.WEST;
		panel4.add(label, gbc);
		textField1 = new JTextField();
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel4.add(textField1, gbc);
		final JLabel label1 = new JLabel();
		label1.setText("");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.WEST;
		panel4.add(label1, gbc);
		final JPanel panel5 = new JPanel();
		panel5.setLayout(new GridBagLayout());
		panel1.add(panel5, BorderLayout.EAST);
		button4 = new JButton();
		button4.setText("Button");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel5.add(button4, gbc);
		final JLabel label2 = new JLabel();
		label2.setText("      ");
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		panel5.add(label2, gbc);
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$() {
		return panel1;
	}
}
