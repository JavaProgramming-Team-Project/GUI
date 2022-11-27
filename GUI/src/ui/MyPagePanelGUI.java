package ui;

import javax.swing.*;
import java.awt.*;

public class MyPagePanelGUI extends JPanel {
    public JPanel MyPagePanel;
    private JPanel MemberInfoPanel;
    private JPanel InfoPanel;
    private JPanel SchedulePanel;

    public MyPagePanelGUI(){
        // 패널 관리
        MyPagePanel = new JPanel();
        MyPagePanel.setLayout(null);
        MyPagePanel.setBackground(Color.red);

        MemberInfoPanel = new JPanel();
        MemberInfoPanel.setLayout(null);
        MemberInfoPanel.setBounds(250,10,400,280);
        MemberInfoPanel.setBackground(Function.SoftBlue2);

        InfoPanel = new JPanel();
        InfoPanel.setLayout(null);
        InfoPanel.setBounds(660,10,380,280);
        InfoPanel.setBackground(Function.SoftBlue2);

        SchedulePanel = new JPanel();
        SchedulePanel.setLayout(null);
        SchedulePanel.setBounds(250,300,790,330);
        SchedulePanel.setBackground(Function.SoftBlue2);

        // 라벨 관리
        JLabel MemberInfo = new JLabel("회원정보");
        MemberInfo.setFont(new Font("여기어때 잘난체",Font.PLAIN, 11));
        MemberInfo.setFont(MemberInfo.getFont().deriveFont(30.0f));
        MemberInfo.setBounds(20,10,200,50);
        MemberInfo.setForeground(Color.GRAY);

        JLabel ScheduleLabel = new JLabel("예약내역");
        ScheduleLabel.setFont(new Font("여기어때 잘난체",Font.PLAIN, 11));
        ScheduleLabel.setFont(MemberInfo.getFont().deriveFont(30.0f));
        ScheduleLabel.setBounds(20,10,200,50);
        ScheduleLabel.setForeground(Color.GRAY);

        // 패널 추가 -- 화면 출력
        MemberInfoPanel.add(MemberInfo);

        SchedulePanel.add(ScheduleLabel);

        MyPagePanel.add(MemberInfoPanel);
        MyPagePanel.add(InfoPanel);
        MyPagePanel.add(SchedulePanel);
    }
}
