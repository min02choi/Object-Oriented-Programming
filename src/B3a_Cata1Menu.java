import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class B3a_Cata1Menu extends JPanel implements ActionListener {

    JButton trip, doub, sing, cup;
    ArrayList<JButton> type = new ArrayList<>();
    C1_OptionSelect c1;
    B5_MostBottomPanel m_b5;

    public B3a_Cata1Menu(B5_MostBottomPanel b5) {
        setLayout(null);

        m_b5 = b5;
        System.out.println("this is b3a");

        trip = new B3_0_MenuMaker("트리플", "25000원", "java_image/kiosk/triple.png");
        trip.setBounds(36, 24, 120, 192);
        type.add(trip);

        doub = new B3_0_MenuMaker("더블", "17000원", "java_image/kiosk/double.png");
        doub.setBounds(180, 24, 120, 192);
        type.add(doub);

        sing = new B3_0_MenuMaker("싱글", "9500원", "java_image/kiosk/single.png");
        sing.setBounds(324, 24, 120, 192);
        type.add(sing);

        cup = new B3_0_MenuMaker("컵", "5000원", "java_image/kiosk/cup.png");
        cup.setBounds(36, 240, 120, 192);
        type.add(cup);

        for (JButton jb : type) {
            jb.addActionListener(this);
            add(jb);
        }

        // c1 = new C1_OptionSelect("트리플", "25000", m_b5);
        // c1 = new JFrame();
        // c1.setBounds(48, 72, 384, 720);
        // c1.setVisible(false);
        // add(c1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource();
        String str = s.getText();
        System.out.println(str);

        JDialog d;

        if (s == trip) {
            //System.out.println("트리플 맞잖아");
            // c1.setVisible(true);
            // a0.sum += 25000;

            d = new C1_OptionSelect("트리플", "25000", "java_image/kiosk/triple.png", m_b5);
            d.setBounds(48, 72, 384, 720);
            d.setVisible(true);


        }
        else if (s == doub) {
            //System.out.println("더블 맞잖아");
            // c1.setVisible(true);
            // a0.sum += 17000;

            d = new C1_OptionSelect("더블", "17000", "java_image/kiosk/double.png", m_b5);
            //d.setSize(100, 100);
            d.setBounds(48, 72, 384, 720);
            d.setVisible(true);


        }
        else if (s == sing) {
            //System.out.println("싱글 맞잖아");
            // c1.setVisible(true);
            // a0.sum += 9500;

            d = new C1_OptionSelect("싱글", "9500", "java_image/kiosk/single.png", m_b5);
            //d.setSize(100, 100);
            d.setBounds(48, 72, 384, 720);
            d.setVisible(true);


        }

        else if (s == cup) {
            //System.out.println("컵 맞잖아");
            // c1.setVisible(true);
            // a0.sum += 5000;

            d = new C1_OptionSelect("컵", "5000", "java_image/kiosk/cup.png", m_b5);
            //d.setSize(100, 100);
            d.setBounds(48, 72, 384, 720);
            d.setVisible(true);


        }
    }

}
