#thank you
# IM1_404530024
資管一 余士綸

 class Rectangle {
double Height,Width,x,y,Area,Perimiter;
Rectangle(){}
Rectangle(double _Height,double _Width,double _x,double _y){
	this.Height=_Height;
	this.Width=_Width;
	this.x=_x;
	this.y=_y;
}
double Area(){return Height*Width;}
double Perimiter(){return Height*2+Width*2;}
public String toString(){
	return "[Height="+this.Height+" Width="+this.Width+" y="+this.y+" x="+this.x+"]"
			+"\nArea:"+this.Area+"\nPerrimiter:"+this.Perimiter;}
}
public class RectangleTester {

	public static void main(String[] args) {
		Rectangle R1=new Rectangle(9,9,10,10);
        Rectangle R2=new Rectangle(17.5,12.4,3,4);
        R1.Area=R1.Area();
        R1.Perimiter=R1.Perimiter();
        R2.Area=R2.Area();
        R2.Perimiter=R2.Perimiter();
        System.out.println("R1\n"+R1.toString());
        System.out.println("R2\n"+R2.toString());
	}

}
