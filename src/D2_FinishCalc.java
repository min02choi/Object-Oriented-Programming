import javax.swing.JDialog;
import javax.swing.JLabel;

public class D2_FinishCalc extends JDialog {
    
    JLabel jl;

    D2_FinishCalc() {
        setLayout(null);
        jl = new JLabel("결제가 완료되었습니다.");
        jl.setBounds(20, 30, 200, 50);
        add(jl);

        
    }
}
