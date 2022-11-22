package entity;

public class Member {
    private Long memberId;
    private String id;
    private String password;
    private String name;
    private String phone;
    private int age;

    public Member(Long memberId, String id, String password, String name, String phone, int age) {
        this.memberId = memberId;
        this.id = id;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
