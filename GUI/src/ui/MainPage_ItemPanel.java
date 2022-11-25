package ui;

import entity.Item;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainPage_ItemPanel {
    public JPanel ItemPanel;
    public JPanel ItemDisplay;
    public Item item;
    public MainPage_ItemPanel(List<Item> Item){
        int []list = {200,380,560,740,920};
        ItemPanel = new JPanel();
        ItemPanel.setLayout(null);

        for(int i=0; i<Item.size(); i++){
            ItemDisplay = new JPanel();
            ItemDisplay.setLayout(null);
            ItemDisplay.setBounds(list[i],20,160,180);
            ItemDisplay.setBackground(Color.GRAY);

            JLabel CategoryLabel = new JLabel(Item.get(i).getItemCategory());
            CategoryLabel.setBounds(0,0,100,100);
            CategoryLabel.setForeground(Color.white);

            ItemDisplay.add(CategoryLabel);
            ItemPanel.add(ItemDisplay);
        }
    }
}
