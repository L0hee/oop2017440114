import java.awt.FlowLayout;
import javax.swing.*; // * : Swing�� �ִ� ��� Ŭ������ import
//������ ����� �ι�° ���: JFrame���κ��� ��ӹ��� Ŭ�󽺸� �����.
public class MyFrame extends JFrame {
	MyFrame() {
	this.setSize(900,500); //���� 900 pixel, ���� 500 pixel
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT_ON_CLOSE : static variable
	this.setTitle("lee 2nd frame");
	
	//���ο� ������Ʈ�� �����ӿ� �߰�
	FlowLayout f1 = new FlowLayout();
	this.setLayout(f1);
	
//	this.setLayout(new FlowLayout());//�÷ο� ��ġ �Ŵ��� ���
	
	JLabel label = new JLabel("���ڸ� ������ �Է��ϼ���");//���̺� ��ü ����
	JTextField tf = new JTextField(30);//�ý�Ʈ�ʵ� ��ü ����
	JButton button = new JButton("lee button");//��ư ��ü ����
	
	button.setText("������");
	tf.setText("���̴�");
	
	//�г� ����
	JPanel panel = new JPanel();
	panel.add(label);
	panel.add(tf);
	
	this.add(button);//��ư ��ü�� �����ӿ� �߰�
	this.add(panel);
//	this.add(label);//���̺� ��ü�� �����ӿ� �߰�
//	this.add(tf);//�ý�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
	
//	pack();//������Ʈ���� �� ä���� ������ũ�⸦ ����

	this.setVisible(true);
    }
}
