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
            Remove_highlights();
            cgp.itemDisplay("숙박",0);
            cgp.StayLabel.setOpaque(true);
            cgp.StayLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.LeisureLabel){
            Remove_highlights();
            cgp.itemDisplay("레저",0);
            cgp.LeisureLabel.setOpaque(true);
            cgp.LeisureLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.FestivalLabel){
            Remove_highlights();
            cgp.itemDisplay("축제",0);
            cgp.FestivalLabel.setOpaque(true);
            cgp.FestivalLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.ShowLabel){
            Remove_highlights();
            cgp.itemDisplay("공연",0);
            cgp.ShowLabel.setOpaque(true);
            cgp.ShowLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.DisplayLabel){
            Remove_highlights();
            cgp.itemDisplay("전시",0);
            cgp.DisplayLabel.setOpaque(true);
            cgp.DisplayLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.TicketLabel){
            Remove_highlights();
            cgp.itemDisplay("티켓",0);
            cgp.TicketLabel.setOpaque(true);
            cgp.TicketLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.RestaurantLabel){
            Remove_highlights();
            cgp.itemDisplay("식당",0);
            cgp.RestaurantLabel.setOpaque(true);
            cgp.RestaurantLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.BeautyLabel){
            Remove_highlights();
            cgp.itemDisplay("뷰티",0);
            cgp.BeautyLabel.setOpaque(true);
            cgp.BeautyLabel.setBackground(SoftBlue);
        }
        else if(e.getSource() == cgp.ItemPanel){
            JPanel jp = (JPanel)e.getSource();
            cgp.MainPanel.remove(cgp.ProductPanel2);
            cgp.productPanelGUI = new ProductPanelGUI(cgp.itemList, Integer.parseInt(jp.getName()));
            cgp.ProductPanel2 = cgp.productPanelGUI.MainPanel;
            cgp.ProductPanel2.setBounds(100,0,1200,680);
            cgp.ProductPanel2.setLayout(null);
            cgp.ProductPanel2.setBackground(Color.WHITE);
            cgp.MainPanel.add(cgp.ProductPanel2);
            cgp.CategoryPanel.setVisible(false);
            cgp.ProductPanel2.setVisible(true);
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
