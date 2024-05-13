import javax.swing.*;
import java.awt.*;

public class VistaRestaurante {
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JTextArea textArea;

    public VistaRestaurante() {
        frame = new JFrame("Restaurante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        comboBox = new JComboBox<>();
        frame.getContentPane().add(comboBox, BorderLayout.NORTH);

        textArea = new JTextArea();
        frame.getContentPane().add(textArea, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void agregarRestaurante(String nombre) {
        comboBox.addItem(nombre);
    }

    public void mostrarMenu(String menu) {
        textArea.setText(menu);
    }

    public void mostrarNombre(String nombre) {
        frame.setTitle("Restaurante: " + nombre);
    }

    public JComboBox<String> getComboBox() {
        return comboBox;
    }
}