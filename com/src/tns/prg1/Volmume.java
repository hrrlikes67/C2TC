package tns.prg1;

public class Volmume {
int vol(int r) {
	int vol=r*r*r;
	return vol;
}
int vol(int l,int b,int h) {
	int vol=l*b*h;
	return vol;
}
double vol(double r) {
	double vol=(4/3)*3.14*r*r;
	return vol; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Volmume obj=new Volmume();
System.out.println("cube:"+obj.vol(5));
System.out.println("cuboid:"+obj.vol(5,6,1));
System.out.println("sphere:"+obj.vol(5));
	}

}
