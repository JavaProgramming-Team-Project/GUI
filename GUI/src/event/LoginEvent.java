package event;

import api.MemberApi;
import dto.LoginDto;
import entity.Member;
import ui.LoginGUI;
import ui.MainContainer;
import ui.MainPageGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEvent extends JFrame implements ActionListener {
    Member member;
    JTextField idField;
    JTextField passwordField;
    LoginGUI jframe;
    JLabel Guide;
    boolean EventCheck = true;
    public LoginEvent(JTextField id, JTextField password,LoginGUI jframe){
        idField = id;
        passwordField = password;
        this.jframe = jframe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("로그인".equals(e.getActionCommand())) {
            if (idField.getText().isBlank() || passwordField.getText().isBlank()){
                if(EventCheck){
                    Guide = new JLabel("모든 항목을 입력하세요");
                    jframe.EventMessage(Guide, jframe.InputPanel, 130,130,200,100);
                    EventCheck = false;
                }
                else{
                }

            }
            else {
                Member member;
                LoginDto loginDto = new LoginDto(idField.getText(),passwordField.getText());
                MemberApi.login(loginDto);
                jframe.dispose();
                new MainContainer();
            }
        }
    }
}
