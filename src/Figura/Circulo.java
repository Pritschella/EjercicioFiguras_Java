package Figura;

public class Circulo extends Figura{
	
	//1. Atributos
	double pi;
	double radio;
	
	//Constructor
	Circulo(double pi, double radio){
		this.pi = pi;
		this.radio = radio;
	}//constructor
	
	//3. Metodos (metodo abstracto heredado de Figura)
		@Override
		public double calcularArea() {
			double areaCirculo = pi * (radio*radio);
			return areaCirculo;
		}//metodo calcularArea

}//class
