import processing.core.PApplet;
public class FourBallOOP extends PApplet{

    private static final int height = 448;
    private static final int width = 648;
    private static final int DIAMETER = 10;
    Ball balls[]= new Ball[4];

    public static void main(String[] args) {
        PApplet.main("FourBallOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }

    @Override
    public void setup() {
        Ball.setObj(this);
        Ball.setDiameter(DIAMETER);
        balls[0] = new Ball(height/5,1);
        balls[1] = new Ball(height*2/5,2);
        balls[2] = new Ball(height*3/5,3);
        balls[3] = new Ball(height*4/5,4);
    }

    @Override
    public void draw() {
        for(Ball ball:balls)
            ball.advance();
    }

}
