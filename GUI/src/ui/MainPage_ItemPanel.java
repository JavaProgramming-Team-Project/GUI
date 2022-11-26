package ui;

import entity.Item;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainPage_ItemPanel {
    public JPanel ItemPanel;
    public JPanel ItemDisplay;
    public Item item;
    public List<Item> itemList;
    public MainPage_ItemPanel(){
        itemList = new ArrayList<>();
        // 임시 구문 추후 삭제 바람
        Item item = new Item(216L,"name","Body",
                1000,"충청남도","식당","01034295935","이미지 주소");
        Item item2 = new Item(216L,"2name","2Body",
                1000,"2충청남도","2식당","201034295935","2이미지 주소");
        Item item3 = new Item(216L,"3name","3Body",
                1000,"3충청남도","3식당","301034295935","3이미지 주소");
        Item item4 = new Item(216L,"4name","4Body",
                1000,"4충청남도","4식당","401034295935","4이미지 주소");
        Item item5 = new Item(216L,"5name","5Body",
                1000,"5충청남도","5식당","501034295935","5이미지 주소");
        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        //
        //itemList = ItemApi.findItemByName("양식");
        int []list = {200,380,560,740,920};
        ItemPanel = new JPanel();
        ItemPanel.setLayout(null);

        for(int i = 0; i< itemList.size(); i++){
            ItemDisplay = new JPanel();
            ItemDisplay.setLayout(null);
            ItemDisplay.setBounds(list[i],20,160,180);
            ItemDisplay.setBackground(Color.GRAY);

            JLabel CategoryLabel = new JLabel(itemList.get(i).getItemCategory());
            CategoryLabel.setBounds(0,0,100,100);
            CategoryLabel.setForeground(Color.white);

            ItemDisplay.add(CategoryLabel);
            ItemPanel.add(ItemDisplay);
        }
    }
}
