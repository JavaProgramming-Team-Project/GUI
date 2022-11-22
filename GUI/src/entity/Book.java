package entity;

public class Book {
    private Long bookId;

    private Long memberKey;
    private Long itemKey;
    private String bookDate; //예약 시점 일자
    private String itemDate; //상품 예약일

    public Book(Long bookId, Long memberKey, Long itemKey, String bookDate, String itemDate) {
        this.bookId = bookId;
        this.memberKey = memberKey;
        this.itemKey = itemKey;
        this.bookDate = bookDate;
        this.itemDate = itemDate;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getMemberKey() {
        return memberKey;
    }

    public void setMemberKey(Long memberKey) {
        this.memberKey = memberKey;
    }

    public Long getItemKey() {
        return itemKey;
    }

    public void setItemKey(Long itemKey) {
        this.itemKey = itemKey;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public String getItemDate() {
        return itemDate;
    }

    public void setItemDate(String itemDate) {
        this.itemDate = itemDate;
    }
}
