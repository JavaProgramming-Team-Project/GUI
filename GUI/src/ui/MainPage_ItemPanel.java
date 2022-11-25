package ui;

import entity.Item;

import javax.swing.*;
import java.awt.*;

public class MainPage_ItemPanel {
    public JPanel ItemPanel;
    public JPanel ItemDisplay;
    public Item item;
    public MainPage_ItemPanel(Item item){
        int []list = {200,380,560,740,920};
        ItemPanel = new JPanel();
        ItemPanel.setLayout(null);

        for(int i=0; i<1; i++){
            ItemDisplay = new JPanel();
            ItemDisplay.setLayout(null);
            ItemDisplay.setBounds(list[i],20,160,180);
            ItemDisplay.setBackground(Color.GRAY);

            JLabel CategoryLabel = new JLabel(item.getItemCategory());
            CategoryLabel.setBounds(0,0,100,100);
            CategoryLabel.setForeground(Color.white);

            ItemDisplay.add(CategoryLabel);
            ItemPanel.add(ItemDisplay);
        }
    }
}
