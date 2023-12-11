import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class D1_ShowAllMenu extends JDialog implements ActionListener {

    ArrayList<String> m = new ArrayList<>();
    ArrayList<String> c = new ArrayList<>();
    Integer s;

    // ArrayList<JLabel> total = new ArrayList<>();
    JLabel[] num_mer = new JLabel[9];
    JLabel[] cost = new JLabel[9];

    JLabel my_bag, fin_cost;
    JButton ok;
    
    public D1_ShowAllMenu(ArrayList<String> m, ArrayList<String> c, Integer s) {

        setLayout(null);

        Font font1 = new Font("돋움", Font.BOLD, 30);
        Font font2 = new Font("돋움", Font.BOLD, 25);
        Font font3 = new Font("돋움", Font.BOLD, 15);


        // 주문확인 레이블 생성
        my_bag = new JLabel("장바구니 확인");
        my_bag.setFont(font1);
        my_bag.setHorizontalAlignment(JLabel.CENTER);
        my_bag.setBounds(48, 24, 288, 72);
        add(my_bag);

        // 메뉴 목록
        // m = b5.all_menu;
        // c = b5.all_price;
        // s = b5.sum;

        // num_mer[0] = new JLabel();

        int cnt = m.size();
        int pos = 120;

        

        for (int i = 0; i < cnt; i++) {
            String n_m = ((Integer)(i + 1)).toString() + "  " + m.get(i);

            num_mer[i] = new JLabel(n_m);

            num_mer[i].setBounds(24, pos + 48 * i, 216, 36);
            num_mer[i].setFont(font3);
            add(num_mer[i]);

            cost[i] = new JLabel(c.get(i));
            cost[i].setBounds(264, pos + 48 * i, 96, 36);
            cost[i].setFont(font3);
            add(cost[i]);
        }


        // 확인버튼 생성
        ok = new JButton("확인");
        ok.setBounds(264, 600, 96, 72);
        ok.addActionListener(this);
        add(ok);

        // 총 가격
        fin_cost = new JLabel("합계 : " + s.toString() + "원");
        fin_cost.setOpaque(true);
        fin_cost.setBackground(Color.LIGHT_GRAY);
        fin_cost.setFont(font2);
        fin_cost.setBounds(24, 610, 220, 48);
        add(fin_cost);

    }

    public void actionPerformed(ActionEvent e) {
        // JButton s = (JButton) e.getSource(); // 눌린 객체를 반환
        dispose();

    }
}
