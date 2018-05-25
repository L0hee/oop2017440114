import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	//필드
	int a, b, result;
	String function, input = "";
	boolean finish = false;
	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonp, buttone, buttonc;
	JTextField tf;
	JPanel p1,p2,p3;
	
	
	Calculator() {
		this.setSize(300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		//새로운 컴퍼넌트를 프레임에 추가
		this.setLayout(new FlowLayout());
		
		tf = new JTextField(15);
		this.add(tf);
		
		this.button0 = new JButton("0");
		this.add(button0);
		this.button0.setActionCommand("0");
		button0.addActionListener(this);
		
		this.button1 = new JButton("1");
		this.add(button1);
		this.button1.setActionCommand("1");
		button1.addActionListener(this);
		
		this.button2 = new JButton("2");
		this.add(button2);
		this.button2.setActionCommand("2");
		button2.addActionListener(this);
		
		this.button3 = new JButton("3");
		this.add(button3);
		this.button3.setActionCommand("3");
		button3.addActionListener(this);
		
		this.button4 = new JButton("4");
		this.add(button4);
		this.button4.setActionCommand("4");
		button4.addActionListener(this);
		
		this.button5 = new JButton("5");
		this.add(button5);
		this.button5.setActionCommand("5");
		button5.addActionListener(this);
		
		this.button6 = new JButton("6");
		this.add(button6);
		this.button6.setActionCommand("6");
		button6.addActionListener(this);
		
		this.button7 = new JButton("7");
		this.add(button7);
		this.button7.setActionCommand("7");
		button7.addActionListener(this);
		
		this.button8 = new JButton("8");
		this.add(button8);
		this.button8.setActionCommand("8");
		button8.addActionListener(this);
		
		this.button9 = new JButton("9");
		this.add(button9);
		this.button9.setActionCommand("9");
		button9.addActionListener(this);
		
		this.buttonp = new JButton("+");
		this.add(buttonp);
		this.buttonp.setActionCommand("+");
		buttonp.addActionListener(this);
		
		this.buttonc = new JButton("C");
		this.add(buttonc);
		this.buttonc.setActionCommand("C");
		buttonc.addActionListener(this);
		
		this.buttone = new JButton("=");
		this.add(buttone);
		this.buttone.setActionCommand("=");
		buttone.addActionListener(this);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
		p2.add(button6);
		p2.add(button7);
		p2.add(button8);
		p2.add(button9);
		p2.add(button0);
		p3.add(buttonp);
		p3.add(buttonc);
		p3.add(buttone);
		
		add("North",p1);
		add("Center",p2);
		add("South",p3);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		
		if(input.equals("+")) {
    	a = b;
		function = "+";
		this.input = "";
		}
		
		else if (input.equals("C")) {
    	this.input = "";
    	a = 0;
    	b = 0;
    	tf.setText("");
    	}
		
		else if (input.equals("=")) {
			if(function.equals("+")) {
    		result = a + b;
    		tf.setText(String.valueOf(result));
    		finish = true;
    		}
			}
		
		else {
			if(finish) {
				tf.setText("0");
				finish = false;
				a = 0;
				b = 0;
				this.input = "";
				}
			
			this.input = e.getActionCommand();
			tf.setText(this.input);
			b = Integer.parseInt(this.input);
		}
	}

}
    
    			
	    


		
	


