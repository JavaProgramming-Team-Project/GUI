package ui;

import com.sun.tools.javac.Main;
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
        InputPanel.setLayout(null);
        InputPanel.setBounds(275,40,250,500);
        //InputPanel.setBorder(new TitledBorder(new LineBorder(Color.black,1)));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setBounds(10,400,230,50);
        buttonPanel.setBackground(Color.gray);

        // -------------------------라벨 구간---------------------------

        JLabel idLabel = new JLabel("아이디");
        idLabel.setBounds(10,0,100,30);
        idLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        idLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel passwordLabel = new JLabel("비밀번호");
        passwordLabel.setBounds(10,70,100,30);
        passwordLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        passwordLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel nameLabel = new JLabel("이름");
        nameLabel.setBounds(10,140,100,30);
        nameLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        nameLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel phoneLabel = new JLabel("휴대폰 번호");
        phoneLabel.setBounds(10,210,100,30);
        phoneLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        phoneLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel ageLabel = new JLabel("나이");
        ageLabel.setBounds(10,280,100,30);
        ageLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        ageLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        // ----------------------텍스트 필드 구간---------------------

        JTextField idField = new JTextField(13);
        idField.setBounds(10,30,230,30);
        idField.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));

        JTextField passwordField = new JTextField(13);
        passwordField.setBounds(10,100,230,30);
        passwordField.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));

        JTextField nameField = new JTextField(13);
        nameField.setBounds(10,170,230,30);
        nameField.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));

        JTextField phoneField = new JTextField(13);
        phoneField.setBounds(10,240,230,30);
        phoneField.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));

        JTextField ageField = new JTextField(13);
        ageField.setBounds(10,310,230,30);
        ageField.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));

        JButton signUpBtn = new JButton("가입하기");
        signUpBtn.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        signUpBtn.setFont(idLabel.getFont().deriveFont(15.0f));
        signUpBtn.setBounds(0,0,230,50);
        signUpBtn.setBackground(Color.white);


        // ------------------------패널 추가--------------------------

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
        setSize(800, 600);
        setTitle("회원가입");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new SignUpGUI();
    }
}
