class Lab491{
public static void main(String args[]){
A aobj=new A();
aobj.setX(99);
System.out.println(aobj.getX());
}
}
class A{
private int x;
public void setX(int x){
	this.x=x;
}
public int getX(){
	return this.x;
}
}