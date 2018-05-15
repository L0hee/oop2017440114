import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
	//�ʵ�: ��� �޼ҵ忡�� ������ �� �ִ�.
	JButton button, btn;
	JTextField tf;
	MyFrame() {
		this.setSize(900,500); //���� 900 pixel, ���� 500 pixel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT_ON_CLOSE : static variable
		this.setTitle("lee event frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰�		
		this.setLayout(new FlowLayout());//�÷ο� ��ġ �Ŵ��� ���
		
		this.button = new JButton("lee button");//��ư ��ü ����
		this.add(this.button);//��ư��ü�� �����ӿ� �߰�
//		MyListner listner = new MyListner();
		this.button.setActionCommand("button1");
		button.addActionListener(this);//�̺�Ʈ ������ ��ü ���
		
		this.btn = new JButton("�� ��° ��ư");
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);//�̺�Ʈ ������ ��ü ���
		
		tf = new JTextField(20);
		this.add(tf);
     	this.setVisible(true); 
	}
     	
    	@Override
    	public void actionPerformed(ActionEvent e) { //actionPerformed:�̺�Ʈ ó����
    		//�׼��̺�Ʈ��ü���� ������ ��ư ��ü�� (��ư��ü�� ���۷��� ��) �����´�.
//    		JButton button = (JButton) e.getSource();
    		if ((e.getActionCommand()).equals("button1"))
    			this.tf.setText("ù ��° ��ư");
    		else 
    			this.tf.setText("�� ��° ��ư");
    		
    		
    		
//    		System.out.println("OMG ��ư�� ���������!!!!!");
	}

}
