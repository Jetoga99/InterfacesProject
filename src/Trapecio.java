public class Trapecio implements Poligonos {
	private String name;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double bMayor;
	private double bMenor;
	private double altura;
	public Trapecio(String name, double lado1, double lado2, double lado3, double lado4, double bMayor, double bMenor,
			double altura) {
		super();
		this.name = name;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.bMayor = bMayor;
		this.bMenor = bMenor;
		this.altura = altura;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getLado4() {
		return lado4;
	}
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	public double getbMayor() {
		return bMayor;
	}
	public void setbMayor(double bMayor) {
		this.bMayor = bMayor;
	}
	public double getbMenor() {
		return bMenor;
	}
	public void setbMenor(double bMenor) {
		this.bMenor = bMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lado1+lado2+lado3+lado4;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (altura*bMayor*bMenor)/2;
	}}
	