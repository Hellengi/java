import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Drawing extends JComponent {
    @Override
    protected void paintComponent(Graphics g){
        for(int x = 0; x< 20; x++){
            Random random = new Random(System.nanoTime());
            int fig = random.nextInt(2);
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            if(fig == 0){
                g.fillOval(random.nextInt(10, 530), random.nextInt(10, 370), random.nextInt(10, 100), random.nextInt(10, 100));
            }
            else {
                g.fillRect(random.nextInt(10, 530), random.nextInt(10, 370), random.nextInt(10, 100), random.nextInt(10, 100));
            }
        }
    }
}
