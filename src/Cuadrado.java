public class Cuadrado implements Poligonos{
	private String name;
	private double lado;
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}}
	
