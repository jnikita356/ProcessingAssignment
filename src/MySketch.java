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
        for(int i=0;i<5;i++){
            if(i%2==0){
                listofshapes.add(new Ball(x,(HEIGHT*(i+1))/6,20,i+1));
            }
            else{
                listofshapes.add(new Box(x,(HEIGHT*(i+1))/6,20,i+1));
            }
        }
    }
    @Override
    public void draw(){
        for(Shape s:listofshapes){
            s.display(this);
        }
    }
}
