import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 원래 JPanel
public class C1_OptionSelect extends JDialog implements ActionListener {

    JButton t1, t2, t3, t4, t5, t6; // 맛 추가하세요
    JButton cancle, ok;
    JLabel menu, price, bar;
    B5_MostBottomPanel m_b5;

    // 매개변수 : 메뉴 이름, 가격, 사진 << 일단 보류
    public C1_OptionSelect(String menu_name, String menu_price, String image, B5_MostBottomPanel b5) {
        System.out.println("C1_Option");

        setLayout(null);

        m_b5 = b5;

        // 선택한 메뉴 사진
        ImageIcon img = new ImageIcon(image);
        Image n = img.getImage();
        Image changed = n.getScaledInstance(168, 168, Image.SCALE_DEFAULT);
        ImageIcon menu_image = new ImageIcon(changed);
        JLabel imgpanel = new JLabel(menu_image);
        imgpanel.setBounds(0, 0, 168, 168);
        add(imgpanel);


        // 선택한 메뉴 레이블
        menu = new JLabel(menu_name);
        Font font = new Font("돋움", Font.BOLD, 30);
        menu.setFont(font);
        menu.setHorizontalAlignment(JLabel.LEFT);
        menu.setBounds(192, 24, 168, 48);

        // 선택한 메뉴 가격
        price = new JLabel(menu_price);
        Font font1 = new Font("돋움", Font.BOLD, 15);
        price.setFont(font1);
        price.setHorizontalAlignment(JLabel.RIGHT);
        price.setBounds(192, 96, 168, 48);

        // 구분선
        // 텍스트가 길어서 아마 들어온 메뉴에 대해 if문으로 
        bar = new JLabel();
        if (menu_name.equals("트리플")) {
            bar.setText("세 가지 맛을 선택해주세요.");
        } else if (menu_name.equals("더블")) {
            System.out.println("더블이라고 이것아");
            
            bar.setText("두 가지 맛을 선택해주세요.");
            // bar.updateUI();
        } else if (menu_name.equals("싱글")) {
            bar.setText("한 가지 맛을 선택해주세요.");
        } else if (menu_name.equals("컵")) {
            bar.setText("한 가지 맛을 선택해주세요.");
        }

        Font font2 = new Font("돋움", Font.BOLD, 15);
        bar.setFont(font2);
        bar.setHorizontalAlignment(JLabel.LEFT);
        bar.setOpaque(true);
        bar.setBackground(Color.lightGray);
        bar.setBounds(0, 168, 384, 48);

        // 각 옵션 메뉴
        t1 = new C1_0_OptionMenuMaker1("달콤", "java_image/kiosk/sweet.png");
        t1.setBounds(24, 240, 96, 120);
        add(t1);

        t2 = new C1_0_OptionMenuMaker1("매콤", "java_image/kiosk/spicy.png");
        t2.setBounds(144, 240, 96, 120);
        add(t2);

        t3 = new C1_0_OptionMenuMaker1("마늘간장", "java_image/kiosk/garlic.png");
        t3.setBounds(264, 240, 96, 120);
        add(t3);

        t4 = new C1_0_OptionMenuMaker1("사천깐풍기", "java_image/kiosk/kkan.png");
        t4.setBounds(24, 384, 96, 120);
        add(t4);

        t5 = new C1_0_OptionMenuMaker1("불땡초", "java_image/kiosk/pepper.png");
        t5.setBounds(144, 384, 96, 120);
        add(t5);

        t6 = new C1_0_OptionMenuMaker1("후라이드", "java_image/kiosk/original.png");
        t6.setBounds(264, 384, 96, 120);
        add(t6);

        // 취소 버튼과 주문담기 버튼
        cancle = new JButton();
        cancle.setText("취소");
        Font font4 = new Font("돋움", Font.BOLD, 26);
        cancle.setFont(font4);
        cancle.setHorizontalAlignment(JButton.CENTER);
        cancle.setBounds(24, 620, 155, 48);
        cancle.addActionListener(this);

        ok = new JButton();
        ok.setText("주문 담기");
        ok.setFont(font4);
        ok.setHorizontalAlignment(JButton.CENTER);
        ok.setBounds(200, 620, 155, 48);
        ok.addActionListener(this);

        // 사진 추가할 것
        add(menu);
        add(price);
        add(bar);
        add(cancle);
        add(ok);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource(); // 눌린 객체를 반환

        // B5_MostBottomPanel B5 = new B5_MostBottomPanel();

        // 맛을 눌렀을 때의 상황들
        if (s == t1) {
        }
        else if (s == t2) {

        }

        if (s == cancle) {
            dispose();
        }

        else if (s == ok) {

            // 메뉴가 담겨야함
            // 가격 레이블 변경(갱신)

            if (menu.getText() == "트리플") {
                m_b5.sendData(25000);
                m_b5.sendMenu("트리플", "25000원");
            }
            else if (menu.getText() == "더블") {
                m_b5.sendData(17000);
                m_b5.sendMenu("더블", "17000원");
            }
            else if (menu.getText() == "싱글") {
                m_b5.sendData(9500);
                m_b5.sendMenu("싱글", "9500원");
            }
            else if (menu.getText() == "컵") {
                m_b5.sendData(5000);
                m_b5.sendMenu("컵", "5000원");
            }
            // m_b5.sendData(5000);


            dispose();
        }

        // 선택과 집중 씹 - 세부메뉴는 걍 무시해?

    }

}
