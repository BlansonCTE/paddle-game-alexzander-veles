import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.jPanel;
@SuppressWarnings("serial")
public class Ball_Bounce extends JPanel{
    //Initaialize ball position
    int x = 0;
    int y = 0;
    int xd = -1
    int yd = -1
    
    private void moveBall(){
        x = x +1;
        y = y +1; 
    }
    @Override
    public void print(Graphincs g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setReaderingHint(RenderingHints.key_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.fillOval(x, y, 60, 60);
    }
    public static void main(String[] args) throws InterriptedException{
        JFrame frame = new JFrame("mini tennis");
        Ball_Bounce game = new Ball_Bounce();
        frame.add(game);
        frame.setSize(1400,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true){
            game.moveBall_Bounce();
            game.repaint();
            Thread.sleep(10)

        }
    }
}