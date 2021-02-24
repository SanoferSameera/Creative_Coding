import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 648;
    public static final int HEIGHT = 448;
    public static final int DIAMETER = 10;
    int w = 0;
    int x= 0;
    int y= 0;
    int z = 0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        ellipse(w, HEIGHT/5, DIAMETER, DIAMETER);
        w = w+1;
        ellipse(x, HEIGHT*2/5, DIAMETER, DIAMETER);
        x = x+2;
        ellipse(y, HEIGHT*3/5, DIAMETER, DIAMETER);
        y = y+3;
        ellipse(z, HEIGHT*4/5, DIAMETER, DIAMETER);
        z = z+4;
    }

    private void paintWhite() {
    }


}
