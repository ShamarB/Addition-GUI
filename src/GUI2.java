import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI2 implements ActionListener {
	
	private static JLabel firstNum_1;
	private static JLabel secondNum_1;
	private static JLabel firstNum_2;
	private static JLabel secondNum_2;
	private static JLabel firstNum_3;
	private static JLabel secondNum_3;
	private static JLabel operator;
	private static JLabel equals;
	private static JTextField userText_1;
	private static JTextField userText_2;
	private static JTextField userText_3;
	private static JButton button;
	private static JLabel success;
	private static JLabel x1;
	private static JLabel x2;
	private static JLabel x3;
	

	
	private static int first_1 = (int) (Math.random() * 50 + 1);
	private static int second_1 = (int) (Math.random() * 50 + 1);
	private static int first_2 = (int) (Math.random() * 50 + 1);
	private static int second_2 = (int) (Math.random() * 50 + 1);
	private static int first_3 = (int) (Math.random() * 50 + 1);
	private static int second_3 = (int) (Math.random() * 50 + 1);
	
	private static boolean ans1IsTrue;
	private static boolean ans2IsTrue;
	private static boolean ans3IsTrue;
	

	public static void main(String[] args) {
		int fNumStart = 160;
		int opStart = fNumStart + 20;
		int sNumStart = opStart + 10;
		int equalsStart = sNumStart + 20;
		int textStart = equalsStart + 10;
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);
		
		panel.setLayout(null);
		
		firstNum_1 = new JLabel(String.valueOf(first_1));
		firstNum_1.setBounds(fNumStart, 20, 80, 25);
		panel.add(firstNum_1);
		
		operator = new JLabel("+");
		operator.setBounds(opStart, 20, 80, 25);
		panel.add(operator);
		
		secondNum_1 = new JLabel(String.valueOf(second_1));
		secondNum_1.setBounds(sNumStart, 20, 80, 25);
		panel.add(secondNum_1);
		
		equals = new JLabel("=");
		equals.setBounds(equalsStart, 20, 80, 25);
		panel.add(equals);
		
		userText_1 = new JTextField();
		userText_1.setBounds(textStart, 20, 35, 25);
		panel.add(userText_1);
		////////////////////////////////////////////////////
		firstNum_2 = new JLabel(String.valueOf(first_2));
		firstNum_2.setBounds(fNumStart, 40, 80, 25);
		panel.add(firstNum_2);
		
		operator = new JLabel("+");
		operator.setBounds(opStart, 40, 80, 25);
		panel.add(operator);
		
		secondNum_2 = new JLabel(String.valueOf(second_2));
		secondNum_2.setBounds(sNumStart, 40, 80, 25);
		panel.add(secondNum_2);
		
		equals = new JLabel("=");
		equals.setBounds(equalsStart, 40, 80, 25);
		panel.add(equals);
		
		userText_2 = new JTextField();
		userText_2.setBounds(textStart, 40, 35, 25);
		panel.add(userText_2);
////////////////////////////////////////////////////
		firstNum_3 = new JLabel(String.valueOf(first_3));
		firstNum_3.setBounds(fNumStart, 60, 80, 25);
		panel.add(firstNum_3);
		
		operator = new JLabel("+");
		operator.setBounds(opStart, 60, 80, 25);
		panel.add(operator);
		
		secondNum_3 = new JLabel(String.valueOf(second_3));
		secondNum_3.setBounds(sNumStart, 60, 80, 25);
		panel.add(secondNum_3);
		
		equals = new JLabel("=");
		equals.setBounds(equalsStart, 60, 80, 25);
		panel.add(equals);
		
		userText_3 = new JTextField();
		userText_3.setBounds(textStart, 60, 35, 25);
		panel.add(userText_3);


		button = new JButton("Submit");
		button.setBounds(150, 80, 80, 25);
		button.addActionListener(new GUI2());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		//success.setText(text);
		
		x1 = new JLabel("");
		x1.setBounds(260, 20, 35, 25);
		panel.add(x1);
		
		x2 = new JLabel("");
		x2.setBounds(260, 40, 35, 25);
		panel.add(x2);
		
		x3 = new JLabel("");
		x3.setBounds(260, 60, 35, 25);
		panel.add(x3);
		
		frame.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int ans_1 = first_1 + second_1;
		String stringInput_1 = userText_1.getText();
		int input_1 = Integer.parseInt(stringInput_1);
		System.out.println(input_1);
		
		int ans_2 = first_2 + second_2;
		String stringInput_2 = userText_2.getText();
		int input_2 = Integer.parseInt(stringInput_2);
		System.out.println(input_2);
		
		int ans_3 = first_3 + second_3;
		String stringInput_3 = userText_3.getText();
		int input_3 = Integer.parseInt(stringInput_3);
		System.out.println(input_3);
		
		
		if (input_1 == ans_1) {
			ans1IsTrue = true;
		} else {
			ans1IsTrue = false;
		}
		
		if (input_2 == ans_2) {
			ans2IsTrue = true;
		} else {
			ans2IsTrue = false;
		}
		
		if (input_3 == ans_3) {
			ans3IsTrue = true;
		} else {
			ans3IsTrue = false;
		}
		
		if (ans1IsTrue == true && ans2IsTrue == true && ans3IsTrue == true) {
			success.setText("100% Great Job!");
		} else if (ans1IsTrue == true && ans2IsTrue == true && ans3IsTrue == false) {
			success.setText("66% Got some work to do champ");
			x3.setText("X");
		} else if (ans1IsTrue == true && ans2IsTrue == false && ans3IsTrue == true) {
			success.setText("66% Got some work to do champ");
			x2.setText("X");
		} else if (ans1IsTrue == false && ans2IsTrue == true && ans3IsTrue == true) {
			success.setText("66% Got some work to do champ");
			x1.setText("X");
		} else if (ans1IsTrue == true && ans2IsTrue == false && ans3IsTrue == false) {
			success.setText("33% Well...No but yes");
			x2.setText("X");
			x3.setText("X");
		} else if (ans1IsTrue == false && ans2IsTrue == true && ans3IsTrue == false) {
			success.setText("33% Well...No but yes");
			x1.setText("X");
			x3.setText("X");
		} else if (ans1IsTrue == false && ans2IsTrue == false && ans3IsTrue == true) {
			success.setText("33% Well...No but yes");
			x1.setText("X");
			x2.setText("X");
		} else if (ans1IsTrue == false && ans2IsTrue == false && ans3IsTrue == false) {
			success.setText("0% Maybe they're hiring down at the docks");
			x1.setText("X");
			x2.setText("X");
			x3.setText("X");
		}
		
//		if (user.equals("sbilli2") && password.equals("***")) {
//			success.setText("Login Successful!");
//		} else {
//			success.setText("Login Wrong!");
//		}
	}

}
