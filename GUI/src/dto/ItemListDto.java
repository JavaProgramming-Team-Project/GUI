package dto;

public class ItemListDto {
    private Long itemKey;
    private String itemName;
    private String itemAddress;
    private String itemCategory;
    private int itemPrice;
    private double avgRating;

    public ItemListDto(Long itemKey, String itemName, String itemAddress, String itemCategory, int itemPrice, double avgRating) {
        this.itemKey = itemKey;
        this.itemName = itemName;
        this.itemAddress = itemAddress;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
        this.avgRating = avgRating;
    }

    public ItemListDto() {

    }

    public Long getItemKey() {
        return itemKey;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemAddress() {
        return itemAddress;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setItemKey(Long itemKey) {
        this.itemKey = itemKey;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemAddress(String itemAddress) {
        this.itemAddress = itemAddress;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }
}
