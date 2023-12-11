import java.awt.event.*;
import javax.swing.*;

public class B3d_Cata4Menu extends JPanel implements ActionListener {

    JButton d1, d2;
    B5_MostBottomPanel m_b5;

    public B3d_Cata4Menu(B5_MostBottomPanel b5) {
        setLayout(null);
        m_b5 = b5;

        d1 = new B3_0_MenuMaker("콜라", "1500원", "java_image/kiosk/coke.png");
        d1.setBounds(36, 24, 120, 192);
        d1.addActionListener(this);
        add(d1);

        d2 = new B3_0_MenuMaker("사이다", "1500원", "java_image/kiosk/cider.png");
        d2.setBounds(180, 24, 120, 192);
        d2.addActionListener(this);
        add(d2);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource(); // 눌린 객체를 반환
        
        m_b5.sendData(1500);

        if (s == d1) {
            m_b5.sendMenu("콜라", "1500원");
        }
        else if (s == d2) {
            m_b5.sendMenu("사이다", "1500원");
        }
    }


}
