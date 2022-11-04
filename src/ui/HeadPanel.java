package ui;

import javax.swing.*;
import java.awt.*;

public class HeadPanel extends JPanel{
    private JPanel HeadPanel;
    private Color HeadColor;
    public HeadPanel(){
        JLabel jl = new JLabel("안뇨옹");
        HeadColor = new Color(0xB8E9FF);
        HeadPanel = new JPanel();
        HeadPanel.setLayout(null);
        jl.setBounds(0,0,50,50);
        HeadPanel.setBounds(0,0,1000,200);
        HeadPanel.add(jl);
        HeadPanel.setBackground(HeadColor);
    }
}
