package entity;

public class Item {
    private Long itemId;

    private String itemName;
    private String itemBody;
    private int itemPrice;
    private String itemAddress;
    private String itemCategory;
    private String itemPhone;
    private String itemImage;

    public Item(String itemName, String itemBody, int itemPrice
            , String itemAddress, String itemCategory, String itemPhone, String itemImage) {
        this.itemId = 0L;
        this.itemName = itemName;
        this.itemBody = itemBody;
        this.itemPrice = itemPrice;
        this.itemAddress = itemAddress;
        this.itemCategory = itemCategory;
        this.itemPhone = itemPhone;
        this.itemImage = itemImage;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemBody() {
        return itemBody;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getItemAddress() {
        return itemAddress;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public String getItemPhone() {
        return itemPhone;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemBody(String itemBody) {
        this.itemBody = itemBody;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemAddress(String itemAddress) {
        this.itemAddress = itemAddress;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setItemPhone(String itemPhone) {
        this.itemPhone = itemPhone;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }
}