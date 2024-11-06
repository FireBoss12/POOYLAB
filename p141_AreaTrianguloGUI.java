import javax.swing.*;
import java.awt.event.*;

public class p141_AreaTrianguloGUI extends JFrame implements ActionListener {
    private JLabel lblBase, lblAltura, lblResultado;
    private JTextField txtBase, txtAltura;
    private JButton btnCalcular, btnSalir;

    public p141_AreaTrianguloGUI() {
        super("Calcular el área de un triángulo");
        setLayout(null);

        lblBase = new JLabel("Base: ");
        lblBase.setBounds(10, 20, 200, 30);
        add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(80, 20, 200, 30);
        add(txtBase);

        lblAltura = new JLabel("Altura: ");
        lblAltura.setBounds(10, 60, 200, 30);
        add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(80, 60, 200, 30);
        add(txtAltura);

        lblResultado = new JLabel("Área: ");
        lblResultado.setBounds(10, 100, 270, 30);
        add(lblResultado);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 140, 100, 40);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 140, 100, 40);
        btnSalir.addActionListener(this);
        add(btnSalir);

        setTitle("Mi primer programa de Interfaz Gráfica");
        setBounds(0, 0, 300, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public float getArea(float base, float altura) {
        return (base * altura) / 2;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa!!!", "Te vas porque quieres", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (e.getSource() == btnCalcular) { 
                float base = Float.parseFloat(txtBase.getText());
                float altura = Float.parseFloat(txtAltura.getText());
                float area = (base * altura) / 2;
                lblResultado.setText(String.format("Área: %.2f", area));
            } 
        }

    public static void main(String[] args) {
        new p141_AreaTrianguloGUI();
    }
}
