import javax.swing.JFrame; //JFrame:클래스 이름

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("lee frame"); 
		frame.setSize(900,500); //가로 900 pixel, 세로 500 pixel
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT_ON_CLOSE : static variable
		frame.setVisible(true);
	}

}
