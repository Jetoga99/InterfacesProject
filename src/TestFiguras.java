public class TestFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Triangulo",20,10,15);
		Cuadrado c1 = new Cuadrado("Cuadrado",127);
		Rectangulo r1 = new Rectangulo("Rectangulo",10,30);
		Rombo ro1 = new Rombo("Rombo",250,10,20);
		Romboide rom1 = new Romboide("Romboide",10,8);
		Trapecio tra1 = new Trapecio("Trapecio",1,2,3,4,5,6,7);
		
		imprimirCalculo(t1);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
		imprimirCalculo(ro1);
		imprimirCalculo(rom1);
		imprimirCalculo(tra1);
	}
	public static void imprimirCalculo(Poligonos t) {
		System.out.println("+=================================");
		System.out.println("|El área de ["+t.getName()+"] es "+t.getArea()
		+"/n"+"|perimetro de ["+t.getName()+"] es "+t.getPerimetro());
		System.out.println("+===================================");

	}

}