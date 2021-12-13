public class Car{
	//필드
	String model;
	int speed;

	//생성자
	Car(String model){
		this.model = model;
	}

	//메소드
	void setSpeed(int speed){
		this.speed = speed;
	}

	void run(){
		for(int i=10;i<=50 ; i+=10){
			setSpeed(i);
			System.out.println(model + "의 현재 시속: "+speed);
		}
	}

	//실행메소드(편의상 Car클래스 내부에서 실행)
	public static void main(String[] args){
		Car myCar = new Car("벤츠");
		myCar.run();
	}
}