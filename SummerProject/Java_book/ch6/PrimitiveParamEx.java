package ch6;
// 기본형 매개변수 (change메서드의 int x)는 변수의 값을 읽기만 할 수 있다.
class Data {int x;}


class PrimitiveParamEx {
	public static void main (String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+ d.x);
		
		
		
		
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
