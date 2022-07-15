import java.awt.BorderLayout;
import javax.swing.JFrame;

public class TohFrame extends JFrame {
    private MainPanel mainPanel;
    private SettingPanel settingPanel;
    private ControlePanel controlePanel;

    TohFrame(Game g) {
        settingPanel = new SettingPanel(g);
        add(settingPanel, BorderLayout.NORTH);

        controlePanel = new ControlePanel(g);
        add(controlePanel, BorderLayout.SOUTH);
        controlePanel.setVisible(false);

        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public SettingPanel getSettingPanel() {
        return settingPanel;
    }

    public ControlePanel getControlePanel() {
        return controlePanel;
    }

    public void setMainPanel(MainPanel mainPanel) {
        this.mainPanel = mainPanel;
        add(mainPanel);
    }
}
