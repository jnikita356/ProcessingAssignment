import processing.core.PApplet;

public class Box implements Shape{
    int xposition;
    int yposition;
    int side;
    int increment;
    Box(int xposition,int yposition,int side, int increment){
        this.xposition=xposition;
        this.yposition=yposition;
        this.side=side;
        this.increment=increment;
    }
    public void setSpeed(){
        xposition=xposition+increment;
    }
    public void display(MySketch mysketch){
        mysketch.rect(xposition,yposition,side,side);
        setSpeed();
        
    }
}
