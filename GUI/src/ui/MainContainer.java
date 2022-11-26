package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainContainer extends JFrame{
    // 클래스 세팅
    public MainPage_HeadPanel mainPageHeadPanel;
    public MainPageGUI mainPageGUI = new MainPageGUI();

    // 패널 세팅
    private JPanel MainPanel;
    private JPanel HeadPanel; // 헤드패널은 계속 고정됨,

    // 컨테이너
    public Container ct;
    public MainContainer() {
        // 색상
        Color HeaderColor = new Color(0x58CCFF);

        // 컨테이너
        ct = getContentPane();
        ct.setLayout(null);
        ct.setBackground(Color.lightGray);

        // 패널
        mainPageHeadPanel = new MainPage_HeadPanel();
        HeadPanel = mainPageHeadPanel.HeadPanel;
        HeadPanel.setLayout(null);
        HeadPanel.setBounds(0, 0, 1300, 70);
        HeadPanel.setBackground(HeaderColor);

        MainPanel = mainPageGUI.MainPanel;
        MainPanel.setBounds(0, 70, 1300, 680);

        ct.add(HeadPanel);
        ct.add(MainPanel);

        setVisible(true);
        setSize(1300, 750);
        setTitle("EVERY BOOK");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPageHeadPanel.LogoutButton.addMouseListener(new MyMouseListener());
        mainPageHeadPanel.MainLabel.addMouseListener(new MyMouseListener());
        mainPageHeadPanel.MyPageLabel.addMouseListener(new MyMouseListener());
    }

    class MyMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource() == mainPageHeadPanel.MyPageLabel){
                mainPageGUI.MainPagePanel.setVisible(false);
                mainPageGUI.MyPagePanel.setVisible(true);
            }
            else if(e.getSource() == mainPageHeadPanel.MainLabel){
                mainPageGUI.MyPagePanel.setVisible(false);
                mainPageGUI.MainPagePanel.setVisible(true);
            }
            else if(e.getSource() == mainPageHeadPanel.LogoutButton){
                dispose();
                new LoginGUI();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


    public static void main(String[] args){
        new MainContainer();
    }
}
