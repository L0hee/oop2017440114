import javax.swing.JFrame; //JFrame:Ŭ���� �̸�

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("lee frame"); 
		frame.setSize(900,500); //���� 900 pixel, ���� 500 pixel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT_ON_CLOSE : static variable
		frame.setVisible(true);
	}

}
