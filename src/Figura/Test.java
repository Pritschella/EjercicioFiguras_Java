package Figura;

public class Test {

	public static void main(String[] args) {
		
		
		//Generar las instancias de nuestras clases
		
		//1. Instancia de la clase Figura
		//Figura Generica = new Figura();
		
		//2. Instancia de un rectangulo
		Figura rectangulo = new Rectangulo(5.0, 6.5);
		
		//3. Instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);
		
		//4. Invocación del método
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularArea());

	}//main

}//class
