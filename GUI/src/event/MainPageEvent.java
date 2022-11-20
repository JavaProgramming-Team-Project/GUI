package event;

import entity.Item;

import javax.swing.*;
import java.awt.*;

public class MainPageEvent extends JPanel{
    Item item;
    public String []CategoryList;
    public JPanel ItemPanel;
    public MainPageEvent(){
        // 색 설정
        Color HeaderColor = new Color(0x58CCFF);
        Color DeepBlue = new Color(0x18A8F1);
        Color LightGray = new Color(0xF6F6F6);
        Color SoftBlue = new Color(0xB8E9FF);

        // 데이터 가져오기
        //CategoryList = item.getCategory();

        // 패널 설정
        ItemPanel = new JPanel();
        ItemPanel.setLayout(null);
        ItemPanel.setBackground(SoftBlue);

        // 라벨 설정
        //JLabel CategoryName = new JLabel("["+CategoryList[0]+"]");
        //CategoryName.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        //CategoryName.setFont(CategoryName.getFont().deriveFont(21.0f));
        //CategoryName.setBounds(0,0,100,100);
        //CategoryName.setForeground(Color.gray);

        //JLabel ItemName = new JLabel(item.getName());
        //JLabel Body = new JLabel(item.getBody());
        //JLabel Price = new JLabel(item.getPrice());

        // 패널 추가
        //ItemPanel.add(CategoryName);
        //ItemPanel.add(ItemName);
        //ItemPanel.add(Body);
        //ItemPanel.add(Price);
    }
}
