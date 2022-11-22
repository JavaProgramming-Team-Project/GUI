package entity;

public class Review {
    private Long reviewId;

    private Long memberId;
    private Long itemId;
    private int reviewStar;
    private String reviewBody;
    private String reviewDate;

    public Review(Long reviewId, Long memberId, Long itemId, int reviewStar, String reviewBody, String reviewDate) {
        this.reviewId = reviewId;
        this.memberId = memberId;
        this.itemId = itemId;
        this.reviewStar = reviewStar;
        this.reviewBody = reviewBody;
        this.reviewDate = reviewDate;
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public int getReviewStar() {
        return reviewStar;
    }

    public void setReviewStar(int reviewStar) {
        this.reviewStar = reviewStar;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }
}
