package Figura;


//Clase abstracta que implementa métodos de una interfaz llamada Calculable
public class Esfera implements Calculable{
	
	//Completar con las instrucciones
	
	//Atributos
	double radio;
	double pi;
	
	@Override
	public double calcularArea() {
		//A = 4 π r*r
		double area = (4*Math.PI)*(radio*radio);
		return area;
	}

	@Override
	public double calcularVolumen() {
		//Volumen V = 4/3 π r³
		double volumen = ((4/3)*Math.PI)*(Math.pow(radio, 3));
		return volumen;
	}

	@Override
	public double calcularPerimetro() {
		//P = 2 * π * r
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

}//class
