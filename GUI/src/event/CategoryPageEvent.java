package event;

import ui.CategoryPanelGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CategoryPageEvent extends JPanel implements MouseListener {
    public CategoryPanelGUI cgp;
    public CategoryPageEvent(){
    }

    public void setPanel(CategoryPanelGUI c){
        cgp = c;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Color SoftBlue = new Color(0xB8E9FF);;
        JLabel la =(JLabel)e.getSource();
        String name = la.getText();
        switch (name){
            case "숙소": {
                Remove_highlights();
                cgp.StayLabel.setOpaque(true);
                cgp.StayLabel.setBackground(SoftBlue);
                break;
            }
            case "레저": {
                Remove_highlights();
                cgp.LeisureLabel.setOpaque(true);
                cgp.LeisureLabel.setBackground(SoftBlue);
                break;
            }
            case "축제": {
                Remove_highlights();
                cgp.FestivalLabel.setOpaque(true);
                cgp.FestivalLabel.setBackground(SoftBlue);
                break;
            }
            case "공연":{
                Remove_highlights();
                cgp.ShowLabel.setOpaque(true);
                cgp.ShowLabel.setBackground(SoftBlue);
                break;
            }
            case "전시":{
                Remove_highlights();
                cgp.DisplayLabel.setOpaque(true);
                cgp.DisplayLabel.setBackground(SoftBlue);
                break;
            }
            case "티켓" : {
                Remove_highlights();
                cgp.TicketLabel.setOpaque(true);
                cgp.TicketLabel.setBackground(SoftBlue);
                break;
            }
            case "식당" : {
                Remove_highlights();
                cgp.RestaurantLabel.setOpaque(true);
                cgp.RestaurantLabel.setBackground(SoftBlue);
                break;
            }
            case "뷰티" : {
                Remove_highlights();
                cgp.BeautyLabel.setOpaque(true);
                cgp.BeautyLabel.setBackground(SoftBlue);
                break;
            }
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

    public void getInformation(){

    }

    public void Remove_highlights(){
        cgp.StayLabel.setBackground(Color.WHITE);
        cgp.BeautyLabel.setBackground(Color.WHITE);
        cgp.RestaurantLabel.setBackground(Color.WHITE);
        cgp.DisplayLabel.setBackground(Color.WHITE);
        cgp.FestivalLabel.setBackground(Color.WHITE);
        cgp.TicketLabel.setBackground(Color.WHITE);
        cgp.ShowLabel.setBackground(Color.WHITE);
        cgp.LeisureLabel.setBackground(Color.WHITE);
    }
}
