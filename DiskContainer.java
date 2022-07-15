import javax.swing.JPanel;
import java.awt.*;

public class DiskContainer extends JPanel {
    private Disk disk;

    DiskContainer(int maxDiskSize) {
        setPreferredSize(new Dimension(maxDiskSize*30, 20));
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
    }

    Disk getDisk() {
        return disk;
    }

    Disk removeDisk() {
        remove(disk);
        return disk;
    }

    void setDisk(Disk d) {
        disk = d;
        add(disk);
    }
}
