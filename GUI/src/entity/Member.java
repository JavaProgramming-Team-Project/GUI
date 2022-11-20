package entity;

public class Member {
    private Long memberId;
    private String id;
    private String password;
    private String name;
    private String phone;
    private int age;

    public Member(String id, String password, String name, String phone, int age) {
        this.memberId = 0L;
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

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
