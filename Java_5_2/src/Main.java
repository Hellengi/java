import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);
        Drawing drawing = new Drawing();
        frame.add(drawing);
        frame.setVisible(true);
    }
}