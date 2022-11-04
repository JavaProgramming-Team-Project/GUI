package ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class LoginGUI extends JFrame implements ActionListener {
    private JPanel MainPanel;
    private JPanel InputPanel;
    private JPanel ButtonPanel;
    private Container ct;
    private Function function;
    public LoginGUI(){
        ct = getContentPane();
        // 색 지정 코드
        Color LoginBtnColor = new Color(0x18A8F1);
        Color backgroundColor = new Color(0xF6F6F6);
        Color LoginBtnBorderColor = new Color(0xB8E9FF);

        // ------------------------------------- 패널 관련 코드 ------------------------------------
        MainPanel = new JPanel();
        MainPanel.setLayout(null);
        MainPanel.setBackground(backgroundColor);

        InputPanel = new JPanel();
        InputPanel.setLayout(null);
        InputPanel.setBackground(backgroundColor);
        InputPanel.setBounds(200,80,400,300);
        InputPanel.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1)));

        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(null);
        ButtonPanel.setBackground(backgroundColor);
        ButtonPanel.setBounds(10,200,380,80);

        // ------------------------------------- 라벨 관련 코드 ------------------------------------
        JLabel idLabel = new JLabel("아이디");
        //idLabel.setBounds(40,60,900,100);
        idLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        idLabel.setFont(idLabel.getFont().deriveFont(17.0f));

        JLabel passwordLabel = new JLabel("비밀번호");
        //passwordLabel.setBounds(30,90,100,100);
        passwordLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        passwordLabel.setFont(idLabel.getFont().deriveFont(17.0f));

        JTextField idField = new JTextField(15);
        idField.setUI(new Function.HintTextFieldUI("아이디", true));
        idField.setBounds(50,66,300,45);
        idField.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1)));

        JTextField passwordField = new JTextField(15);
        passwordField.setUI(new Function.HintTextFieldUI("비밀번호",true));
        passwordField.setBounds(50,110,300,45);
        passwordField.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1)));

        JButton loginBtn = new JButton("로그인");
        loginBtn.setBounds(40,0,300,50);
        loginBtn.setBackground(LoginBtnColor);
        loginBtn.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        loginBtn.setFont(idLabel.getFont().deriveFont(15.0f));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setBorder(new TitledBorder(new LineBorder(LoginBtnBorderColor,1)));

        JLabel Sign_in_Label = new JLabel("회원가입");
        Sign_in_Label.setBounds(290,10,100,100);
        Sign_in_Label.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        Sign_in_Label.setFont(idLabel.getFont().deriveFont(12.0f));
        Sign_in_Label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel la =(JLabel)e.getSource();
                if(la.getText().equals("회원가입")){
                    dispose();
                    new SignUpGUI();
                }
            }
        });

        ButtonPanel.add(loginBtn);
        ButtonPanel.add(Sign_in_Label);
        InputPanel.add(idField);
        InputPanel.add(idLabel);
        InputPanel.add(passwordLabel);
        InputPanel.add(passwordField);
        InputPanel.add(ButtonPanel);
        MainPanel.add(InputPanel);
        ct.add(MainPanel);

        loginBtn.addActionListener(this);

        setVisible(true);
        setSize(800,600);
        setTitle("로그인");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case "로그인":
            {
                new MainPageGUI();
                dispose();
            }
        }
    }

    public static void main(String[] args){
        new LoginGUI();
    }
}
