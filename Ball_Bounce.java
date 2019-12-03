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
    
    private void moveBall(){
        x = x +1;
        y = y +1; 
    }
    @Override
    public void print(Graphincs g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setReaderingHint(ReaderingHints.key_ANTIALIASING)
    }
