public class Ball implements Shape{
    int speed;
    int height;
    int radius;
    Ball(int speed,int height,int radius){
        this.speed=speed;
        this.height=height;
        this.radius=radius;
    }
    @Override
    public void setSpeed(){

    }
    @Override
    public void display(MySketch mysketch) {
        mysketch.ellipse(speed(),height,radius,radius);
    }
}
