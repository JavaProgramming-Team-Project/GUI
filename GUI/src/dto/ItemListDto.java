package dto;

public class ItemListDto {
    private Long itemKey;
    private String itemName;
    private String itemAddress;
    private String itemCategory;
    private int itemPrice;
    private Double avgRating;

    public ItemListDto(Long itemKey, String itemName, String itemAddress, String itemCategory, int itemPrice, Double avgRating) {
        this.itemKey = itemKey;
        this.itemName = itemName;
        this.itemAddress = itemAddress;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
        this.avgRating = avgRating;
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

    public Double getAvgRating() {
        return avgRating;
    }
}
