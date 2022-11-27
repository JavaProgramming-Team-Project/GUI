package ui;

import entity.Item;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class ProductPanelGUI extends JPanel{
    Color Black = new Color(0x212121);
    public Item item;
    public JPanel MainPanel;
    public JPanel PhotoPanel;
    public JPanel PhotoPanel2;
    public JPanel ReviewPanel;
    public JPanel infPanel;
    public JPanel ReservationPanel;
    public ProductPanelGUI(List<Item> itemList,int number){
        System.out.println("호출 완료");
        System.out.println(item);
        System.out.println(number);

        item = itemList.get(number);

        Color bgColor = new Color(0xDEF4FF);

        PhotoPanel = new JPanel();
        PhotoPanel.setLayout(null);
        PhotoPanel.setBackground(bgColor);
        PhotoPanel.setBounds(10,10,400,300);

        PhotoPanel2 = new JPanel();
        PhotoPanel2.setLayout(null);
        PhotoPanel2.setBackground(bgColor);
        PhotoPanel2.setBounds(420,10,650,300);

        ReviewPanel = new JPanel();
        ReviewPanel.setLayout(null);
        ReviewPanel.setBackground(bgColor);
        ReviewPanel.setBounds(10,320,400,310);

        infPanel = new JPanel();
        infPanel.setLayout(null);
        infPanel.setBackground(Color.WHITE);
        infPanel.setBounds(420,320,650,230);
        infPanel.setBorder(new TitledBorder(new LineBorder(Color.lightGray,1)));

        ReservationPanel = new JPanel();
        ReservationPanel.setLayout(null);
        ReservationPanel.setBackground(Color.white);
        ReservationPanel.setBounds(420,560,650,68);
        ReservationPanel.setBorder(new TitledBorder(new LineBorder(Color.lightGray,2)));

        MainPanel = new JPanel();
        MainPanel.setLayout(null);
        MainPanel.setBackground(Function.SoftBlue2);

        // 라벨
        JLabel ItemNameLabel = new JLabel(item.getItemName());
        ItemNameLabel.setFont(new Font("AppleSDGothicNeoEB00",Font.PLAIN,30));
        ItemNameLabel.setFont(ItemNameLabel.getFont().deriveFont(30.0f));
        ItemNameLabel.setBounds(5,5,400,30);
        //Line1.setOpaque();
        ItemNameLabel.setForeground(Black);

        JLabel ItemBodyLabel = new JLabel(item.getItemBody());
        ItemBodyLabel.setFont(new Font("AppleSDGothicNeoM00",Font.PLAIN,20));
        ItemBodyLabel.setFont(ItemBodyLabel.getFont().deriveFont(21.0f));
        ItemBodyLabel.setBounds(5,35,400,26);
        //Line1.setOpaque();
        ItemBodyLabel.setForeground(Color.GRAY);

        // 패널 연동
        infPanel.add(ItemNameLabel);
        infPanel.add(ItemBodyLabel);

        MainPanel.add(PhotoPanel);
        MainPanel.add(PhotoPanel2);
        MainPanel.add(ReviewPanel);
        MainPanel.add(infPanel);
        MainPanel.add(ReservationPanel);
    }
}
