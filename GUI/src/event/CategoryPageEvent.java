package event;

import api.ItemApi;
import entity.Item;
import ui.CategoryPanelGUI;
import ui.ProductPanelGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class CategoryPageEvent extends JPanel implements MouseListener {
    public List<Item> item;
    public CategoryPanelGUI cgp;
    public String Category;
    public CategoryPageEvent(CategoryPanelGUI c){
        cgp = c;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Color SoftBlue = new Color(0xB8E9FF);;
        if(e.getSource() == cgp.StayLabel){
            System.out.println("haha");
            Remove_highlights();
            cgp.ItemDisplay("숙박",0);
            cgp.StayLabel.setOpaque(true);
            cgp.StayLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.LeisureLabel){
            Remove_highlights();
            cgp.ItemDisplay("레저",0);
            cgp.LeisureLabel.setOpaque(true);
            cgp.LeisureLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.FestivalLabel){
            Remove_highlights();
            cgp.ItemDisplay("축제",0);
            cgp.FestivalLabel.setOpaque(true);
            cgp.FestivalLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.FestivalLabel){
            Remove_highlights();
            cgp.ItemDisplay("공연",0);
            cgp.ShowLabel.setOpaque(true);
            cgp.ShowLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.DisplayLabel){
            Remove_highlights();
            cgp.ItemDisplay("전시",0);
            cgp.DisplayLabel.setOpaque(true);
            cgp.DisplayLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.TicketLabel){
            Remove_highlights();
            cgp.ItemDisplay("티켓",0);
            cgp.TicketLabel.setOpaque(true);
            cgp.TicketLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.RestaurantLabel){
            Remove_highlights();
            cgp.ItemDisplay("식당",0);
            cgp.RestaurantLabel.setOpaque(true);
            cgp.RestaurantLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.BeautyLabel){
            Remove_highlights();
            cgp.ItemDisplay("뷰티",0);
            cgp.BeautyLabel.setOpaque(true);
            cgp.BeautyLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.ItemPanel){
            JPanel jp = (JPanel)e.getSource();
            cgp.productPanelGUI = new ProductPanelGUI(cgp.itemList, Integer.parseInt(jp.getName()));
            cgp.ProductPanel2 = cgp.productPanelGUI.MainPanel;
            cgp.ProductPanel2.setVisible(true);
            cgp.CategoryPanel.setVisible(false);
        }

        /*
        switch (name){
            case "숙소": {
                Remove_highlights();
                cgp.ItemDisplay("숙박",0);
                cgp.StayLabel.setOpaque(true);
                cgp.StayLabel.setBackground(SoftBlue);
                break;
            }
            case "레저": {
                Remove_highlights();
                cgp.ItemDisplay("레저",0);
                cgp.LeisureLabel.setOpaque(true);
                cgp.LeisureLabel.setBackground(SoftBlue);
                break;
            }
            case "축제": {
                Remove_highlights();
                cgp.ItemDisplay("축제",0);
                cgp.FestivalLabel.setOpaque(true);
                cgp.FestivalLabel.setBackground(SoftBlue);
                break;
            }
            case "공연":{
                Remove_highlights();
                cgp.ItemDisplay("공연",0);
                cgp.ShowLabel.setOpaque(true);
                cgp.ShowLabel.setBackground(SoftBlue);
                break;
            }
            case "전시":{
                Remove_highlights();
                cgp.ItemDisplay("전시",0);
                cgp.DisplayLabel.setOpaque(true);
                cgp.DisplayLabel.setBackground(SoftBlue);
                break;
            }
            case "티켓" : {
                Remove_highlights();
                cgp.ItemDisplay("티켓",0);
                cgp.TicketLabel.setOpaque(true);
                cgp.TicketLabel.setBackground(SoftBlue);
                break;
            }
            case "식당" : {
                Remove_highlights();
                cgp.ItemDisplay("식당",0);
                cgp.RestaurantLabel.setOpaque(true);
                cgp.RestaurantLabel.setBackground(SoftBlue);
                break;
            }
            case "뷰티" : {
                Remove_highlights();
                cgp.ItemDisplay("뷰티",0);
                cgp.BeautyLabel.setOpaque(true);
                cgp.BeautyLabel.setBackground(SoftBlue);
                break;
            }
        }

         */
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

    public void setCategory(String Category){
        this.Category = Category;
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
