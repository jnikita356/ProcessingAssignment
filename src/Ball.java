public class Ball implements Shape{
    int speed;
    int height;
    int radius;
    int increment;
    Ball(int speed,int height,int radius,int increment){
        this.speed=speed;
        this.height=height;
        this.radius=radius;
        this.increment=increment;
    }
    @Override
    public void setSpeed(){
        this.speed=this.speed+this.increment;
    }
    @Override
    public void display(MySketch mysketch) {
        mysketch.ellipse(speed,height,radius,radius);
        setSpeed();
    }
}
