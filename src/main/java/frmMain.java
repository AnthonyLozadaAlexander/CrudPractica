import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;
/*
 * Created by JFormDesigner on Sun Jan 18 04:33:08 ECT 2026
 */



/**
 * @author USUARIO
 */
public class frmMain extends JFrame {
    public frmMain() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
        Componentes = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        txtNombre = new JTextField();
        txtApPaterno = new JTextField();
        txtApMaterno = new JTextField();
        label5 = new JLabel();
        txtEdad = new JTextField();
        label6 = new JLabel();
        txtID = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        scrollPane1 = new JScrollPane();
        tbUsuarios = new JTable();
        scrollPane2 = new JScrollPane();
        txtHistorial = new JTextArea();

        //======== this ========
        setName("this");
        var contentPane = getContentPane();

        //======== Componentes ========
        {
            Componentes.setName("Componentes");

            //---- label1 ----
            label1.setText("Datos Usuario");
            label1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 16));
            label1.setName("label1");

            //---- label2 ----
            label2.setText("Nombre:");
            label2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 16));
            label2.setName("label2");

            //---- label3 ----
            label3.setText("Apellido Paterno:");
            label3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 16));
            label3.setName("label3");

            //---- label4 ----
            label4.setText("Apellido Materno:");
            label4.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 16));
            label4.setName("label4");

            //---- txtNombre ----
            txtNombre.setName("txtNombre");

            //---- txtApPaterno ----
            txtApPaterno.setName("txtApPaterno");

            //---- txtApMaterno ----
            txtApMaterno.setName("txtApMaterno");

            //---- label5 ----
            label5.setText("Edad:");
            label5.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 16));
            label5.setName("label5");

            //---- txtEdad ----
            txtEdad.setName("txtEdad");

            //---- label6 ----
            label6.setText("ID:");
            label6.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 16));
            label6.setName("label6");

            //---- txtID ----
            txtID.setName("txtID");

            //---- button1 ----
            button1.setText("Guardar");
            button1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 14));
            button1.setName("button1");

            //---- button2 ----
            button2.setText("Modificar");
            button2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 14));
            button2.setName("button2");

            //---- button3 ----
            button3.setText("Editar");
            button3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 14));
            button3.setName("button3");

            //---- button4 ----
            button4.setText("Eliminar");
            button4.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 14));
            button4.setName("button4");

            //---- button5 ----
            button5.setText("Buscar");
            button5.setFont(new Font("CaskaydiaMono NF SemiBold", Font.BOLD, 14));
            button5.setName("button5");

            GroupLayout ComponentesLayout = new GroupLayout(Componentes);
            Componentes.setLayout(ComponentesLayout);
            ComponentesLayout.setHorizontalGroup(
                ComponentesLayout.createParallelGroup()
                    .addGroup(ComponentesLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(ComponentesLayout.createParallelGroup()
                            .addComponent(label6)
                            .addComponent(label1)
                            .addComponent(txtID, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2)
                            .addComponent(label3)
                            .addComponent(txtApPaterno, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4)
                            .addComponent(txtApMaterno, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5)
                            .addGroup(ComponentesLayout.createSequentialGroup()
                                .addGroup(ComponentesLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button1))
                                .addGap(18, 18, 18)
                                .addGroup(ComponentesLayout.createParallelGroup()
                                    .addComponent(button2)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(41, Short.MAX_VALUE))
            );
            ComponentesLayout.setVerticalGroup(
                ComponentesLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, ComponentesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(label1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label2)
                        .addGap(0, 0, 0)
                        .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label3)
                        .addGap(7, 7, 7)
                        .addComponent(txtApPaterno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApMaterno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ComponentesLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ComponentesLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button3)
                            .addGroup(ComponentesLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
            );
        }

        //======== scrollPane1 ========
        {
            scrollPane1.setName("scrollPane1");

            //---- tbUsuarios ----
            tbUsuarios.setModel(new DefaultTableModel(2, 0));
            tbUsuarios.setName("tbUsuarios");
            scrollPane1.setViewportView(tbUsuarios);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setName("scrollPane2");

            //---- txtHistorial ----
            txtHistorial.setName("txtHistorial");
            scrollPane2.setViewportView(txtHistorial);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(Componentes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane2))
                    .addGap(0, 17, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(Componentes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Daniel Sanchez (Anthony Lozada)
    private JPanel Componentes;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField txtNombre;
    private JTextField txtApPaterno;
    private JTextField txtApMaterno;
    private JLabel label5;
    private JTextField txtEdad;
    private JLabel label6;
    private JTextField txtID;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JScrollPane scrollPane1;
    private JTable tbUsuarios;
    private JScrollPane scrollPane2;
    private JTextArea txtHistorial;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
