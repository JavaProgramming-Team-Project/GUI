package ui;

import javax.swing.*;
import java.awt.*;

public class MainPage_ItemPanel {
    public JPanel ItemPanel;
    public JPanel ItemDisplay;
    public MainPage_ItemPanel(){
        int []list = {200,380,560,740,920};
        ItemPanel = new JPanel();
        ItemPanel.setLayout(null);

        for(int i=0; i<5; i++){
            ItemDisplay = new JPanel();
            ItemDisplay.setLayout(null);
            ItemDisplay.setBounds(list[i],20,160,180);
            ItemDisplay.setBackground(Color.GRAY);

            ItemPanel.add(ItemDisplay);
        }
    }
}
