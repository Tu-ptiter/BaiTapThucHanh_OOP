package Bai02;

public class Rectangle {
    private int width;
    private int height;


    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    public int getPerimeter(){
        return 2 * (width+height);
    }
    public int getArea(){
        return (width*height);
    }
}
