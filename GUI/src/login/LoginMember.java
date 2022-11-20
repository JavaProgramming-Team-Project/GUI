package login;

import entity.Member;

public class LoginMember {

    private static Member member;

    private Long memberId;
    private String id;
    private String password;
    private String name;
    private String phone;
    private int age;

    private static LoginMember loginMember = new LoginMember();

    private LoginMember() {
        member = null;
        System.out.println("loginmember ");
    }

    public static void setLoginMember(Member member) {
        LoginMember.member = member;
    }

    public static Member getLoginMember() {
        return member;
    }
}
