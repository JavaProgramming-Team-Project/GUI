package ui;

import javax.swing.*;
import java.awt.*;

public class CategoryPanelGUI {
    public CategoryPanelGUI categoryPanelGUI;
    // 패널 세팅
    public JPanel CategoryPanel;
    public JPanel ButtonPanel;
    public JPanel ProductPanel;
    public JPanel PagePanel;

    // 라벨
    public JLabel StayLabel;
    public JLabel LeisureLabel;
    public JLabel FestivalLabel;
    public JLabel ShowLabel;
    public JLabel DisplayLabel;
    public JLabel TicketLabel;
    public JLabel RestaurantLabel;
    public JLabel BeautyLabel;

    public CategoryPanelGUI(){
        // 색 코드
        Color HeaderColor = new Color(0x58CCFF);
        Color DeepBlue = new Color(0x18A8F1);
        Color LightGray = new Color(0xF6F6F6);
        Color SoftBlue = new Color(0xB8E9FF);

        // 패널 구문
        CategoryPanel = new JPanel();
        CategoryPanel.setLayout(null);
        CategoryPanel.setBackground(Color.gray);

        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(null);
        ButtonPanel.setBackground(Color.WHITE);
        ButtonPanel.setBounds(0,0,1300,70);

        ProductPanel = new JPanel();
        ProductPanel.setLayout(null);
        ProductPanel.setBackground(Color.GRAY);
        ProductPanel.setBounds(100,70,1100,500);

        PagePanel = new JPanel();
        PagePanel.setLayout(null);
        PagePanel.setBackground(Color.CYAN);
        PagePanel.setBounds(100,570,1100,70);


        // 라벨 구문
        StayLabel = new JLabel("숙소");
        StayLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        StayLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        StayLabel.setBounds(180,11,100,35);
        StayLabel.setForeground(Color.GRAY);
        StayLabel.setHorizontalAlignment(JLabel.CENTER);
        StayLabel.setBackground(SoftBlue);

        LeisureLabel = new JLabel("레저");
        LeisureLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        LeisureLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        LeisureLabel.setBounds(300,11,100,35);
        LeisureLabel.setForeground(Color.GRAY);
        LeisureLabel.setHorizontalAlignment(JLabel.CENTER);
        LeisureLabel.setBackground(SoftBlue);

        FestivalLabel = new JLabel("축제");
        FestivalLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        FestivalLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        FestivalLabel.setBounds(420,11,100,35);
        FestivalLabel.setForeground(Color.GRAY);
        FestivalLabel.setHorizontalAlignment(JLabel.CENTER);
        FestivalLabel.setBackground(SoftBlue);

        ShowLabel = new JLabel("공연");
        ShowLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        ShowLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        ShowLabel.setBounds(540,11,100,35);
        ShowLabel.setForeground(Color.GRAY);
        ShowLabel.setHorizontalAlignment(JLabel.CENTER);
        ShowLabel.setBackground(SoftBlue);

        DisplayLabel = new JLabel("전시");
        DisplayLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        DisplayLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        DisplayLabel.setBounds(660,11,100,35);
        DisplayLabel.setForeground(Color.GRAY);
        DisplayLabel.setHorizontalAlignment(JLabel.CENTER);
        DisplayLabel.setBackground(SoftBlue);

        TicketLabel = new JLabel("티켓");
        TicketLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        TicketLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        TicketLabel.setBounds(780,11,100,35);
        TicketLabel.setForeground(Color.GRAY);
        TicketLabel.setHorizontalAlignment(JLabel.CENTER);
        TicketLabel.setBackground(SoftBlue);

        RestaurantLabel = new JLabel("식당");
        RestaurantLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        RestaurantLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        RestaurantLabel.setBounds(900,11,100,35);
        RestaurantLabel.setForeground(Color.GRAY);
        RestaurantLabel.setHorizontalAlignment(JLabel.CENTER);
        RestaurantLabel.setBackground(SoftBlue);

        BeautyLabel = new JLabel("뷰티");
        BeautyLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        BeautyLabel.setFont(StayLabel.getFont().deriveFont(28.0f));
        BeautyLabel.setBounds(1020,11,100,35);
        BeautyLabel.setForeground(Color.GRAY);
        BeautyLabel.setHorizontalAlignment(JLabel.CENTER);
        BeautyLabel.setBackground(SoftBlue);


        // 패널 연동
        ButtonPanel.add(StayLabel);
        ButtonPanel.add(LeisureLabel);
        ButtonPanel.add(FestivalLabel);
        ButtonPanel.add(ShowLabel);
        ButtonPanel.add(DisplayLabel);
        ButtonPanel.add(TicketLabel);
        ButtonPanel.add(RestaurantLabel);
        ButtonPanel.add(BeautyLabel);

        // 패널 추가
        CategoryPanel.add(ButtonPanel);
        CategoryPanel.add(ProductPanel);
        CategoryPanel.add(PagePanel);
    }

    public void setPanel(CategoryPanelGUI categoryPanelGUI){
        this.categoryPanelGUI = categoryPanelGUI;
    }


}
