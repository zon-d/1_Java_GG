package edu.kh.poly.ex1.model.vo;

public class Truck extends Car{

	private double weight; // 적재량
	
	public Truck() {
		// super(); // super() 생성자 미작성 시 컴파일러가 추가
	}
	
	public Truck(int wheel, int seat, String fuel, double weigth) {
		
		super(wheel, seat, fuel);
		this.weight = weigth;
	}

	// getter / setter
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
