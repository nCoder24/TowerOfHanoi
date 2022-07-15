import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlePanel extends JPanel {
    public JTextField from;
    public JTextField to;
    public JButton move;
    // public JButton solve;
    public JButton reset;

    ControlePanel(Game g) {
        from = new JTextField(5);
        to = new JTextField(5);
        move = new JButton("Move");
        reset = new JButton("Reset");
        // solve = new JButton("Solve");

        add(from);
        add(to);
        add(move);
        add(reset);
        // add(solve);

        move.addActionListener(g);
        reset.addActionListener(g);
    }
}
