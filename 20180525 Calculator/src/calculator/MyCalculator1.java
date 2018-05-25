package calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MyCalculator1 extends JFrame implements ActionListener {
	
	private JButton[] nButtons;
	private JButton buttonC;
	private JButton buttonP;
	private JButton buttonE;
	private JTextField calcTextfield;
	
	public MyCalculator1() {
		
		
		//프레임 초기화
		this.setSize(300,300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT_ON_CLOSE : static variable
		this.setTitle("My Calculator");
		
		//새로운 컴포넌트를 프레임에 추가
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		
		MyCalculatorActionListner al = new MyCalculatorActonListner();
		for(int i = 0; i < 10; i++) {
			nButtons[i] = createNewButtonObjects(Integer.toString(i));
		}
		this.buttonC = createNewButtonObjects("C");
		this.buttonP = createNewButtonObjects("+");
		this.buttonE = createNewButtonObjects("=");
		this.calcTextfield = new JTextField(10);
		this.add(calcTextfield);
		this.setVisible(true);
	}
		
		//버튼 객체 생성, 액션커맨드 지정, 액션리스너 등록
		private JButton createNewButtonObjects(String name, MyCalculatorActionListner) {
			JButton button = new JButton(name);
			button.setActionCommand(name);
			button.addActionListener(this);
			this.add(button);
			return button;
		}	
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCalculator();
	}
	
	public class MyCalculatorActionListner implements ActionListner{
		private String calculating(String text) {
			String[] tokens = text.split("\\+");
			System.out.println(tokens);
			return Integer.toString(Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]));
		}
	}
		@Override 
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
			case "0":
			calcTextfield.setText(calcTextfield.getText() + "0");
			break;
			case "1":
				calcTextfield.setText(calcTextfield.getText() + "1");
				break;		
			case "2":
				calcTextfield.setText(calcTextfield.getText() + "2");
				break;		
			case "3":
				calcTextfield.setText(calcTextfield.getText() + "3");
				break;		
			case "4":
				calcTextfield.setText(calcTextfield.getText() + "4");
				break;
			case "5":
				calcTextfield.setText(calcTextfield.getText() + "5");
				break;		
			case "6":
				calcTextfield.setText(calcTextfield.getText() + "6");
				break;
			case "7":
				calcTextfield.setText(calcTextfield.getText() + "7");
				break;
			case "8":
				calcTextfield.setText(calcTextfield.getText() + "8");
				break;
			case "9":
				calcTextfield.setText(calcTextfield.getText() + "9");
				break;
			case "C":
				calcTextfield.setText("");
				break;
			case "+":
				calcTextfield.setText(calcTextfield.getText() + "+");
				break;
			case "=":
		        String result = calculating(calcTextfield.getText());
		        calcTextfield.setText(calcTextfield.getText() + "=" + result);
				break;
			default:
					break;
				
			}

			
		
	}
}
