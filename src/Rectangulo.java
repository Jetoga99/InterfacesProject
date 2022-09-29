public class Rectangulo implements Poligonos{
	private String name;
	private double base;
	private double altura;
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
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
		return base*altura;
	}
	@Override
	public double getPerimetro() {
		return 2*base+2*altura;
	}}
	