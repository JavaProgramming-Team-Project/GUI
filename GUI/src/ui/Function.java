package ui;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;

public class Function extends JFrame{
    // 이미지 아이콘 크기 변환 메소드
    static ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
        Image ximg = icon.getImage();  //ImageIcon을 Image로 변환.
        Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }

    // HInt 출력 메소드
    static class HintTextFieldUI extends BasicTextFieldUI implements FocusListener {
        private String hint;
        private boolean hideOnFocus;
        private Color color;
        public Color getColor() {
            return color;
        }
        public void setColor(Color color) {
            this.color = color;
            repaint();
        }
        private void repaint() {
            if(getComponent() != null) {
                getComponent().repaint();
            }
        }
        public boolean isHideOnFocus() {
            return hideOnFocus;
        }
        public void setHideOnFocus(boolean hideOnFocus) {
            this.hideOnFocus = hideOnFocus;
            repaint();
        }
        public String getHint() {
            return hint;
        }
        public void setHint(String hint) {
            this.hint = hint;
            repaint();
        }
        public HintTextFieldUI(String hint) {
            this(hint,false);
        }
        public HintTextFieldUI(String hint, boolean hideOnFocus) {
            this(hint,hideOnFocus, null);
        }
        public HintTextFieldUI(String hint, boolean hideOnFocus, Color color) {
            this.hint = hint;
            this.hideOnFocus = hideOnFocus;
            this.color = color;
        }
        @Override
        protected void paintSafely(Graphics g) {
            super.paintSafely(g);
            JTextComponent comp = getComponent();
            if(hint!=null && comp.getText().length() == 0 && (!(hideOnFocus && comp.hasFocus()))){
                if(color != null) {
                    g.setColor(color);
                } else {
                    g.setColor(comp.getForeground().brighter().brighter().brighter());
                }
                int padding = (comp.getHeight() - comp.getFont().getSize())/2;
                g.drawString(hint, 2, comp.getHeight()-padding-1);
            }
        }
        @Override
        public void focusGained(FocusEvent e) {
            if(hideOnFocus) repaint();
        }
        @Override
        public void focusLost(FocusEvent e) {
            if(hideOnFocus) repaint();
        }
        @Override
        protected void installListeners() {
            super.installListeners();
            getComponent().addFocusListener(this);
        }
        @Override
        protected void uninstallListeners() {
            super.uninstallListeners();
            getComponent().removeFocusListener(this);
        }
    }
}