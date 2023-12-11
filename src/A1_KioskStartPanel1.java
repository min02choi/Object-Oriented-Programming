import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A1_KioskStartPanel1 extends JPanel implements ActionListener {

    JButton here, togo;

    public A1_KioskStartPanel1() {

        setSize(480, 864);
        setLayout(null);

        // 이미지의 크기 조정
        ImageIcon image = new ImageIcon("./java_image/kiosk/gamarostartimage.png");
        Image n = image.getImage();
        Image changed = n.getScaledInstance(480, 864, Image.SCALE_DEFAULT);
        ImageIcon start = new ImageIcon(changed);
        JLabel imagelabel = new JLabel(start);
        imagelabel.setBounds(0, 0, 480, 864);
        add(imagelabel);

        Font font = new Font("돋움", Font.BOLD, 30);


        // here.setBounds(r); // 이미지나 텍스트
        here = new JButton("매장");
        here.setFont(font);
        here.setBounds(48, 552, 168, 192);
        here.addActionListener(this);
        add(here);

        togo = new JButton("포장");
        togo.setFont(font);
        togo.setBounds(264, 552, 168, 192);
        togo.addActionListener(this);
        add(togo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource();

        if (s == here) {
            this.setVisible(false);
        } else if (s == togo) {
            this.setVisible(false);

        }

    }

}
