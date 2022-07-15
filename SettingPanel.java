import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SettingPanel extends JPanel {
    public JTextField noOfDisks;
    public JButton play;

    SettingPanel(Game g) {
        noOfDisks = new JTextField(5);
        play = new JButton("Play");
        play.addActionListener(g);

        add(noOfDisks);
        add(play);
    }
}
