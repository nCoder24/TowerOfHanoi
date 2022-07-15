import java.awt.event.*;

public class Game implements ActionListener{
    private int noOfDisks;
    private TohFrame frame;
    
    Game() {
        frame = new TohFrame(this);
    }

    boolean move(Peg from, Peg to) {
        Disk disk = from.getTopDisk();
        if (disk == null || !to.isPlaceable(disk)) return false;
        from.pop();
        to.push(disk);
        return true;
    }

    void play() {
        if (frame.getMainPanel() != null) {
            frame.remove(frame.getMainPanel());
            frame.getMainPanel().invalidate();
        }
        frame.setMainPanel(new MainPanel(noOfDisks));
        frame.getControlePanel().setVisible(true);
        frame.pack();
    }

    public void actionPerformed(ActionEvent click) {
        if (click.getSource() == frame.getSettingPanel().play) {
            noOfDisks = Integer.parseInt(frame.getSettingPanel().noOfDisks.getText());
            play();
        }
        if (click.getSource() == frame.getControlePanel().move) {
            int fromIndex = Integer.parseInt(frame.getControlePanel().from.getText())-1;
            int toIndex = Integer.parseInt(frame.getControlePanel().to.getText())-1;
            move(frame.getMainPanel().pegs[fromIndex], frame.getMainPanel().pegs[toIndex]);
        }
        if (click.getSource() == frame.getControlePanel().reset) {
            play();
        }
    }
}
