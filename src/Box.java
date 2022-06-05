import processing.core.PApplet;

public class Box implements Shape{
    int xposition;
    int yposition;
    int side;
    Box(int xposition,int yposition,int side){
        this.xposition=xposition;
        this.yposition=yposition;
        this.side=side;
    }
    public void setSpeed(){
    }
    public void display(MySketch mysketch){
        mysketch.rect(xposition,yposition,side,side);
        
    }
}
