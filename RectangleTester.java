/*
 * [A]98
 * [TA's advise]
 * 1.下次請依照作業提供的object properties進行設定及依格式輸出.
 * 2.作業要求要寫getWidth及getHeight進行呼叫計算周長及面積(提交過來的是使用Area()及Perimiter()的function call), 此部分扣2分.
 * 3.作業請另寫一個java檔案, README.md是repository的說明.
 * */

class Rectangle {
	double Height, Width, x, y, Area, Perimiter;

	Rectangle() {
	}

	Rectangle(double _Height, double _Width, double _x, double _y) {
		this.Height = _Height;
		this.Width = _Width;
		this.x = _x;
		this.y = _y;
	}

	double Area() {
		return Height * Width;
	}

	double Perimiter() {
		return Height * 2 + Width * 2;
	}

	public String toString() {
		return "[Height=" + this.Height + " Width=" + this.Width + " y=" + this.y + " x=" + this.x + "]" + "\nArea:"
				+ this.Area + "\nPerrimiter:" + this.Perimiter;
	}
}

public class RectangleTester {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(9, 9, 10, 10);
		Rectangle R2 = new Rectangle(17.5, 12.4, 3, 4);
		R1.Area = R1.Area();
		R1.Perimiter = R1.Perimiter();
		R2.Area = R2.Area();
		R2.Perimiter = R2.Perimiter();
		System.out.println("R1\n" + R1.toString());
		System.out.println("R2\n" + R2.toString());
	}

}
