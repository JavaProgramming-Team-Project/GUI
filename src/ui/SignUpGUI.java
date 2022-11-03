package ui;

import event.SignUpEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SignUpGUI extends JFrame {
    private JPanel MainPanel;

    public SignUpGUI() {
        MainPanel = new JPanel();
        MainPanel.setLayout(null);

        JPanel InputPanel = new JPanel();
        InputPanel.setBackground(Color.WHITE);
        InputPanel.setLayout(null);
        InputPanel.setBounds(120,30,250,400);
        InputPanel.setBorder(new TitledBorder(new LineBorder(Color.black,1)));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setBounds(10,330,230,50);
        buttonPanel.setBackground(Color.gray);

        JLabel idLabel = new JLabel("아이디");
        idLabel.setBounds(105,0,50,30);
        idLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        idLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel passwordLabel = new JLabel("비밀번호");
        passwordLabel.setBounds(100,60,100,30);
        passwordLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        passwordLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel nameLabel = new JLabel("이름");
        nameLabel.setBounds(112,120,50,30);
        nameLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        nameLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel phoneLabel = new JLabel("휴대폰 번호");
        phoneLabel.setBounds(88,180,100,30);
        phoneLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        phoneLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel ageLabel = new JLabel("나이");
        ageLabel.setBounds(112,240,100,30);
        ageLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        ageLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JTextField idField = new JTextField(13);
        idField.setBounds(10,30,230,25);
        JTextField passwordField = new JTextField(13);
        passwordField.setBounds(10,90,230,25);
        JTextField nameField = new JTextField(13);
        nameField.setBounds(10,150,230,25);
        JTextField phoneField = new JTextField(13);
        phoneField.setBounds(10,210,230,25);
        JTextField ageField = new JTextField(13);
        ageField.setBounds(10,270,230,25);

        JButton signUpBtn = new JButton("가입하기");
        signUpBtn.setBounds(0,0,230,50);
        signUpBtn.setBackground(Color.WHITE);

        buttonPanel.add(signUpBtn);

        InputPanel.add(idLabel);
        InputPanel.add(idField);

        InputPanel.add(passwordLabel);
        InputPanel.add(passwordField);

        InputPanel.add(nameLabel);
        InputPanel.add(nameField);

        InputPanel.add(phoneLabel);
        InputPanel.add(phoneField);

        InputPanel.add(ageLabel);
        InputPanel.add(ageField);

        InputPanel.add(buttonPanel);


        MainPanel.add(InputPanel);

        this.add(MainPanel);

        signUpBtn.addActionListener(new SignUpEvent(idField, passwordField, nameField,
                phoneField, ageField));

        setVisible(true);
        setSize(500, 500);
        setTitle("회원가입");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new SignUpGUI();
    }
}
