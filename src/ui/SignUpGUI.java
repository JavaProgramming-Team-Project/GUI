package ui;

import event.SignUpEvent;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static ui.Function.imageSetSize;

public class SignUpGUI extends JFrame {
    private JPanel MainPanel;
    private Function function;

    public SignUpGUI() {
        // ----------------------------- 색상 지정 -------------------------------
        Color SignUpBtnColor = new Color(0x18A8F1);
        Color backgroundColor = new Color(0xF6F6F6);
        Color SignUpBtnBorderColor = new Color(0xB8E9FF);
        MainPanel = new JPanel();
        MainPanel.setLayout(null);
        MainPanel.setBackground(backgroundColor);

        // ----------------------------- 아이콘 추가 -----------------------------

        ImageIcon backIcon = new ImageIcon("C://Users//Jroyal//Desktop//자바 프로젝트//GUI//src//Icon//뒤로가기.png");
        backIcon = imageSetSize(backIcon,25,25);

        // ----------------------------- 패널 지정 -------------------------------
        JPanel InputPanel = new JPanel();
        InputPanel.setLayout(null);
        InputPanel.setBounds(300,10,400,750);
        InputPanel.setBackground(backgroundColor);
        //InputPanel.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setBounds(10,600,380,80);
        buttonPanel.setBackground(backgroundColor);

        JPanel LabelPanel = new JPanel();
        LabelPanel.setLayout(null);
        LabelPanel.setBounds(10,20,380,120);
        LabelPanel.setBackground(backgroundColor);
        //LabelPanel.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1)));

        // ----------------------------- 라벨 구간 -------------------------------

        JLabel BackLabel = new JLabel();
        BackLabel.setIcon(backIcon);
        BackLabel.setBounds(50,0,100,100);

        JLabel GuideTitle = new JLabel("계정 정보");
        GuideTitle.setBounds(-10,40,400,30);
        GuideTitle.setHorizontalAlignment(JLabel.CENTER);
        GuideTitle.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        GuideTitle.setFont(GuideTitle.getFont().deriveFont(25.0f));
        //GuideTitle.setOpaque(true);
        //GuideTitle.setBackground(SignUpBtnColor);

        JLabel GuideSub = new JLabel("<html><body style='text-align:center;'>EveryBook에 오신 걸 " +
                "환영합니다.<br />계정 정보를 입력해 주세요.</body></html>", JLabel.CENTER);
        GuideSub.setBounds(90,50,200,100);
        GuideSub.setHorizontalAlignment(JLabel.CENTER);
        GuideSub.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        GuideSub.setFont(GuideTitle.getFont().deriveFont(12.0f));
        GuideSub.setForeground(Color.GRAY);

        JLabel idLabel = new JLabel("아이디");
        idLabel.setBounds(50,180,100,30);
        idLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        idLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel passwordLabel = new JLabel("비밀번호");
        passwordLabel.setBounds(50,260,100,30);
        passwordLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        passwordLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel nameLabel = new JLabel("이름");
        nameLabel.setBounds(50,340,100,30);
        nameLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        nameLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel phoneLabel = new JLabel("휴대폰 번호");
        phoneLabel.setBounds(50,420,100,30);
        phoneLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        phoneLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        JLabel ageLabel = new JLabel("나이");
        ageLabel.setBounds(50,500,100,30);
        ageLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        ageLabel.setFont(idLabel.getFont().deriveFont(15.0f));

        // ----------------------------- 텍스트 필드 지정 -------------------------------

        JTextField idField = new JTextField(13);
        idField.setBounds(50,210,300,35);
        idField.setBorder(new TitledBorder(new LineBorder(SignUpBtnBorderColor,1)));

        JTextField passwordField = new JTextField(13);
        passwordField.setBounds(50,290,300,35);
        passwordField.setBorder(new TitledBorder(new LineBorder(SignUpBtnBorderColor,1)));

        JTextField nameField = new JTextField(13);
        nameField.setBounds(50,370,300,35);
        nameField.setBorder(new TitledBorder(new LineBorder(SignUpBtnBorderColor,1)));

        JTextField phoneField = new JTextField(13);
        phoneField.setBounds(50,450,300,35);
        phoneField.setBorder(new TitledBorder(new LineBorder(SignUpBtnBorderColor,1)));

        JTextField ageField = new JTextField(13);
        ageField.setBounds(50,530,300,35);
        ageField.setBorder(new TitledBorder(new LineBorder(SignUpBtnBorderColor,1)));

        JButton signUpBtn = new JButton("가입하기");
        signUpBtn.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        signUpBtn.setFont(idLabel.getFont().deriveFont(15.0f));
        signUpBtn.setBounds(0,30,380,50);
        signUpBtn.setForeground(Color.WHITE);
        signUpBtn.setBackground(SignUpBtnColor);
        signUpBtn.setBorder(new TitledBorder(new LineBorder(SignUpBtnBorderColor,1)));

        // ----------------------------- 패널 추가 -------------------------------

        buttonPanel.add(signUpBtn);

        LabelPanel.add(GuideTitle);
        LabelPanel.add(GuideSub);

        InputPanel.add(LabelPanel);

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

        MainPanel.add(BackLabel);
        MainPanel.add(InputPanel);

        this.add(MainPanel);

        // ----------------------------- 이벤트 연동 -------------------------------

        signUpBtn.addActionListener(new SignUpEvent(idField, passwordField, nameField,
                phoneField, ageField));

        BackLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int jl = e.getID();
                if(jl == 500){
                    new LoginGUI();
                    dispose();
                }
            }
        });

        // ----------------------------- 기본 설정 -------------------------------

        setVisible(true);
        setSize(1000, 900);
        setTitle("회원가입");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new SignUpGUI();
    }
}
