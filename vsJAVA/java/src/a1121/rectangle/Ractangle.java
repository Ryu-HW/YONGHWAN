package a1121.rectangle;

public class Ractangle {

    public int w = 0;
    public int h = 0;

    public Ractangle(int w, int h){
        this.w = w;
        this.h = h;
    
    }

    public Ractangle(){
    }

    public Ractangle(int w){
        this.w = w;
        this.h = w;
    }


	public int recArea(int w,int h) {
        int area = w*h;

        return area;
        
	}
	public int recArea() {
        int area = w*h;

        return area;
	}
    
	public int recArea(int w) {
        int area = w*w;

        return area;
	}
    
    public int getPerimeter(int w,int h){
        int perimeter = (2*w)+(2*h);
        return perimeter;
    }
}
