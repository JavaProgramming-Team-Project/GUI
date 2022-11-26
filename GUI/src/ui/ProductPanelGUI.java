package ui;

import entity.Item;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class ProductPanelGUI extends JPanel{
    public List<Item> item;
    public JPanel MainPanel;
    public JPanel PhotoPanel;
    public JPanel PhotoPanel2;
    public JPanel ReviewPanel;
    public JPanel infPanel;
    public JPanel ReservationPanel;
    private JScrollPane scrollPane;
    public Container ct;
    public ProductPanelGUI(List<Item> item,int number){
        System.out.println("호출 완료");
        Color bgColor = new Color(0xDEF4FF);
        ct.setLayout(null);
        ct.setBackground(Color.lightGray);

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
        infPanel.setBackground(bgColor);
        infPanel.setBounds(420,320,650,230);

        ReservationPanel = new JPanel();
        ReservationPanel.setLayout(null);
        ReservationPanel.setBackground(Color.white);
        ReservationPanel.setBounds(420,560,650,68);
        ReservationPanel.setBorder(new TitledBorder(new LineBorder(Color.lightGray,2)));

        MainPanel = new JPanel();
        MainPanel.setLayout(null);
        MainPanel.setBounds(100,70,1080,630);
        MainPanel.setBackground(Function.SoftBlue2);

        MainPanel.add(PhotoPanel);
        MainPanel.add(PhotoPanel2);
        MainPanel.add(ReviewPanel);
        MainPanel.add(infPanel);
        MainPanel.add(ReservationPanel);
    }
}
