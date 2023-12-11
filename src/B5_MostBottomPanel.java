import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class B5_MostBottomPanel extends JPanel implements ActionListener {

    JLabel m1, m2, m3, m4;
    ArrayList<JLabel> all_position = new ArrayList<>();
    JLabel n1, n2, n3, n4;
    ArrayList<JLabel> all_num = new ArrayList<>();

    JLabel cost, st_cost; // cost는 틀, ch_cost가 변하는 가격
    public JLabel ch_cost;
    JButton bag, pay;
    Integer sum = 0;    // 매번 갱신되면 static붙이기

    ArrayList<String> all_menu = new ArrayList<>();
    ArrayList<String> all_price = new ArrayList<>();
    int idx = -1;

    D1_ShowAllMenu d1;
    D2_FinishCalc d2;

    public B5_MostBottomPanel() {
        setLayout(null);

        // setBackground(Color.MAGENTA);

        // 한번에 최대 4개의 메뉴를 보여줌 - 개수
        n1 = new JLabel();
        n1.setBounds(24, 14, 24, 24);
        all_num.add(n1);
        add(n1);

        n2 = new JLabel();
        n2.setBounds(24, 50, 24, 24);
        all_num.add(n2);
        add(n2);

        n3 = new JLabel();
        n3.setBounds(24, 86, 24, 24);
        all_num.add(n3);
        add(n3);

        n4 = new JLabel();
        n4.setBounds(24, 122, 24, 24);
        all_num.add(n4);
        add(n4);


        // 한번에 최대 4개의 메뉴를 보여줌 - 메뉴
        m1 = new JLabel();
        m1.setBounds(60, 14, 288, 24);
        all_position.add(m1);
        add(m1);

        m2 = new JLabel();
        m2.setBounds(60, 50, 288, 24);
        all_position.add(m2);
        add(m2);

        m3 = new JLabel();
        m3.setBounds(60, 86, 288, 24);
        all_position.add(m3);
        add(m3);

        m4 = new JLabel();
        m4.setBounds(60, 122, 288, 24);
        all_position.add(m4);
        add(m4);

        Font font = new Font("돋움", Font.BOLD, 12);



        // 가격 표시 레이블 만들기
        cost = new JLabel(); // 틀
        cost.setLayout(null);
        cost.setBounds(312, 24, 144, 36);


        // 내부 레이블 1 - 고정된 텍스트
        st_cost = new JLabel("가격");
        st_cost.setFont(font);
        cost.add(st_cost); // cost내에서의 위치 선정
        st_cost.setBounds(0, 0, 48, 36);

        // 내부 레이블 2 - 가격 변동
        ch_cost = new JLabel();
        
        ch_cost.setOpaque(true);
        ch_cost.setBackground(Color.lightGray);

        cost.add(ch_cost); // cost내에서의 위치 선정
        cost.setFont(font);
        ch_cost.setBounds(48, 0, 96, 36);

        // 패널에서의 위치

        add(cost);

        // 장바구니 버튼 만들기
        bag = new JButton("내역");
        bag.setBounds(312, 72, 60, 72);
        bag.setFont(font);
        bag.addActionListener(this);

        // 결제버튼 만들기
        pay = new JButton("결제");
        pay.setBounds(384, 72, 72, 72);
        pay.setFont(font);
        pay.addActionListener(this);

        add(bag);
        add(pay);

    }

    // 타 클래스에서 데이터 받기 대작전!!
    public void sendData(Integer c) {
        sum += c;
        ch_cost.setText("  " + sum.toString());
        ch_cost.updateUI();
    }

    // 메뉴를 화면에 출력
    public void sendMenu(String m, String c) {
        all_menu.add(m);
        all_price.add(c);
        idx++;
        Integer cnt = idx + 1;
        int temp = idx;

        // 메뉴 번호 출력
        if (idx == 0) {
            all_num.get(0).setText(cnt.toString());
        }
        else if (idx == 1) {
            all_num.get(0).setText(cnt.toString());
            all_num.get(1).setText(((Integer)(cnt - 1)).toString());
        }
        else if (idx == 2) {
            all_num.get(0).setText(cnt.toString());
            all_num.get(1).setText(((Integer)(cnt - 1)).toString());
            all_num.get(2).setText(((Integer)(cnt - 2)).toString());
        }
        else if (idx > 2) {
            all_num.get(0).setText(cnt.toString());
            all_num.get(1).setText(((Integer)(cnt - 1)).toString());
            all_num.get(2).setText(((Integer)(cnt - 2)).toString());            
            all_num.get(3).setText(((Integer)(cnt - 3)).toString());
        }
       
        Font font = new Font("돋움", Font.BOLD, 16);

        // 메뉴 출력
        for (int i = 0; i < 4; i++) {
            if (temp < 0) {
                break;
            }

            all_position.get(i).setText(all_menu.get(temp));
            temp--;
        }
        
    }

    public void actionPerformed(ActionEvent e) {
        JButton s = (JButton) e.getSource();

        if (s == bag) {
            d1 = new D1_ShowAllMenu(all_menu, all_price, sum);
            d1.setBounds(48, 72, 384, 720);
            d1.setVisible(true);
        }

        else if (s == pay) {
            d2 = new D2_FinishCalc();
            d2.setBounds(48, 72, 384, 720);
            d2.setVisible(true);
        }
    }

}
