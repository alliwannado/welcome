public class Car{
	//�ʵ�
	String model;
	int speed;

	//������
	Car(String model){
		this.model = model;
	}

	//�޼ҵ�
	void setSpeed(int speed){
		this.speed = speed;
	}

	void run(){
		for(int i=10;i<=50 ; i+=10){
			setSpeed(i);
			System.out.println(model + "�� ���� �ü�: "+speed);
		}
	}

	//����޼ҵ�(���ǻ� CarŬ���� ���ο��� ����)
	public static void main(String[] args){
		Car myCar = new Car("����");
		myCar.run();
	}
}