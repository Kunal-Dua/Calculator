import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	JTextField textfield;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,equal,plus,sub,div,mul,decimal,C,undo;
	public Calculator() {
		JFrame jframe = new JFrame("Calculator");
		jframe.setSize(300, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setBackground(Color.BLACK);
		
		
		textfield = new JTextField();
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		JRadioButton enable = new JRadioButton("On");
		JRadioButton disable = new JRadioButton("Off");
		ButtonGroup bg = new ButtonGroup();
		bg.add(enable);
		bg.add(disable);
		
		JLabel label = new JLabel();
		label.setBounds(200, 1, 10, 4);
		
		JButton C = new JButton("C");
		JButton undo = new JButton("<-");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton decimal = new JButton(".");
		JButton plus = new JButton("+");
		JButton sub = new JButton("-");
		JButton div = new JButton("/");
		JButton mul = new JButton("*");
		JButton equal = new JButton("=");
		
		C.setBackground(Color.WHITE);
		undo.setBackground(Color.WHITE);
		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		b4.setBackground(Color.WHITE);
		b5.setBackground(Color.WHITE);
		b6.setBackground(Color.WHITE);
		b7.setBackground(Color.WHITE);
		b8.setBackground(Color.WHITE);
		b9.setBackground(Color.WHITE);
		b0.setBackground(Color.WHITE);
		

		textfield.setFont(new Font("SansSerif",Font.BOLD,20));
		b1.setFont(new Font("SansSerif",Font.BOLD,20));
		b2.setFont(new Font("SansSerif",Font.BOLD,20));
		b3.setFont(new Font("SansSerif",Font.BOLD,20));
		b4.setFont(new Font("SansSerif",Font.BOLD,20));
		b5.setFont(new Font("SansSerif",Font.BOLD,20));
		b6.setFont(new Font("SansSerif",Font.BOLD,20));
		b7.setFont(new Font("SansSerif",Font.BOLD,20));
		b8.setFont(new Font("SansSerif",Font.BOLD,20));
		b9.setFont(new Font("SansSerif",Font.BOLD,20));
		b0.setFont(new Font("SansSerif",Font.BOLD,20));
		plus.setFont(new Font("SansSerif",Font.BOLD,20));
		sub.setFont(new Font("SansSerif",Font.BOLD,20));
		mul.setFont(new Font("SansSerif",Font.BOLD,20));
		div.setFont(new Font("SansSerif",Font.BOLD,20));
		decimal.setFont(new Font("SansSerif",Font.BOLD,20));
		C.setFont(new Font("SansSerif",Font.BOLD,20));
		undo.setFont(new Font("SansSerif",Font.BOLD,15));
		equal.setFont(new Font("SansSerif",Font.BOLD,20));
		
		textfield.setBounds(30, 20, 230, 40);
		enable.setBounds(30, 65, 50, 25);
		disable.setBounds(30, 85, 50, 25);
		undo.setBounds(90, 65, 50, 50);
		C.setBounds(150, 65, 50, 50);
		plus.setBounds(210, 65, 50, 50);
		b1.setBounds(30, 120, 50, 50);
		b2.setBounds(90, 120, 50, 50);
		b3.setBounds(150,120, 50, 50);
		sub.setBounds(210, 120, 50, 50);
		b4.setBounds(30, 180, 50, 50);
		b5.setBounds(90, 180, 50, 50);
		b6.setBounds(150, 180, 50, 50);
		mul.setBounds(210, 180, 50, 50);
		b7.setBounds(30, 240, 50, 50);
		b8.setBounds(90, 240, 50, 50);
		b9.setBounds(150, 240, 50, 50);
		div.setBounds(210, 240, 50, 50);
		b0.setBounds(30, 300, 50, 50);
		decimal.setBounds(90, 300, 50, 50);
		equal.setBounds(150, 300, 110, 50);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"1");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"2");
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"3");
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"4");
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"5");
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"6");
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"7");
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"8");
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText()+"9");
			}
		});
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textfield.getText());
				calculation = 1;
				textfield.setText("");
				
			}
		});
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textfield.getText());
				calculation = 1;
				textfield.setText(" ");
				label.setText(num +" +");
			}
		});
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textfield.getText());
				calculation = 2;
				textfield.setText(" ");
				label.setText(num +" -");			}
		});
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textfield.getText());
				calculation = 3;
				textfield.setText(" ");
				label.setText(num +" *");			}
		});
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textfield.getText());
				calculation = 4;
				textfield.setText(" ");
				label.setText(num +" /");			}
		});
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(" ");
			}
		});
		undo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int lenght = textfield.getText().length();
				int number = textfield.getText().length()-1;
				String store;
				
				if(lenght > 0) {
					StringBuilder back = new StringBuilder(textfield.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textfield.setText(store);
				}
			}
		});
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arthmetic_calculation();
			}
		});
		enable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				on();
			}
		});
		disable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				off();
			}
		});
		
		jframe.add(textfield);
		jframe.add(enable);
		jframe.add(disable);
		jframe.add(undo);
		jframe.add(C);
		jframe.add(b1);
		jframe.add(b2);
		jframe.add(b3);
		jframe.add(b4);
		jframe.add(b5);
		jframe.add(b6);
		jframe.add(b7);
		jframe.add(b8);
		jframe.add(b9);
		jframe.add(b0);
		jframe.add(plus);
		jframe.add(sub);
		jframe.add(mul);
		jframe.add(div);
		jframe.add(decimal);
		jframe.add(equal);
		
	}
	
	double num,ans;
	int calculation;
	
	public void arthmetic_calculation() {
		switch (calculation) {
		case 1:
			ans = num + Double.parseDouble(textfield.getText());
			textfield.setText(Double.toString(ans));
			break;
			
		case 2:
			ans = num - Double.parseDouble(textfield.getText());
			textfield.setText(Double.toString(ans));
			break;
			
		case 3:
			ans = num * Double.parseDouble(textfield.getText());
			textfield.setText(Double.toString(ans));
			break;
			
		case 4:
			ans = num / Double.parseDouble(textfield.getText());
			textfield.setText(Double.toString(ans));
			break;
			
		default:
			break;
		}
	}
	public void off() {
		textfield.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b0.setEnabled(false);
		plus.setEnabled(false);
		div.setEnabled(false);
		sub.setEnabled(false);
		mul.setEnabled(false);
		decimal.setEnabled(false);
		C.setEnabled(false);
		undo.setEnabled(false);
	}
	public void on() {
		textfield.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b0.setEnabled(true);
		plus.setEnabled(true);
		div.setEnabled(true);
		sub.setEnabled(true);
		mul.setEnabled(true);
		decimal.setEnabled(true);
		C.setEnabled(true);
		undo.setEnabled(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Calculator();
			}
		});
	}
}

