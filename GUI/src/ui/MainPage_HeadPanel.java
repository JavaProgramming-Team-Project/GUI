package ui; // 사용하지 않을 예정

import javax.swing.*;
import java.awt.*;

import static ui.Function.imageSetSize;

public class MainPage_HeadPanel extends JPanel {
    public JLabel MyPageLabel;
    public JLabel MainLabel;
    public JLabel LogoutButton;
    public JPanel HeadPanel;
    public MainPage_HeadPanel(){
        HeadPanel = new JPanel();
        HeadPanel.setLayout(null);
        HeadPanel.setBounds(0,0,1300,70);
        // 아이콘
        ImageIcon MagnifierIcon = new ImageIcon("src/Icon//돋보기.png");
        MagnifierIcon = imageSetSize(MagnifierIcon,40,40);

        // 라벨
        JLabel TitleNameLabel = new JLabel("EveryBook");
        TitleNameLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        TitleNameLabel.setFont(TitleNameLabel.getFont().deriveFont(38.0f));
        TitleNameLabel.setBounds(80,8,200,50);
        TitleNameLabel.setForeground(Color.WHITE);

        JLabel MagnifierLabel = new JLabel(MagnifierIcon);
        MagnifierLabel.setBounds(820,-13,50,100);

        JLabel SearchLabel = new JLabel("검색");
        SearchLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        SearchLabel.setFont(SearchLabel.getFont().deriveFont(21.0f));
        SearchLabel.setBounds(860,11,100,50);
        SearchLabel.setForeground(Color.WHITE);

        MyPageLabel = new JLabel("마이페이지");
        MyPageLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        MyPageLabel.setFont(MyPageLabel.getFont().deriveFont(21.0f));
        MyPageLabel.setBounds(980,11,105,50);
        MyPageLabel.setForeground(Color.WHITE);

        MainLabel = new JLabel("메인");
        MainLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        MainLabel.setFont(MainLabel.getFont().deriveFont(21.0f));
        MainLabel.setBounds(920,11,50,50);
        MainLabel.setForeground(Color.WHITE);

        LogoutButton = new JLabel("로그아웃");
        LogoutButton.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        LogoutButton.setFont(LogoutButton.getFont().deriveFont(21.0f));
        LogoutButton.setBounds(1100,11,200,50);
        LogoutButton.setForeground(Color.WHITE);

        HeadPanel.add(TitleNameLabel);
        HeadPanel.add(MagnifierLabel);
        HeadPanel.add(SearchLabel);
        HeadPanel.add(MyPageLabel);
        HeadPanel.add(MainLabel);
        HeadPanel.add(LogoutButton);

        setVisible(true);
    }
}
