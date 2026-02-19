import com.formdev.flatlaf.FlatLightLaf;

public class run {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        frmMain window = new frmMain();
        window.setTitle("Formulario De Registro");
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }
}
