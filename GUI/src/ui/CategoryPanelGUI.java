package ui;

import javax.swing.*;
import java.awt.*;

public class CategoryPanelGUI {
    public JPanel CategoryPanel;
    public JPanel ButtonPanel;
    public JPanel ProductPanel;

    public CategoryPanelGUI(){

        // 패널 구문
        CategoryPanel = new JPanel();
        CategoryPanel.setLayout(null);
        CategoryPanel.setBackground(Color.gray);

        ButtonPanel = new JPanel();
        ButtonPanel.setLayout(null);
        ButtonPanel.setBackground(Color.green);
        ButtonPanel.setBounds(0,0,1300,70);

        ProductPanel = new JPanel();
        ProductPanel.setLayout(null);
        ProductPanel.setBackground(Color.YELLOW);
        ProductPanel.setBounds(100,70,1100,500);


        // 라벨 구문
        JLabel StayLabel = new JLabel("숙소");
        StayLabel.setFont(new Font("맑은 고딕",Font.BOLD, 11));
        StayLabel.setFont(StayLabel.getFont().deriveFont(21.0f));
        StayLabel.setBounds(200,0,100,50);
        StayLabel.setForeground(Color.WHITE);

        // 패널 연동
        ButtonPanel.add(StayLabel);

        // 패널 추가
        CategoryPanel.add(ButtonPanel);
        CategoryPanel.add(ProductPanel);
    }
}
