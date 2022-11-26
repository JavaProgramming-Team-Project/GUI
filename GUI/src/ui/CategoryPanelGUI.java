package ui;

import api.ItemApi;
import entity.Item;
import event.CategoryPageEvent;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CategoryPanelGUI{
    // 색상 지정
    Color PriceColor;
    // 상품 관련 패널
    public List<Item> itemList;
    public JPanel ItemPanel;
    // 컬러 세팅
    Color SoftBlue;
    public CategoryPageEvent categoryPageEvent;
    public ProductPanelGUI productPanelGUI;
    // 패널 세팅
    public JPanel CategoryPanel;
    public JPanel ButtonPanel;
    public JPanel ProductPanel;
    public JPanel PagePanel;
    public JPanel MainPanel;
    public JPanel ProductPanel2;

    // 라벨
    public JLabel StayLabel;
    public JLabel LeisureLabel;
    public JLabel FestivalLabel;
    public JLabel ShowLabel;
    public JLabel DisplayLabel;
    public JLabel TicketLabel;
    public JLabel RestaurantLabel;
    public JLabel BeautyLabel;

    public CategoryPanelGUI(String Category){
        PriceColor = new Color(0xFC512C);
        categoryPageEvent = new CategoryPageEvent(this);
        ProductPanel = new JPanel();

        // 상품 가져오기
        ItemDisplay(Category,0);

        // 색 코드
        Color HeaderColor = new Color(0x58CCFF);
        Color DeepBlue = new Color(0x18A8F1);
        Color LightGray = new Color(0xF6F6F6);
        SoftBlue = new Color(0xEEF9FF);

        // 패널 구문
        ProductPanel = new JPanel();
        ProductPanel.setLayout(null);
        ProductPanel.setBackground(Color.WHITE);
        ProductPanel.setBounds(100,70,1100,500);

        //productPanelGUI = new ProductPanelGUI(itemList,0);
        ProductPanel2 = new JPanel();
        ProductPanel2.setLayout(null);
        ProductPanel2.setBounds(0,0,1300,680);
        ProductPanel2.setVisible(false);

        MainPanel = new JPanel();
        MainPanel.setLayout(null);
        MainPanel.setBackground(Color.gray);
        MainPanel.setVisible(true);

        CategoryPanel = new JPanel();
        CategoryPanel.setLayout(null);
        CategoryPanel.setBackground(Color.gray);
        CategoryPanel.setVisible(true);

        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(null);
        ButtonPanel.setBackground(Color.WHITE);
        ButtonPanel.setBounds(0,0,1300,70);



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

        MainPanel.add(CategoryPanel);
        MainPanel.add(ProductPanel2);

        // 이벤트 추가 및 연동

        StayLabel.addMouseListener(categoryPageEvent);
        LeisureLabel.addMouseListener(categoryPageEvent);
        FestivalLabel.addMouseListener(categoryPageEvent);
        ShowLabel.addMouseListener(categoryPageEvent);
        DisplayLabel.addMouseListener(categoryPageEvent);
        TicketLabel.addMouseListener(categoryPageEvent);
        RestaurantLabel.addMouseListener(categoryPageEvent);
        BeautyLabel.addMouseListener(categoryPageEvent);
    }

    public void Remove_highlights(){
        StayLabel.setOpaque(false);
        BeautyLabel.setOpaque(false);
        RestaurantLabel.setOpaque(false);
        DisplayLabel.setOpaque(false);
        FestivalLabel.setOpaque(false);
        TicketLabel.setOpaque(false);
        ShowLabel.setOpaque(false);
        LeisureLabel.setOpaque(false);
    }

    public void setColor(){
        StayLabel.setBackground(SoftBlue);
        ShowLabel.setBackground(SoftBlue);
        BeautyLabel.setBackground(SoftBlue);
        RestaurantLabel.setBackground(SoftBlue);
        DisplayLabel.setBackground(SoftBlue);
        FestivalLabel.setBackground(SoftBlue);
        TicketLabel.setBackground(SoftBlue);
        LeisureLabel.setBackground(SoftBlue);
    }

    public void ItemDisplay(String Category,int page){
        JLabel Line1 = new JLabel(); // [카테고리] + 이름
        Line1.setFont(new Font("나눔스퀘어_ac ExtraBold",Font.PLAIN,20));
        Line1.setFont(Line1.getFont().deriveFont(21.0f));
        Line1.setBounds(150,0,400,26);
        //Line1.setOpaque();
        Line1.setForeground(Color.GRAY);

        JLabel Line2 = new JLabel(); // 상품 설명
        Line2.setFont(new Font("나눔스퀘어",Font.PLAIN,20));
        Line2.setFont(Line2.getFont().deriveFont(18.0f));
        Line2.setBounds(150,26,400,26);
        //Line2.setOpaque(false);
        Line2.setForeground(Color.GRAY);

        JLabel PriceLabel = new JLabel(); // 상품 가격
        PriceLabel.setFont(new Font("여기어때 잘난체",Font.BOLD,25));
        PriceLabel.setFont(PriceLabel.getFont().deriveFont(21.0f));
        PriceLabel.setBounds(150,92,385,30);
        //PriceLabel.setOpaque(true);
        PriceLabel.setForeground(PriceColor);
        PriceLabel.setHorizontalAlignment(JLabel.RIGHT);

        int[] xLocation = new int[]{0,560,0,560,0,560,0,560};
        int[] yLocation = new int[]{0,0,130,130,260,260,390,390};
        itemList = new ArrayList<>();


        try{
            ProductPanel.removeAll();

            itemList = ItemApi.itemListByCategory(Category);
            System.out.println(itemList.size());
            for(int i=page; i<itemList.size(); i++) {
                ItemPanel = new JPanel();
                ItemPanel.setName(String.valueOf(i));
                ItemPanel.setLayout(null);
                ItemPanel.setBounds(xLocation[i], yLocation[i], 540, 120);
                ItemPanel.setBackground(SoftBlue);

                Line1.setText("[" + itemList.get(i).getItemCategory() + "] " + itemList.get(i).getItemName());
                Line2.setText(itemList.get(i).getItemBody());
                PriceLabel.setText(itemList.get(i).getItemPrice() + "원");

                categoryPageEvent.setCategory(Category);
                ItemPanel.addMouseListener(categoryPageEvent);

                ItemPanel.add(Line1);
                ItemPanel.add(Line2);
                ItemPanel.add(PriceLabel);
                ProductPanel.add(ItemPanel);
            }
            ProductPanel.repaint();
        }catch (Exception e){
            System.out.println("오류 발생 : " + e.getMessage());
        }
    }

    public void Convenience(){
        Remove_highlights();
    }
}
