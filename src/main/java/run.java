import com.formdev.flatlaf.FlatLightLaf;

public class run {

    public static void main(String[] args) {
        frmMain window = new frmMain();
        FlatLightLaf.setup();
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }
}
