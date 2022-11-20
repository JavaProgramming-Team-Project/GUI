package entity;

public class Item {
    private Long ItemId;
    private String Category;
    private String Name;
    private String Body;
    private String Phone;
    private String Price;
    private String[] Picture;
    private String Address;

    public Item(Long ItemId, String Category, String name, String body, String Phone, String Price, String[] Picture,
                String Address){
        this.ItemId = ItemId;
        this.Category = Category;
        this.Name = name;
        this.Body = body;
        this.Phone = Phone;
        this.Price = Price;
        this.Picture = Picture;
        this.Address = Address;
    }

    public Long getItemId() {
        return ItemId;
    }

    public void setItemId(Long itemId) {
        ItemId = itemId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPrice() {
        return Price;
    }

    public void setPicture(String[] picture) {
        Picture = picture;
    }

    public String[] getPicture() {
        return Picture;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
