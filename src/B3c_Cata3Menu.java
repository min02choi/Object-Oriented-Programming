import java.awt.event.*;
import javax.swing.*;

public class B3c_Cata3Menu extends JPanel implements ActionListener {

    JButton s1, s2, s3, s4, s5, s6;
    B5_MostBottomPanel m_b5;


    public B3c_Cata3Menu(B5_MostBottomPanel b5) {
        setLayout(null);

        m_b5 = b5;

        s1 = new B3_0_MenuMaker("매콤양념 소스", "700원", "java_image/kiosk/sauce1.png");
        s1.setBounds(36, 24, 120, 192);
        s1.addActionListener(this);
        add(s1);

        s2 = new B3_0_MenuMaker("BBQ 소스", "700원", "java_image/kiosk/sauce2.png");
        s2.setBounds(180, 24, 120, 192);
        s2.addActionListener(this);
        add(s2);

        s3 = new B3_0_MenuMaker("치즈갈릭 소스", "700원", "java_image/kiosk/sauce3.png");
        s3.setBounds(324, 24, 120, 192);
        s3.addActionListener(this);
        add(s3);

        s4 = new B3_0_MenuMaker("스리라차 소스", "700원", "java_image/kiosk/sauce4.png");
        s4.setBounds(36, 240, 120, 192);
        s4.addActionListener(this);
        add(s4);

        s5 = new B3_0_MenuMaker("스위트 칠리 소스", "700원", "java_image/kiosk/sauce5.png");
        s5.setBounds(180, 240, 120, 192);
        s5.addActionListener(this);
        add(s5);

        s6 = new B3_0_MenuMaker("청양마요 소스", "700원", "java_image/kiosk/sauce6.png");
        s6.setBounds(324, 240, 120, 192);
        s6.addActionListener(this);
        add(s6);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource(); // 눌린 객체를 반환

        m_b5.sendData(700);

        if (s == s1) {
            m_b5.sendMenu("매콤양념 소스", "700원");
        }
        else if (s == s2) {
            m_b5.sendMenu("BBQ 소스", "700원");
        }
        else if (s == s3) {
            m_b5.sendMenu("치즈갈릭 소스", "700원");
        }
        else if (s == s4) {
            m_b5.sendMenu("스리라차 소스", "700원");
        }
        else if (s == s5) {
            m_b5.sendMenu("스위트 칠리 소스", "700원");
        }
        else if (s == s6) {
            m_b5.sendMenu("청양마요 소스", "700원");
        }

    }
}
