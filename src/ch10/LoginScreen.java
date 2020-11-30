package ch10;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class LoginScreen extends JFrame{
	
	//Context = 컨텍스트 = 스토커 (어떤 대상에 대한 모든 정보를 아는것) // 자기의 컨텍스트를 넘기는 것이 제일 편함
	//응용프로그램은 컨텍스트로 넘김 // 일반적으로 JSON 데이터 넘김
	private LoginScreen loginScreen = this;
	private JTextField tfUsername;
	private JButton btnLogin;
	
	public LoginScreen() {
		tfUsername = new JTextField("");
		btnLogin = new JButton("로그인");
		
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		
		Container c = getContentPane();
		c.add(tfUsername, BorderLayout.CENTER);
		c.add(btnLogin, BorderLayout.SOUTH);
		
		initListener();
		
		setVisible(true);
	}
	//리스너 등록 모아두기
	private void initListener() {
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = tfUsername.getText();
				if(username.equals("ssar")) {
					new HomeScreen(loginScreen);
					loginScreen.setVisible(false); // 화면전환//this는 익명클래스이기 때문에 전역변수로 잡아줘야함
				}else {
					System.out.println("로그인 실패 : 아이디를 다시 입력하세요");
				}
			}
		});
	}
	public LoginScreen getLoginScreen() {
		return loginScreen;
	}
	public void setLoginScreen(LoginScreen loginScreen) {
		this.loginScreen = loginScreen;
	}
	public JTextField getTfUsername() {
		return tfUsername;
	}
	public void setTfUsername(JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}
	public JButton getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	
	
}
