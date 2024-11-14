package p147_TercerExamenParcial;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercaDe;
    JDialog jdlAcercaDe;
    JLabel lblDatos;
    JTable table;
    JScrollPane spane;
    DefaultTableModel modelo;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JLabel lblNombre, lblEdad, lblSexo, lblestadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtestadoCivil, txtDescripcion, txtSalario;
    JButton btnAgregar, btnGrabar;
    JFileChooser fchArchivo;

    public App() {
        super("Registro de Jugadores");
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAbrir = new JMenuItem("Abrir");
        mnuArchivo.add(smnAbrir);
        smnAbrir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        smnSalir = new JMenuItem("Salir");
        mnuArchivo.add(smnSalir);
        smnSalir.addActionListener(this);
        smnAcercaDe = new JMenuItem("Acerca de ...");
        mnuAyuda.add(smnAcercaDe);
        smnAcercaDe.addActionListener(this);

        jdlAcercaDe = new JDialog(this, "Acerca de...");
        jdlAcercaDe.setSize(400, 250);
        jdlAcercaDe.setModal(true);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html> Programación Orientada a Objetos I<br>Francisco Valdez García<br> franciscovalgar07@gmail.com</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1));
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.green);
        table.getTableHeader().setForeground(Color.blue);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"});
        table.setModel(modelo);

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 2, 0, 0));
        lblNombre = new JLabel("Nombre:");
        lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad:");
        lblEdad.setHorizontalAlignment(SwingConstants.CENTER);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblSexo = new JLabel("Sexo:");
        lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        lblestadoCivil = new JLabel("Estado Civil:");
        lblestadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
        txtestadoCivil = new JTextField();
        pnlDatos.add(lblestadoCivil);
        pnlDatos.add(txtestadoCivil);
        lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        lblSalario = new JLabel("Salario:");
        lblSalario.setHorizontalAlignment(SwingConstants.CENTER);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);

        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void mostrarDatos(int ren) {
        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString(datos.get(ren).getEdad()));
        txtSexo.setText(Character.toString(datos.get(ren).getSexo()));
        txtestadoCivil.setText(datos.get(ren).getEstadoCivil());
        txtDescripcion.setText(datos.get(ren).getDescripcion());
        txtSalario.setText(Double.toString(datos.get(ren).getSalario()));
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        while (dm.getRowCount() > 0) dm.removeRow(0);
        Object[] obj = new Object[6];
        for (int i = 0; i < datos.size(); i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getSexo();
            obj[3] = datos.get(i).getEstadoCivil();
            obj[4] = datos.get(i).getDescripcion();
            obj[5] = datos.get(i).getSalario();
            modelo.addRow(obj);
        }
    }

    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                cp.setEnabled(actdes);
    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                ((JTextField) cp).setText("");
    }

    public void guardarCampos() {
        Jugador jugador = new Jugador();
        jugador.setNombre(txtNombre.getText());
        jugador.setEdad(Integer.parseInt(txtEdad.getText()));
        jugador.setSexo(txtSexo.getText().charAt(0)); 
        jugador.setEstadoCivil(txtestadoCivil.getText());
        jugador.setDescripcion(txtDescripcion.getText());
        jugador.setSalario(Double.parseDouble(txtSalario.getText()));
        datos.add(jugador);
        cargarDatos();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) dispose();
        else if (e.getSource() == smnAcercaDe) jdlAcercaDe.setVisible(true);
        else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        } else if (e.getSource() == smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                if (!archivo.getName().endsWith(".dat")) {
                    archivo = new File(archivo.getAbsolutePath() + ".dat");
                }
                try {
                    Util.grabarDatos(archivo.getAbsolutePath(), datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " + archivo.getAbsolutePath(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                try {
                    datos = Util.leerDatos(archivo.getAbsolutePath());
                    cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(0, 0, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();  
        app.activarCampos(false);
    }
}

