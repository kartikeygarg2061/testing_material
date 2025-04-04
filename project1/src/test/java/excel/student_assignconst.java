package excel;

public class student_assignconst {
	
	static int sid;
	static int maths;
	static int phy;
	
	public student_assignconst(int sid, int maths, int phy) {
		this.sid = sid;
		this.maths = maths;
		this.phy = phy;
	}
	
	public int average() {
		return (maths+phy)/2;
	}
}
