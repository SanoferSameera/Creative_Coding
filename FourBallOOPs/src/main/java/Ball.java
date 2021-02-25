public class Ball {
    private static FourBallOOP obj;
    private static int diameter;
    private final float dist_from_top;
    private final int speed;
    private int x;

    public Ball(float dist_from_top, int speed) {

        this.dist_from_top = dist_from_top;
        this.speed = speed;
        this.x = 0;
    }
    public static void setObj(FourBallOOP obj){
        Ball.obj = obj;
    }
    public static void setDiameter(int diameter){
        Ball.diameter = diameter;
    }
    public void advance(){
        obj.ellipse(x,dist_from_top,diameter,diameter);
        x = x + speed;
    }
}



