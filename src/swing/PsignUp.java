package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;

public class PsignUp extends JFrame{
	
	private JLabel title;
	private JLabel info;
	
	private JLabel pidL;
	private JTextField id;
	private JButton cOverLap;
	private JLabel ppwdL;
	private JPasswordField pwd;
	private JLabel checkPwdL;
	private	JPasswordField checkPwd;
	private JLabel checkPwdO;
	private JLabel checkPwdX;
	private JLabel checkPwdX2;
	private JLabel pnameL;
	private JTextField name;
	private JLabel pmailL;
	private JLabel mail_info;
	private JTextField e_mail;
	private JLabel pphone;
	private JTextField phone;
	
	

	
	
	public static void main(String[] args) {
		
		 new PsignUp();
	}

	public PsignUp() {
		
		setTitle("Java First Calendar");
		setSize(534, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		checkPwdO = new JLabel("패스워드가 일치합니다.");
		checkPwdO.setBounds(368, 257, 138, 50);
		checkPwdX = new JLabel("패스워드가 일치하지");
		checkPwdX2 = new JLabel("않습니다.");
		checkPwdX.setBounds(371, 245, 123, 50);
		checkPwdX2.setBounds(398, 279, 67, 34);
		phone = new JTextField(50);
		phone.setBounds(126, 509, 226, 34);
		getContentPane().add(phone);
		info = new JLabel("회원 정보 입력 (* 표시는 필수입력)");
		info.setBounds(41, 95, 226, 50);
		getContentPane().add(info);
		//getContentPane().add(checkPwdO);
		getContentPane().add(checkPwdX);
		getContentPane().add(checkPwdX2);
	
		
		title = new JLabel("개인 회원 가입");
		title.setBounds(158, 10, 226, 88);
		getContentPane().add(title);
		title.setFont(new Font("HY강B", Font.PLAIN, 32));
		pidL = new JLabel("* ID 입력 : ");
		pidL.setBounds(12, 144, 67, 50);
		getContentPane().add(pidL);
		id = new JTextField();
		id.setBounds(126, 147, 226, 34);
		getContentPane().add(id);
		cOverLap = new JButton(" 중복 확인");
		cOverLap.setBounds(381, 144, 98, 41);
		getContentPane().add(cOverLap);
		ppwdL = new JLabel("* 패스워드 입력 : ");
		ppwdL.setBounds(12, 202, 98, 50);
		getContentPane().add(ppwdL);
		pwd = new JPasswordField(25);
		pwd.setBounds(126, 212,  226, 34);
		getContentPane().add(pwd);
		checkPwdL = new JLabel("* 패스워드 확인 : ");
		checkPwdL.setBounds(12, 259, 98, 50);
		getContentPane().add(checkPwdL);
		checkPwd = new JPasswordField(25);
		checkPwd.setBounds(126, 266, 226, 34);
		getContentPane().add(checkPwd);
		
		pnameL = new JLabel("* 이름 입력 : ");
		pnameL.setBounds(12, 319, 75, 50);
		getContentPane().add(pnameL);
		name = new JTextField(25);
		name.setBounds(126, 328, 226, 34);
		getContentPane().add(name);
		pmailL = new JLabel("* e-mail 입력 : ");
		pmailL.setBounds(12, 379, 98, 50);
		getContentPane().add(pmailL);
		mail_info = new JLabel("e-mail은 회원의 정보를 찾을 때 이용됩니다.");
		mail_info.setBounds(29, 413, 255, 34);
		getContentPane().add(mail_info);
		e_mail = new JTextField(50);
		e_mail.setBounds(126, 447, 226, 34);
		getContentPane().add(e_mail);
		pphone = new JLabel("연락처 입력 : ");
		pphone.setBounds(22, 501, 98, 50);
		getContentPane().add(pphone);
		
		
		setVisible(true);
		
	}



}
