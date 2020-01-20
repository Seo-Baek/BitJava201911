package swing;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{

	JLabel title;
	
	JLabel logid;
	JTextField id;
	JLabel logpwd;
	JTextField pwd;
	
	JButton in;
	JButton up;
	JLabel ask;
	JButton find;
	
	public static void main(String[] args) {
		
		new Login();
	}
	
	public Login() {
		setTitle("Java First Calendar");
		setSize(600, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(-10, -10, 600, 700);
		layeredPane.setLayout(null);
		title = new JLabel("Java First Calendar");
		title.setFont(new Font("Serif", Font.ITALIC, 45));
		title.setBounds(120,65,400,200);
		
		logid = new JLabel("ID : ");
		id = new JTextField(15);
		logpwd = new JLabel("Password : ");
		pwd = new JPasswordField(15);
		logid.setBounds(167, 280, 70, 50);
		id.setBounds(257, 280, 200, 35);
		logpwd.setBounds(167, 350, 70, 50);
		pwd.setBounds(257, 350, 200, 35);
		
		in = new JButton("로그인");
		in.setBounds(170, 430, 100, 50);
		
		up = new JButton("회원가입");
		up.setBounds(340, 430, 100, 50);
		
		ask = new JLabel("잊어버리셨나요?");
		ask.setBounds(250, 500, 250, 50);
		
		find = new JButton("회원 찾기");
		find.setBounds(200, 550, 200, 40);
		
		layeredPane.add(title);
		layeredPane.add(logid);
		layeredPane.add(id);
		layeredPane.add(logpwd);
		layeredPane.add(pwd);
		layeredPane.add(in);
		layeredPane.add(up);
		layeredPane.add(ask);
		layeredPane.add(find);
		
		add(layeredPane);
		
		JPanel back = null;
		  try {
		   back = new JPanelWithBackground("D:/java-study/eclipse-workspace/practice04/src/swing/green.jpg");
		  } catch (IOException e1) {
		   e1.printStackTrace();
		  }
		  add(back);
		  back.setBounds(0, 0, 600, 800);

		  setVisible(true);
		
	}

}



