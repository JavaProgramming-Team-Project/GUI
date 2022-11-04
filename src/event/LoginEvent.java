package event;

import entity.Member;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEvent implements ActionListener {
    Member member;
    JTextField idField;
    JTextField passwordField;
    public LoginEvent(JTextField id, JTextField password){
        idField = id;
        passwordField = password;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
