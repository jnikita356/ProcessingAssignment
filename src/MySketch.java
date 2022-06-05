import processing.core.PApplet;

import java.util.ArrayList;

public class MySketch extends PApplet {
    int x=0,HEIGHT=800;
    ArrayList<Shape> listofshapes = new ArrayList<>();
    public static void main(String[] args){
        PApplet.main("MySketch",args);
    }
    @Override
    public void settings(){
        size(800,800);
    }
    @Override
    public void setup(){
        int x=0;
        listofshapes.add(new Ball(0,HEIGHT/4,20));
        listofshapes.add(new Box(0,HEIGHT*2/4,20));
        listofshapes.add(new Ball(0,HEIGHT*3/4,20));
    }
    @Override
    public void draw(){
        for(Shape s:listofshapes){
            s.display(this);
        }
    }
}
