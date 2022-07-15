import javax.swing.JPanel;
import java.awt.*;

public class MainPanel extends JPanel {
    Peg[] pegs;
    MainPanel(int noOfDisks) {
        setLayout(new GridLayout(1, 3));
        pegs = new Peg[3];
        for (int i = 0; i < 3; i ++) {
            pegs[i] = new Peg(noOfDisks);
            add(pegs[i]);
        }
        pegs[0].fill();
    }
}