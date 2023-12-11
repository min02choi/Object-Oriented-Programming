import java.awt.event.*;
import javax.swing.*;

public class B3b_Cata2Menu extends JPanel implements ActionListener {

    JButton side1, side2, side3, side4, side5, side6;
    B5_MostBottomPanel m_b5;


    public B3b_Cata2Menu(B5_MostBottomPanel b5) {
        setLayout(null);

        m_b5 = b5;

        System.out.println("this is b3b");

        side1 = new B3_0_MenuMaker("감자튀김", "3000원", "java_image/kiosk/fries.png");
        side1.setBounds(36, 24, 120, 192);
        side1.addActionListener(this);
        add(side1);

        side2 = new B3_0_MenuMaker("치즈볼", "5000원", "java_image/kiosk/cheeseball.png");
        side2.setBounds(180, 24, 120, 192);
        side2.addActionListener(this);
        add(side2);

        side3 = new B3_0_MenuMaker("근위튀김", "9000원", "java_image/kiosk/gingko.png");
        side3.setBounds(324, 24, 120, 192);
        side3.addActionListener(this);
        add(side3);

        side4 = new B3_0_MenuMaker("달고마", "5000원", "java_image/kiosk/sweetpotato.png");
        side4.setBounds(36, 240, 120, 192);
        side4.addActionListener(this);
        add(side4);

        side5 = new B3_0_MenuMaker("떡볶이", "4500원", "java_image/kiosk/ttuckbokki.png");
        side5.setBounds(180, 240, 120, 192);
        side5.addActionListener(this);
        add(side5);

        side6 = new B3_0_MenuMaker("짜장 떡볶이", "4500원", "java_image/kiosk/ttuckbokki_black.png");
        side6.setBounds(324, 240, 120, 192);
        side6.addActionListener(this);
        add(side6);

        /*
         * cup = new B3_0_MenuMaker("컵", "5000원", "../java_image/javalogo.png");
         * cup.setBounds(324, 240, 120, 192);
         * add(cup);
         */

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource(); // 눌린 객체를 반환

        if (s == side1) {
            m_b5.sendData(3000);
            m_b5.sendMenu("감자튀김", "3000원");
        }
        else if (s == side2) {
            m_b5.sendData(5000);
            m_b5.sendMenu("치즈볼", "5000원");
        }
        else if (s == side3) {
            m_b5.sendData(9000);
            m_b5.sendMenu("근위튀김", "9000원");
        }
        else if (s == side4) {
            m_b5.sendData(5000);
            m_b5.sendMenu("달고마", "5000원");
        }
        else if (s == side5) {
            m_b5.sendData(4500);
            m_b5.sendMenu("떡볶이", "4500원");
        }
        else if (s == side6) {
            m_b5.sendData(4500);
            m_b5.sendMenu("짜장 떡볶이", "4500원");
        }

    }
}
