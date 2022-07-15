import javax.swing.JButton;
import java.awt.*;

public class Disk extends JButton {
    private int number;

    public int getNumber() {
        return number;
    }

    Disk(int number) {
        this.number = number;
        setPreferredSize(new Dimension(number*30, 20));
    }
}
