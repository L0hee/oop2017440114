import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
	//필드: 모든 메소드에서 접근할 수 있다.
	JButton button, btn;
	JTextField tf;
	MyFrame() {
		this.setSize(900,500); //가로 900 pixel, 세로 500 pixel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //EXIT_ON_CLOSE : static variable
		this.setTitle("lee event frame");
		
		//새로운 컴포넌트를 프레임에 추가		
		this.setLayout(new FlowLayout());//플로우 배치 매니저 사용
		
		this.button = new JButton("lee button");//버튼 객체 생성
		this.add(this.button);//버튼객체를 프레임에 추가
//		MyListner listner = new MyListner();
		this.button.setActionCommand("button1");
		button.addActionListener(this);//이벤트 리스너 객체 등록
		
		this.btn = new JButton("두 번째 버튼");
		this.add(btn);
		this.btn.setActionCommand("button2");
		btn.addActionListener(this);//이벤트 리스너 객체 등록
		
		tf = new JTextField(20);
		this.add(tf);
     	this.setVisible(true); 
	}
     	
    	@Override
    	public void actionPerformed(ActionEvent e) { //actionPerformed:이벤트 처리기
    		//액션이벤트객체에서 눌려진 버튼 객체를 (버튼객체의 레퍼런스 값) 가져온다.
//    		JButton button = (JButton) e.getSource();
    		if ((e.getActionCommand()).equals("button1"))
    			this.tf.setText("첫 번째 버튼");
    		else 
    			this.tf.setText("두 번째 버튼");
    		
    		
    		
//    		System.out.println("OMG 버튼이 눌러졌어요!!!!!");
	}

}
