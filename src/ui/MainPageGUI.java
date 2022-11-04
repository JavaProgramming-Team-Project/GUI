package ui;

import javax.swing.*;
import java.awt.*;

public class MainPageGUI extends JFrame{
    private JPanel MainPanel;
    private HeadPanel headPanel;
    private Container ct;
    public MainPageGUI(){
        ct = getContentPane();

        MainPanel = new JPanel();
        MainPanel.setLayout(null);

        headPanel = new HeadPanel();
        headPanel.setBounds(0,0,1000,100);

        MainPanel.add(headPanel);

        JLabel jl = new JLabel("안녕안녕");
        jl.setBounds(100,100,100,100);

        MainPanel.add(jl);

        ct.add(MainPanel);

        setVisible(true);
        setSize(1000,700);
        setTitle("EVERY BOOK");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        new MainPageGUI();
    }
}
