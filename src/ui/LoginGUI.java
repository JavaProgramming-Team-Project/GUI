package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginGUI extends JFrame implements ActionListener {
    private JPanel panel;
    public LoginGUI(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        JLabel idLabel = new JLabel("아이디");
        idLabel.setBounds(100,100,100,100);
        JLabel passwordLabel = new JLabel("비밀번호");
        passwordLabel.setBounds(100,125,100,100);

        JTextField idField = new JTextField(15);
        idField.setBounds(150,135,250,30);

        JTextField passwordField = new JTextField(15);
        passwordField.setBounds(150,163,250,30);

        JButton loginBtn = new JButton("로그인");
        loginBtn.setBounds(100,200,300,50);
        loginBtn.setBackground(Color.WHITE);

        JLabel Sign_in_Label = new JLabel("회원가입");
        Sign_in_Label.setBounds(350,240,300,50);
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

        panel.add(loginBtn);
        panel.add(Sign_in_Label);
        panel.add(idField);
        panel.add(idLabel);
        panel.add(passwordLabel);
        panel.add(passwordField);
        this.add(panel);

        loginBtn.addActionListener(this);

        setVisible(true);
        setSize(500,500);
        setTitle("로그인");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case "로그인":
            {
                System.out.println("로그인");
            }
        }
    }

    public static void main(String[] args){
        new LoginGUI();
    }
}
