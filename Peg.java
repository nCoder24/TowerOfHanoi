import javax.swing.JPanel;
import java.awt.*;

public class Peg extends JPanel {
    
    private DiskContainer diskContainers[];
    private int top;
    private int size;

    Peg(int size) {
        this.size = size;
        top = -1;
        diskContainers = new DiskContainer[size];

        setLayout(new GridLayout(size, 1));

        for (int i = size-1; i >= 0; i--) {
            diskContainers[i] = new DiskContainer(size);
            add(diskContainers[i]);
        }
    }

    Disk getTopDisk() {
        if (top == -1) return null;
        return diskContainers[top].getDisk();
    }

    void reset() {
        for (DiskContainer container : diskContainers) container.removeDisk();
    }

    void fill() {
        for (int i = size-1; i >= 0; i--) push(new Disk(i+1));
    }

    boolean isPlaceable(Disk disk) {
        if (top == -1) return true;
        return diskContainers[top].getDisk().getNumber() > disk.getNumber();
    }

    void push(Disk disk) {
        top++;
        diskContainers[top].setDisk(disk);
        diskContainers[top].repaint();
    }

    void pop() {
        diskContainers[top].removeDisk();
        diskContainers[top].repaint();
        top--;
    }
}
