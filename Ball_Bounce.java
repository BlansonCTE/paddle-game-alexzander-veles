import java.awat.Graphics2D;
class Ball_Bounce{

    //Initaialize ball position
    int x = 0, y = 0; xVelocity=1, yVelocity=1

    private static final int Diameter = 30;
    private Game game;

    public Ball_Bounce(Game game){
        this.game=game;
    }
    Void moveBall_Bounce(){
        if (x + xVelocity > game.getWidth()-DIAMETER)
            xVelocity =-1
        else if (x<0)
            xVelocity =1
            if (y + yVelocity > game.getHeight()-DIAMETER)
                y
    }
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