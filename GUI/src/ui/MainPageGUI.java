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
    private JPanel StayPanel;
    private JPanel leisurePanel;
    private JPanel FestivalPanel;
    private JPanel ShowPanel;
    private JPanel DisplayPanel;
    private JPanel TicketPanel;
    private JPanel RestaurantPanel;
    private JPanel BeautyPanel;
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

        ImageIcon AccommodationIcon = new ImageIcon("src/Icon//숙소.png");
        AccommodationIcon = imageSetSize(AccommodationIcon,100,100);

        ImageIcon leisureIcon = new ImageIcon("src/Icon//레저.png");
        leisureIcon = imageSetSize(leisureIcon,100,100);

        ImageIcon FestivalIcon = new ImageIcon("src/Icon//축제.png");
        FestivalIcon = imageSetSize(FestivalIcon,100,100);

        ImageIcon ShowIcon = new ImageIcon("src/Icon//공연.png");
        ShowIcon = imageSetSize(ShowIcon,100,100);

        ImageIcon DisplayIcon = new ImageIcon("src/Icon//전시.png");
        DisplayIcon = imageSetSize(DisplayIcon,100,100);

        ImageIcon TicketIcon = new ImageIcon("src/Icon//티켓.png");
        TicketIcon = imageSetSize(TicketIcon,100,100);

        ImageIcon RestaurantIcon = new ImageIcon("src/Icon//식당.png");
        RestaurantIcon = imageSetSize(RestaurantIcon,100,100);

        ImageIcon BeautyIcon = new ImageIcon("src/Icon//뷰티.png");
        BeautyIcon = imageSetSize(BeautyIcon,100,100);

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

        StayPanel= new JPanel();
        StayPanel.setLayout(null);
        StayPanel.setBounds(200,10,100,120);
        StayPanel.setBackground(Color.white);

        leisurePanel= new JPanel();
        leisurePanel.setLayout(null);
        leisurePanel.setBounds(310,10,100,120);
        leisurePanel.setBackground(Color.white);

        FestivalPanel = new JPanel();
        FestivalPanel.setLayout(null);
        FestivalPanel.setBounds(420,10,100,120);
        FestivalPanel.setBackground(Color.white);

        ShowPanel = new JPanel();
        ShowPanel.setLayout(null);
        ShowPanel.setBounds(530,10,100,120);
        ShowPanel.setBackground(Color.white);

        DisplayPanel = new JPanel();
        DisplayPanel.setLayout(null);
        DisplayPanel.setBounds(640,10,100,120);
        DisplayPanel.setBackground(Color.white);

        TicketPanel = new JPanel();
        TicketPanel.setLayout(null);
        TicketPanel.setBounds(750,10,100,120);
        TicketPanel.setBackground(Color.white);

        RestaurantPanel = new JPanel();
        RestaurantPanel.setLayout(null);
        RestaurantPanel.setBounds(860,10,100,120);
        RestaurantPanel.setBackground(Color.white);

        BeautyPanel = new JPanel();
        BeautyPanel.setLayout(null);
        BeautyPanel.setBounds(970,10,100,120);
        BeautyPanel.setBackground(Color.white);

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

        JLabel Accommodation = new JLabel(AccommodationIcon);
        Accommodation.setBounds(0,-5,100,100);

        JLabel StayLabel = new JLabel("숙소");
        StayLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        StayLabel.setFont(StayLabel.getFont().deriveFont(21.0f));
        StayLabel.setBounds(29,80,50,50);
        StayLabel.setForeground(Color.gray);

        JLabel leisureIconLabel = new JLabel(leisureIcon);
        leisureIconLabel.setBounds(0,-5,100,100);

        JLabel leisureLabel = new JLabel("레저");
        leisureLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        leisureLabel.setFont(leisureLabel.getFont().deriveFont(21.0f));
        leisureLabel.setBounds(29,80,50,50);
        leisureLabel.setForeground(Color.gray);

        JLabel FestivalIconLabel = new JLabel(FestivalIcon);
        FestivalIconLabel.setBounds(0,-5,100,100);

        JLabel FestivalLabel = new JLabel("축제");
        FestivalLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        FestivalLabel.setFont(FestivalLabel.getFont().deriveFont(21.0f));
        FestivalLabel.setBounds(29,80,50,50);
        FestivalLabel.setForeground(Color.gray);

        JLabel ShowIconLabel = new JLabel(ShowIcon);
        ShowIconLabel.setBounds(0,-5,100,100);

        JLabel ShowLabel = new JLabel("공연");
        ShowLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        ShowLabel.setFont(FestivalLabel.getFont().deriveFont(21.0f));
        ShowLabel.setBounds(29,80,50,50);
        ShowLabel.setForeground(Color.gray);

        JLabel DisplayIconLabel = new JLabel(DisplayIcon);
        DisplayIconLabel.setBounds(0,-5,100,100);

        JLabel DisplayLabel = new JLabel("전시");
        DisplayLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        DisplayLabel.setFont(DisplayLabel.getFont().deriveFont(21.0f));
        DisplayLabel.setBounds(29,80,50,50);
        DisplayLabel.setForeground(Color.gray);

        JLabel TicketIconLabel = new JLabel(TicketIcon);
        TicketIconLabel.setBounds(0,-5,100,100);

        JLabel TicketLabel = new JLabel("티켓");
        TicketLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        TicketLabel.setFont(TicketLabel.getFont().deriveFont(21.0f));
        TicketLabel.setBounds(29,80,50,50);
        TicketLabel.setForeground(Color.gray);

        JLabel RestaurantIconLabel = new JLabel(RestaurantIcon);
        RestaurantIconLabel.setBounds(0,-5,100,100);

        JLabel RestaurantLabel = new JLabel("티켓");
        RestaurantLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        RestaurantLabel.setFont(RestaurantLabel.getFont().deriveFont(21.0f));
        RestaurantLabel.setBounds(29,80,50,50);
        RestaurantLabel.setForeground(Color.gray);

        JLabel BeautyIconLabel = new JLabel(BeautyIcon);
        BeautyIconLabel.setBounds(0,-5,100,100);

        JLabel BeautyLabel = new JLabel("티켓");
        BeautyLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        BeautyLabel.setFont(BeautyLabel.getFont().deriveFont(21.0f));
        BeautyLabel.setBounds(29,80,50,50);
        BeautyLabel.setForeground(Color.gray);

        // 패널 추가
        HeadPanel.add(TitleNameLabel);
        HeadPanel.add(MagnifierLabel);
        HeadPanel.add(SearchLabel);
        HeadPanel.add(UserName);
        HeadPanel.add(MainLabel);
        HeadPanel.add(LogOutButton);

        StayPanel.add(Accommodation);
        StayPanel.add(StayLabel);

        leisurePanel.add(leisureIconLabel);
        leisurePanel.add(leisureLabel);

        FestivalPanel.add(FestivalIconLabel);
        FestivalPanel.add(FestivalLabel);

        ShowPanel.add(ShowIconLabel);
        ShowPanel.add(ShowLabel);

        DisplayPanel.add(DisplayIconLabel);
        DisplayPanel.add(DisplayLabel);

        TicketPanel.add(TicketIconLabel);
        TicketPanel.add(TicketLabel);

        RestaurantPanel.add(RestaurantIconLabel);
        RestaurantPanel.add(RestaurantLabel);

        BeautyPanel.add(BeautyIconLabel);
        BeautyPanel.add(BeautyLabel);

        CategoryIconPanel.add(StayPanel);
        CategoryIconPanel.add(leisurePanel);
        CategoryIconPanel.add(FestivalPanel);
        CategoryIconPanel.add(ShowPanel);
        CategoryIconPanel.add(DisplayPanel);
        CategoryIconPanel.add(TicketPanel);
        CategoryIconPanel.add(RestaurantPanel);
        CategoryIconPanel.add(BeautyPanel);

        BannerPanel.add(Banner);

        MainPagePanel.add(CategoryIconPanel);
        MainPagePanel.add(BannerPanel);
        MainPagePanel.add(recommendPanel);

        ct.add(HeadPanel);
        ct.add(MainPagePanel);
        //ct.add(MyPagePanel);

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
