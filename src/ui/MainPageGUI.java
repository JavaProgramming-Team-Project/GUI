package ui;

import javax.swing.*;
import java.awt.*;

import static ui.Function.imageSetSize;

public class MainPageGUI extends JFrame{
    public MyPagePanelGUI myPagePanelGUI = new MyPagePanelGUI();
    private JPanel MyPagePanel;
    private JPanel MainPagePanel;
    private JPanel HeadPanel; // 헤드패널은 계속 고정됨,
    private JPanel CategoryIconPanel; // 메인화면 카테고리 패널
    private JPanel BannerPanel; // 가운데 이벤트 패널..?
    private JPanel recommendPanel; // 상품추천 패널
    private Container ct;
    public MainPageGUI(){
        // 색상
        Color HeaderColor = new Color(0x58CCFF);
        Color DeepBlue = new Color(0x18A8F1);
        Color LightGray = new Color(0xF6F6F6);
        Color SoftBlue = new Color(0xB8E9FF);

        // 아이콘
        ImageIcon MagnifierIcon = new ImageIcon("src/Icon//돋보기.png");
        MagnifierIcon = imageSetSize(MagnifierIcon,40,40);

        ImageIcon BannerIcon = new ImageIcon("src/Icon//배너.png");
        BannerIcon = imageSetSize(BannerIcon,1300,310);

        // 패널
        ct = getContentPane();
        ct.setLayout(null);
        ct.setBackground(LightGray);

        HeadPanel = new JPanel();
        HeadPanel.setLayout(null);
        HeadPanel.setBounds(0,0,1300,70);
        HeadPanel.setBackground(HeaderColor);

        CategoryIconPanel = new JPanel();
        CategoryIconPanel.setLayout(null);
        CategoryIconPanel.setBounds(0,0,1300,135);
        CategoryIconPanel.setBackground(Color.WHITE);

        BannerPanel = new JPanel();
        BannerPanel.setLayout(null);
        BannerPanel.setBounds(0,135,1300,300);
        BannerPanel.setBackground(Color.LIGHT_GRAY);

        recommendPanel = new JPanel();
        recommendPanel.setLayout(null);
        recommendPanel.setBounds(0,435,1300,245);
        recommendPanel.setBackground(Color.WHITE);

        MainPagePanel = new JPanel();
        MainPagePanel.setLayout(null);
        MainPagePanel.setBounds(0,70,1300,680);
        MainPagePanel.setBackground(Color.white);

        MyPagePanel = myPagePanelGUI.MyPagePanel;
        MyPagePanel.setLayout(null);
        MyPagePanel.setBounds(0,70,1300,680);
        MyPagePanel.setBackground(Color.white);

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

        JLabel UserName = new JLabel("마이페이지");
        UserName.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        UserName.setFont(UserName.getFont().deriveFont(21.0f));
        UserName.setBounds(980,11,200,50);
        UserName.setForeground(Color.WHITE);

        JLabel MainLabel = new JLabel("메인");
        MainLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        MainLabel.setFont(MainLabel.getFont().deriveFont(21.0f));
        MainLabel.setBounds(920,11,100,50);
        MainLabel.setForeground(Color.WHITE);

        JLabel LogOutButton = new JLabel("로그아웃");
        LogOutButton.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        LogOutButton.setFont(LogOutButton.getFont().deriveFont(21.0f));
        LogOutButton.setBounds(1100,11,200,50);
        LogOutButton.setForeground(Color.WHITE);

        JLabel Banner = new JLabel(BannerIcon);
        Banner.setBounds(-10,0,1300,310);

        // 패널 추가
        HeadPanel.add(TitleNameLabel);
        HeadPanel.add(MagnifierLabel);
        HeadPanel.add(SearchLabel);
        HeadPanel.add(UserName);
        HeadPanel.add(MainLabel);
        HeadPanel.add(LogOutButton);

        BannerPanel.add(Banner);

        MainPagePanel.add(CategoryIconPanel);
        MainPagePanel.add(BannerPanel);
        MainPagePanel.add(recommendPanel);

        ct.add(HeadPanel);
        //ct.add(MainPagePanel);
        ct.add(MyPagePanel);

        setVisible(true);
        setSize(1300,750);
        setTitle("EVERY BOOK");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new MainPageGUI();
    }
}
